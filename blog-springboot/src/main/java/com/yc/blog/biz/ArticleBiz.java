package com.yc.blog.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.yc.blog.bean.Article;
import com.yc.blog.bean.ArticleExample;
import com.yc.blog.dao.ArticleMapper;
@Service
public class ArticleBiz{
	@Autowired
	private ArticleMapper am;
	public List<Article>queryNewArticle(int page){
		ArticleExample example = new ArticleExample();
		example.setOrderByClause("createTime desc");
		PageHelper.startPage(page, 5);
		return am.selectByExampleWithBLOBs(example);
	}
	
	public List<Article> queryByCategory(int id,int page){
		ArticleExample example = new ArticleExample();
		example.createCriteria().andCategoryidEqualTo(id);
		example.setOrderByClause("createTime desc");
		PageHelper.startPage(page, 5);
		return am.selectByExampleWithBLOBs(example);
	}
	
	@Transactional
	public Article read(int id) {
		ArticleExample example = new ArticleExample();
		example.createCriteria().andIdEqualTo(id);
		Article a = am.selectByPrimaryKey(id);
		a.setReadcnt((a.getReadcnt()==null ? 0 : a.getReadcnt())+1);
		am.updateByPrimaryKey(a);
		return a;
	}
	
	public List<Article>queryRela(Integer categotyid){
		ArticleExample example = new ArticleExample();
		example.setOrderByClause("createTime desc");
		example.createCriteria().andCategoryidEqualTo(categotyid);
		PageHelper.startPage(1, 10);
		return am.selectByExample(example);
	}
}
