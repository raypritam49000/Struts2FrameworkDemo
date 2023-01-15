package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.dao.UserDaoImpl;

@Namespace(value = "/")
@Action("/deleteuser")
@Result(name = "success", location = "/report", type = "redirect")
public class DeleteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Long id;
	private UserDaoImpl userDaoImpl = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDaoImpl getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(id);
        userDaoImpl = new UserDaoImpl();
        userDaoImpl.deleteUserDetails(id);
		return SUCCESS;
	}

}
