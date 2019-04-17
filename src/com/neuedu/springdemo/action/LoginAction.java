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

	/*��login.jspҳ������*/
	@RequestMapping("/doLogin")
	public String doLogin(UserInfo user){
		System.out.println("================");
		/**/
		System.out.println("User account��"+user.getAccount()+"��User password��"+user.getPassword());
		
		System.out.println("User age��"+user.getAge());
		
		System.out.println("User birthday��"+user.getBirthday().toLocaleString());
		//return "success";//��������������ͼ������
		return "redirect://pages/success.jsp";//�ض�����ת
	}
	
	/*��Regiter.jspҳ������*/	
	//spring mvc + servlet
	@RequestMapping("/doRegiter")
	public String doRegiter(UserInfo user,HttpServletRequest request,HttpServletResponse response){
		
		//����ת������ʹ��request���󴫵�����
		//�ض������ʹ��session���󴫵�����
		if ("admin".equals(user.getAccount())){
			request.setAttribute("Error", "�˺ŷǷ�������ע��");
			System.out.println("�˺ŷǷ�������ע��");
			return "register";//����˺ŷǷ�������ע��ҳ��
		}else{
			System.out.println("�˺���Ч����¼�ɹ�");
			request.getSession().setAttribute("User", user);
			return "redirect://pages/success.jsp";//�ض�����ת
		}	
		
	}
	
	
}
