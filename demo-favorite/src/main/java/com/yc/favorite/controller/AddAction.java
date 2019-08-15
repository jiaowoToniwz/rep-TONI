package com.yc.favorite.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yc.favorite.bean.Favorite;
import com.yc.favorite.biz.BizException;
import com.yc.favorite.biz.FavoriteBiz;



@Controller
public class AddAction{
	@Resource
	private FavoriteBiz biz;
	@RequestMapping("add.do")
	public String show() {
		return "add";
	}
	@RequestMapping(path="add.do",params="state")
	public String showState() {
		return "add";
	}

	@RequestMapping("doAdd.do")
	public String add(String id,String fLabel,
			String fUrl,String fTags,String fDesc) {
		Favorite favorite = new Favorite();
		System.out.println(fDesc+"===================");
		favorite.setfDesc(fDesc);
		favorite.setfLabel(fLabel);
		favorite.setfUrl(fUrl);
		favorite.setfTags(fTags);
		System.out.println(id.length()+": dadadsadasasdasda");
		if(id!=null&&!id.equals("")) {
			System.out.println(id+"daadasdasdasdasdasd");
			favorite.setId(Integer.valueOf(id));
			try {
				biz.updateFavorite(favorite);
				
				return "redirect:add.do?state=success";
				
				//response.sendRedirect("add.jsp?state=success");
			} catch (BizException e) {
				e.printStackTrace();
			/*	arr.addAttribute("state", "error");*/
				return "redirect:add.do?state=error";
				//response.sendRedirect("add.jsp?state=error");
			}
		}else {	
		System.out.println();
		try {
			biz.addFavorite(favorite);
			/*arr.addAttribute("state", "success");*/
			return "redirect:add.do?state=success";
			//response.sendRedirect("add.jsp?state=success");
		} catch (BizException e) {
			
			return "redirect:add.do?state=error";
			//response.sendRedirect("add.jsp?state=error");
			}

		}
	}
}
	/*@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
				
		String id = request.getParameter("id");

		String fLabel = request.getParameter("fLabel");
		String fUrl = request.getParameter("fUrl");
		String fTags = request.getParameter("fTags");
		String fDesc = request.getParameter("fDesc");
		System.out.println(fLabel+""+fUrl+""+fTags+""+fDesc+"@@@@@@@@@@@@@22");
		Favorite favorite = new Favorite();
		favorite.setfDesc(fDesc);
		favorite.setfLabel(fLabel);
		favorite.setfUrl(fUrl);
		favorite.setfTags(fTags);
		if(id!=null&&id!="") {
			System.out.println(id+"daadasdasdasdasdasd");
			favorite.setId(Integer.valueOf(id));
			try {
				biz.updateFavorite(favorite);
				response.sendRedirect("add.jsp?state=success");
			} catch (BizException e) {
				e.printStackTrace();
				response.sendRedirect("add.jsp?state=error");
			}
		}else {	
		System.out.println();
		try {
			biz.addFavorite(favorite);
			response.sendRedirect("add.jsp?state=success");
		} catch (BizException e) {
			response.sendRedirect("add.jsp?state=error");
		}
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}*/

