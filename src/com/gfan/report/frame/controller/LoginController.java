package com.gfan.report.frame.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gfan.report.frame.module.UiFwUser;
import com.gfan.report.frame.service.UserService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping()
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/enter")
	public String enter(HttpSession session){
		String loginId = "admin@gfan.com";
		UiFwUser user = userService.getUser(loginId);
		session.setAttribute("userInfo", user);
		session.setAttribute("userModules", userService.getUserModule(user.getId()));
		return "frame/index";
	}
	
	@RequestMapping(value="/out")
	public String out(HttpSession session){
		session.removeAttribute("userInfo");
		session.removeAttribute("userModules");
		session.invalidate();
		return "login";
	}
}
