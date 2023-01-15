package com.strust.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.strust.models.Person;

@Action("/register")
@Result(name = "success", location = "/thankyou.jsp")
public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Person personBean;

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	public String execute() throws Exception {
		System.out.println(personBean);
		return SUCCESS;
	}

}
