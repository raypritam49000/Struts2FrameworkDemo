package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;


public class HelloWorldAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Set the First Name...");
		this.firstName = firstName;
	}
	
	public String execute() {
		System.out.println("Value of firstName is : "+firstName);
		return "success";
	}

}
