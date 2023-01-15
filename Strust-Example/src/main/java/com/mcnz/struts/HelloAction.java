package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("/hello")
@Result(name = "success",location = "/results.jsp")
public class HelloAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Set FirstName .....");
		this.firstName = firstName;
	}

	public String execute() {
		System.out.println("Value of firstName is :"+firstName);
		return "success";
	}
}
