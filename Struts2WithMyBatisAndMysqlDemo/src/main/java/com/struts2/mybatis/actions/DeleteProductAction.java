package com.struts2.mybatis.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.mybatis.service.EmployeeService;
import com.struts2.mybatis.service.impl.EmployeeServiceImpl;

@Namespace(value = "/")
@Action("deleteEmployee")
@Result(name = "success", location = "/employeeList", type = "redirect")
public class DeleteProductAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService = new EmployeeServiceImpl();
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		this.employeeService.deleteById(id);
		return SUCCESS;
	}
}
