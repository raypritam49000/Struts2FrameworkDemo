package com.struts2.mybatis.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2.mybatis.models.Employee;
import com.struts2.mybatis.service.EmployeeService;
import com.struts2.mybatis.service.impl.EmployeeServiceImpl;

@Namespace("/")
@Action("addEmployee")
@Result(name = "success", location = "/employeeList",type = "redirect")
public class AddEmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	private static final long serialVersionUID = 1L;
	private Employee employee;
	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public Employee getModel() {
		employee = new Employee();
		return employee;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(employee);
		System.out.println(employeeService);
		this.employeeService.save(employee);
		return SUCCESS;
	}
}
