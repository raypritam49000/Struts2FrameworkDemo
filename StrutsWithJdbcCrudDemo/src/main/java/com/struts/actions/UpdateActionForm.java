package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.UserDaoImpl;
import com.struts.models.User;

@Namespace(value = "/")
@Action("/updateuserform")
@Result(name = "success", location = "/update.jsp")
public class UpdateActionForm extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Long id;
	private UserDaoImpl userDao = null;
	private User user = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		userDao = new UserDaoImpl();
        user = userDao.fetchUserDetails(id);
		return SUCCESS;
	}

}
