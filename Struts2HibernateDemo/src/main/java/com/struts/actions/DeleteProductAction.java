package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.entity.Product;
import com.struts.entity.ProductModel;

@Namespace(value = "/")
@Action("deleteProduct")
@Result(name = "success", location = "/listProduct", type = "redirect")
public class DeleteProductAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	ProductModel pm = new ProductModel();
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		Product product = this.pm.find(id);
		this.pm.delete(product);
		return SUCCESS;
	}
}
