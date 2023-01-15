package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.entity.Product;
import com.struts.entity.ProductModel;

@Namespace("/")
@Action("updateFormProduct")
@Result(name = "success", location = "/WEB-INF/views/updateProduct.jsp")
public class UpdateProductFormAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Product product;
	private ProductModel pm = new ProductModel();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String execute() throws Exception {
		product = this.pm.find(id);
		return SUCCESS;
	}

}
