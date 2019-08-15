package com.yc.favorite.biz;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.favorite.bean.Favorite;
import com.yc.favorite.bean.FavoriteExample;
import com.yc.favorite.bean.Tags;
import com.yc.favorite.bean.TagsExample;
import com.yc.favorite.bean.Tf;
import com.yc.favorite.bean.TfExample;
import com.yc.favorite.dao.FavoriteMapper;
import com.yc.favorite.dao.TagsMapper;
import com.yc.favorite.dao.TfMapper;

@Service
@Transactional(rollbackFor=BizException.class)
public class FavoriteBiz {
	@Resource
	private FavoriteMapper fm;
	@Autowired
	private TagsMapper tm;	
	@Resource
	private TfMapper tfm;
	
	public List<Favorite> findByid(Integer id) {
		FavoriteExample example = new FavoriteExample();
		example.createCriteria().andIdEqualTo(id);
		List<Favorite> favorite1 = fm.selectByExample(example);
		return favorite1;
	}

	public void updateFavorite(Favorite f) throws BizException {
		FavoriteExample fe = new FavoriteExample();
		fe.createCriteria().andIdEqualTo(f.getId());	
		Favorite favorite1 = fm.selectByExample(fe).get(0);
			if (((f.getfLabel().equals(favorite1.getfLabel())) && (f.getfDesc().equals(favorite1.getfDesc()))
					&& (f.getfUrl().equals(favorite1.getfUrl()))) != true) {
				fm.updateByPrimaryKey(f);
			}
			if (Arrays.equals(f.getfTags().split("[,，；;]"), favorite1.getfTags().split("[,，；;]")) != true) {
				if (f.getfTags().trim().length() > 0) {
					String[] tags = f.getfTags().split("[,，；;]");
					List<String> oldtags = Arrays.asList(favorite1.getfTags().split("[,，；;]"));
					List<String> newtags = Arrays.asList(tags);
					for (String oldtag : oldtags) {
						// 找出现在没有的tag 及要删除的tag
						if (newtags.contains(oldtag) != true) {
							// 删tf表 修改tag表的count
							TfExample tfe = new TfExample();
							TagsExample te = new TagsExample();
							te.createCriteria().andTNameEqualTo(oldtag);
							Tags ts = tm.selectByExample(te).get(0);
							tfe.createCriteria().andFidEqualTo(f.getId()).andTidEqualTo(ts.getId());
							tfm.deleteByExample(tfe);
							ts.settCount(ts.gettCount() - 1);// count减一
							tm.updateByPrimaryKey(ts);
						}
					}
					for (String newtag : newtags) {
						// 找出以前没有的tag 及要增加的tag
						if (oldtags.contains(newtag) != true) {
							// 增加tf表 检查是否tag表是否有tag没有新增 有就tag的count+1
							TagsExample te = new TagsExample();
							te.createCriteria().andTNameEqualTo(newtag);
							List<Tags> list = tm.selectByExample(te);
							Tags t;
							if (list.size() > 0) {
								t = list.get(0);
								t.settCount(t.gettCount() + 1);
								tm.updateByPrimaryKey(t);
							} else {
								t = new Tags();
								t.settName(newtag);
								t.settCount(1);
								tm.insert(t);
							}
							Tf tf = new Tf();
							tf.setFid(f.getId());
							tf.setTid(t.getId());
							tfm.insert(tf);
						}
					}
				}
			}
		
	}
	public void addFavorite(Favorite f) throws BizException {
		if(f.getfLabel() == null || f.getfLabel().trim().length()==0) {
			throw new BizException("未填写网址名称");
		}
			fm.insert(f);
			if(f.getfTags().trim().length()>0) {
				String [] tags = f.getfTags().split("[,，；;]");
				for(String tag : tags) {
					TagsExample te = new TagsExample();
					te.createCriteria().andTNameEqualTo(tag);
					List<Tags> list = tm.selectByExample(te);
					Tags t;
					if(list.size()>0) {
						t = list.get(0);
						t.settCount(t.gettCount()+1);
						tm.updateByPrimaryKey(t);
					}else {
						t = new Tags();
						t.settName(tag);
						t.settCount(1);
						tm.insert(t);
						
					}
					Tf tf = new Tf();
					tf.setFid(f.getId());
					tf.setTid(t.getId());
					tfm.insert(tf);
				}
			}
		
		
	}
	public List<Favorite> queryAll(){
		
	return fm.selectByExample(null);
		
	}
}
