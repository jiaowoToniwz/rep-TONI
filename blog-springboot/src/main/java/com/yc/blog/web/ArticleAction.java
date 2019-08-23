package com.yc.blog.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.yc.blog.bean.Article;
import com.yc.blog.bean.Category;
import com.yc.blog.bean.User;
import com.yc.blog.biz.ArticleBiz;
import com.yc.blog.biz.CategoryBiz;

@Controller
public class ArticleAction { 
	@Resource
	private ArticleBiz abiz;
	@Resource
	private CategoryBiz cbiz;
	
	@ModelAttribute("cList")
	public List<Category>init(){
		return cbiz.queryAll();
	}
	
	@GetMapping("index")
	public String index(@RequestParam(defaultValue="1")int page,Model model) {
		model.addAttribute("aList", abiz.queryNewArticle(page));
		return "index";
	}
	
	@GetMapping("category")
	public String category(@RequestParam(defaultValue="1")int page,
			int id,Model model) {
		model.addAttribute("aList", abiz.queryByCategory(id,page));
		return "category";
	}
	@GetMapping("article")
	public String article(@RequestParam(defaultValue="1") int page, int id, Model model) {
		Article a = abiz.read(id);
		
		PageHelper.startPage(page,5);
		a.getComments();
		List<Article> relaList = abiz.queryRela(a.getCategoryid());
		model.addAttribute("relaList", relaList);
		model.addAttribute(a);
		return "article";
	}
	
	@GetMapping("toedit")
	public String toedit(Model model) {
		model.addAttribute("article", new Article());
		return "articleEdit";
	}
	
	@PostMapping("saveArticle")
	public String save(Article article,Model model,
			@SessionAttribute("loginedUser")User user) {
		article.setAuthor(user.getName());
		article.setCreatetime(new Date());
		abiz.save(article);
		return article(1, article.getId(),model);
	}
	
	@PostMapping("upload")
	@ResponseBody
	public String upload(
			@RequestParam("upload") MultipartFile file,
			String CKEditorFuncNum) throws IllegalStateException, IOException {
		String fname = file.getOriginalFilename();
		File dest = new File("d:/blog/upload/"+fname);
		file.transferTo(dest);
		String js="<script type=\"text/javascript\">"+
		"window.parent.CKEDITOR.tools.callFunction(" + CKEditorFuncNum +
		",'upload/"+fname+"','')"+
		"</script>";
		return js;
	}
}
