package jp.co.example.entity;

import org.springframework.stereotype.Component;

@Component
public class UserInfo {


	private String userName;


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}




}