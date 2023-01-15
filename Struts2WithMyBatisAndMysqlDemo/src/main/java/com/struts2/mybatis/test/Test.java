package com.struts2.mybatis.test;

import javax.inject.Inject;

import com.struts2.mybatis.service.impl.EmployeeServiceImpl;

public class Test {
	
	@Inject
	private  EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
	
	 void show() {
		 System.out.println(employeeService.findAll());
	}
	
	public static void main(String[] args) {
      new Test().show();
	}
}
