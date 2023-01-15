package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.dao.UserDaoImpl;
import com.struts.models.User;

@Namespace(value = "/")
@Action("/updateuser")
@Result(name = "success", location = "/report", type = "redirect")
public class UpdateAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 1L;
	private User user = null;
	private UserDaoImpl userDao = null;

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		userDao = new UserDaoImpl();
		userDao.updateUserDetails(user);
		return super.execute();
	}

}
