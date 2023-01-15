package com.struts2.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Results;

import com.struts2.mybatis.models.Employee;

@Mapper
public interface EmployeeDao {

	@Select("select * from employee")
	public abstract List<Employee> findAll();

	@Insert("insert into employee(name,city,salary) values(#{name}, #{city},#{salary}) ")
	public int save(Employee employee);

	@Results({ @Result(property = "id", column = "id"), @Result(property = "name", column = "name"),
			@Result(property = "city", column = "city") })
	@Select("SELECT id, name, city,salary from employee WHERE id = #{id}")
	Employee findById(int id);

	@Update("UPDATE employee SET name=#{name},city = #{city},salary=#{salary} WHERE id =#{id}")
	public int updateEmployee(Employee employee);

	@Delete("DELETE FROM employee WHERE id =#{id}")
	public int deleteById(int id);

}
