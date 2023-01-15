package com.struts2.mybatis.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.mybatis.models.Employee;
import com.struts2.mybatis.service.EmployeeService;
import com.struts2.mybatis.service.impl.EmployeeServiceImpl;

@Namespace("/")
@Action("updateEmployeeForm")
@Result(name = "success", location = "/WEB-INF/views/updateEmployee.jsp")
public class UpdateEmployeeFormAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Employee employee;
	private EmployeeService employeeService = new EmployeeServiceImpl();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String execute() throws Exception {
		employee = this.employeeService.findById(id);
		return SUCCESS;
	}

}
