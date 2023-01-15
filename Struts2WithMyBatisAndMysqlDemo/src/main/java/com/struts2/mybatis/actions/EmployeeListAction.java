package com.struts2.mybatis.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.mybatis.models.Employee;
import com.struts2.mybatis.service.EmployeeService;
import com.struts2.mybatis.service.impl.EmployeeServiceImpl;

@Namespace("/")
@Action("employeeList")
@Result(name = "success", location = "/WEB-INF/views/employees.jsp")
public class EmployeeListAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Employee> employees = new ArrayList<Employee>();
	private EmployeeService employeeService = new EmployeeServiceImpl();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String execute() throws Exception {
		employees = employeeService.findAll();
		return SUCCESS;
	}

}
