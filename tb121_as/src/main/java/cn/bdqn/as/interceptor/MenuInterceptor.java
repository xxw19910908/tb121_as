package cn.bdqn.as.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.bdqn.as.entity.Menu;
import cn.bdqn.as.service.MenuService;

public class MenuInterceptor implements HandlerInterceptor {
	@Autowired
	private MenuService menuServiceImpl;
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView modelAndView) throws Exception {
		System.out.println("11111");
		if(modelAndView!=null){
			
			List<Menu> menus=	menuServiceImpl.showAll();
			
			System.out.println(menus);
			
			modelAndView.getModel().put("menus",menus);
		}
		
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		
		return true;
	}

}
