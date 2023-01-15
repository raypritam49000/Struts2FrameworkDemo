package com.struts2.mybatis.service;

import java.util.List;

import com.struts2.mybatis.models.Employee;

public interface EmployeeService {
	public abstract List<Employee> findAll();
	public int save(Employee employee);
	Employee findById(int id);
	public int updateEmployee(Employee employee);
	public int deleteById(int id);
}
