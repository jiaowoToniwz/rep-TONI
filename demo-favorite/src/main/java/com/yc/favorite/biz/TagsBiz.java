package com.yc.favorite.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.favorite.bean.Tags;
import com.yc.favorite.dao.TagsMapper;
@Service
@Transactional
public class TagsBiz {
	@Resource
	private TagsMapper tm;
	public List<Tags> queryAll(){
		
			return tm.selectByExample(null);
		
	}
	
}
