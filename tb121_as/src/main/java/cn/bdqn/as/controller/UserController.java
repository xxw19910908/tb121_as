package cn.bdqn.as.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bdqn.as.bo.BaseMessage;
import cn.bdqn.as.bo.UserDg;
import cn.bdqn.as.entity.User;
import cn.bdqn.as.service.UserService;

@Controller()
@RequestMapping("as/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//退出
	@RequestMapping("logout")
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("user");
		return "redirect:/as/goIndex";
	}
	
	
	@RequestMapping("login")
	@ResponseBody
	public BaseMessage login(String userCode,String pwd,HttpSession httpSession){
		
	User user=	userService.login(userCode, pwd);
		
		if(user!=null){
			httpSession.setAttribute("user", user);
			
			return BaseMessage.getBaseMessage(200, "登录成功");
		}else{
			
			
			return BaseMessage.getBaseMessage(201, "用户名或者密码不存在");
		}
	
	
	
	
		
	}
	
	
	
	@RequestMapping("showUser")
	@ResponseBody
	public UserDg showUser(){
		
		return userService.showAll();
	}
	
	
	
	
	
}
