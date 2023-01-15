package com.struts.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.UserDaoImpl;
import com.struts.models.User;

@Namespace(value = "/")
@Action("/report")
@Result(name = "success", location = "/report.jsp")
public class ReportAction extends ActionSupport {
	private static final long serialVersionUID = 6329394260276112660L;
	private UserDaoImpl userDao = null;
	private List<User> userList = null;

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String execute() throws Exception {
		userDao = new UserDaoImpl();
		userList = userDao.report();
		return SUCCESS;
	}

}