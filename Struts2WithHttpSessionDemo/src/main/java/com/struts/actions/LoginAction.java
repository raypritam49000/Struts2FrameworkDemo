package com.struts.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@Action("/login")
@Result(name = "success", location = "/success.jsp")
public class LoginAction extends ActionSupport implements SessionAware,ServletRequestAware,ServletResponseAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(username + " " + password);
		session.put("username", username);
		session.put("password", password);

		Map<String, Object> httpSession = ActionContext.getContext().getSession();
		httpSession.put("username", username);
		httpSession.put("password", password);

		System.out.println(session);
		System.out.println(httpSession);
		
		System.out.println(request);
		HttpServletRequest request1 = ServletActionContext.getRequest();
		System.out.println(request1);
		
		System.out.println(response);
		HttpServletResponse response1 = ServletActionContext.getResponse();
		System.out.println(response1);
		return SUCCESS;
	}


}
