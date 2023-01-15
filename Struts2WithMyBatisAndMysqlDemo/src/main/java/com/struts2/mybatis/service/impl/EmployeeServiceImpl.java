package com.struts2.mybatis.service.impl;

import java.util.List;

import javax.inject.Singleton;

import org.apache.ibatis.session.SqlSession;

import com.struts2.mybatis.config.MyBatisUtil;
import com.struts2.mybatis.dao.EmployeeDao;
import com.struts2.mybatis.models.Employee;
import com.struts2.mybatis.service.EmployeeService;

@Singleton
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> findAll() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		EmployeeDao mapper = session.getMapper(EmployeeDao.class);
		List<Employee> employees = mapper.findAll();
		session.commit();
		return employees;
	}

	@Override
	public int save(Employee employee) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		EmployeeDao mapper = session.getMapper(EmployeeDao.class);
		int isSaved = mapper.save(employee);
		session.commit();
		return isSaved;
	}

	@Override
	public Employee findById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		EmployeeDao mapper = session.getMapper(EmployeeDao.class);
		Employee employee = mapper.findById(id);
		session.commit();
		return employee ;
	}

	@Override
	public int updateEmployee(Employee employee) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		EmployeeDao mapper = session.getMapper(EmployeeDao.class);
		int isUpdated = mapper.updateEmployee(employee);
		session.commit();
		return isUpdated;
	}

	@Override
	public int deleteById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		EmployeeDao mapper = session.getMapper(EmployeeDao.class);
		int isDeleted = mapper.deleteById(id);
		session.commit();
		return isDeleted;
	}

}
