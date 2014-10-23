package com.gfan.report.frame.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gfan.report.frame.module.UiFwUser;
import com.gfan.report.frame.service.UserService;
import com.gfan.user.model.User;

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
		User suser = (User) session.getAttribute("user");
		String loginId = suser.getUserName();
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
