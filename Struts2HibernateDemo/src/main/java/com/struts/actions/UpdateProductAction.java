package com.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.entity.Product;
import com.struts.entity.ProductModel;

@Namespace("/")
@Action("updateProduct")
@Result(name = "success", location = "/listProduct", type = "redirect")
public class UpdateProductAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ProductModel pm = new ProductModel();
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String execute() throws Exception {
        this.pm.update(product);
		return super.execute();
	}

}
