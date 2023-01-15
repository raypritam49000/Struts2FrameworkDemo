package com.struts.actions;

public class Login {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("Set UserName....");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Set Password....");
		this.password = password;
	}

	public String validate() {
		System.out.println("UserName ==>> "+username+" Password ==>> "+password);
		if (username.equals("ram") && password.equals("ram")) {
			return "success";
		} else {
			return "fail";
		}
	}

}
