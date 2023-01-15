package com.struts2.mybatis.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@Action("addEmployeeForm")
@Result(name = "success", location = "/WEB-INF/views/addEmployee.jsp")
public class AddEmployeeShowFormAction extends ActionSupport  {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
