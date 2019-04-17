package com.neuedu.springdemo.bean;

import java.util.Date;

public class UserInfo {
	private String account;
	private String password;
	private int age;
	private Date birthday;
	
	
	public UserInfo() {
		super();
	}


	public UserInfo(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	
}
