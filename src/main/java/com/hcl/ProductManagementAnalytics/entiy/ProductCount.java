package com.hcl.ProductManagementAnalytics.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductCount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int prodId;
	private int prodCount;
	private String prodInterested;
	private int userId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getProdCount() {
		return prodCount;
	}

	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}

	public String getProdInterested() {
		return prodInterested;
	}

	public void setProdInterested(String prodInterested) {
		this.prodInterested = prodInterested;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
