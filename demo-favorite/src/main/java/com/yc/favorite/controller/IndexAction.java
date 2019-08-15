package com.yc.favorite.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.favorite.biz.FavoriteBiz;
import com.yc.favorite.biz.SpringHelper;
import com.yc.favorite.biz.TagsBiz;
@Controller
public class IndexAction {
	@Resource
	private TagsBiz tagsBiz;
	@Resource
	private FavoriteBiz favoriteBiz;
	@RequestMapping("index.do")
	public String favorite(Model model,String type) {		
		model.addAttribute("tagsList", tagsBiz.queryAll());
		if("1".equals(type)) {
			model.addAttribute("fList", favoriteBiz.queryAll());
			
		}else if("2".equals(type)) {
			
		}
		return "index";		
	}
	@RequestMapping("update.do")
	public String update(String id,Model model) {
		Integer fid = Integer.valueOf(id);
		model.addAttribute("favorite", favoriteBiz.findByid(fid).get(0));
		return "add";
	}
}
