package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@Action("addProductForm")
@Result(name = "success", location = "/WEB-INF/views/addProduct.jsp")
public class AddProductFormAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
 
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
