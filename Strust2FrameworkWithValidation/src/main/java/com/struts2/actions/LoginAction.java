package com.struts2.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

@Namespace(value = "/")
@Action(value = "login", results = { @Result(name = "success", location = "/success.jsp"),
		@Result(name = "input", location = "/index.jsp") })
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;

	@RequiredStringValidator(message = "Please enter your e-mail address.")
	@EmailValidator(message = "Please enter a valid e-mail address.")
	public void setEmail(String email) {
		this.email = email;
	}

	@RequiredStringValidator(message = "Please enter your password.")
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String execute() throws Exception {
		System.out.println(email+" "+password);
		if (email != null && email.equals("admin@codejava.net")) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

}
