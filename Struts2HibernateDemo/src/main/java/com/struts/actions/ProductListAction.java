package com.struts.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.entity.Product;
import com.struts.entity.ProductModel;

@Namespace("/")
@Action("listProduct")
@Result(name = "success", location = "/WEB-INF/views/listProducts.jsp")
public class ProductListAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ProductModel pm = new ProductModel();
	private List<Product> products = new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String execute() throws Exception {
		this.products = this.pm.findAll();
		return SUCCESS;
	}

}
