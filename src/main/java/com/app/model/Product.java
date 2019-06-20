package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="prod_tab2")

public class Product {

	@Id
	private Integer prodId;
	private String prodName;
	private String prodCode;
	private Double prodCost;
	private String prodModel;
	private String prodVenodr;
	
	public Product() {
		super();
	}

	public Product(Integer prodId, String prodName, String prodCode, Double prodCost, String prodModel,
			String prodVenodr) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodModel = prodModel;
		this.prodVenodr = prodVenodr;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public String getProdModel() {
		return prodModel;
	}

	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}

	public String getProdVenodr() {
		return prodVenodr;
	}

	public void setProdVenodr(String prodVenodr) {
		this.prodVenodr = prodVenodr;
	}

	
}
