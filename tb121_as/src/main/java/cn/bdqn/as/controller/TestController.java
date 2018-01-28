package cn.bdqn.as.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bdqn.as.entity.Menu;
import cn.bdqn.as.service.MenuService;

@Controller
@RequestMapping("as")
public class TestController {
	
	
	
	@RequestMapping("goIndex")
	public String goIndex(Model model){
	
		
		return "as/user";
	}
	
	
	
	
}
