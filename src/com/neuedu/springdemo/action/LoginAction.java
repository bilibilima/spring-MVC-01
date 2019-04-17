package com.neuedu.springdemo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.springdemo.bean.UserInfo;

@Controller
@RequestMapping("/login")
public class LoginAction {

	/*从login.jsp页面启动*/
	@RequestMapping("/doLogin")
	public String doLogin(UserInfo user){
		System.out.println("================");
		/**/
		System.out.println("User account："+user.getAccount()+"，User password："+user.getPassword());
		
		System.out.println("User age："+user.getAge());
		
		System.out.println("User birthday："+user.getBirthday().toLocaleString());
		//return "success";//可以用于配置试图的名称
		return "redirect://pages/success.jsp";//重定向跳转
	}
	
	/*从Regiter.jsp页面启动*/	
	//spring mvc + servlet
	@RequestMapping("/doRegiter")
	public String doRegiter(UserInfo user,HttpServletRequest request,HttpServletResponse response){
		
		//请求转发可以使用request对象传递数据
		//重定向可以使用session对象传递数据
		if ("admin".equals(user.getAccount())){
			request.setAttribute("Error", "账号非法，不能注册");
			System.out.println("账号非法，不能注册");
			return "register";//如果账号非法，跳回注册页面
		}else{
			System.out.println("账号有效，登录成功");
			request.getSession().setAttribute("User", user);
			return "redirect://pages/success.jsp";//重定向跳转
		}	
		
	}
	
	
}
