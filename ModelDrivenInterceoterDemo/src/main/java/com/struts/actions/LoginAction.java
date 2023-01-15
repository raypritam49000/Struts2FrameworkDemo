package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.models.User;

@Namespace(value = "/")
@Action(value = "login", results = { @Result(name = "success", location = "/success.jsp"),
		@Result(name = "error", location = "/error.jsp") })
public class LoginAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 1L;

	private User user;

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {
		System.out.println(user);
		if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}