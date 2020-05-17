package com.agilisium.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue
	private Long id;
	
	private String product;
	
	private String company;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Product(){
		
	}
	
	public Product(Long id, String product, String company) {
		super();
		this.id = id;
		this.product = product;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + product + ", company="
				+ company + "]";
	}

	
	
	
}
