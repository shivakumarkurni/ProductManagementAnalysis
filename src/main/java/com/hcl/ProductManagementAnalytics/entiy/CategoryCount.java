package com.hcl.ProductManagementAnalytics.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class CategoryCount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int categoryCount;
	private String categoryInterest;
	private int userId;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryCount() {
		return categoryCount;
	}

	public void setCategoryCount(int categoryCount) {
		this.categoryCount = categoryCount;
	}

	public String getCategoryInterest() {
		return categoryInterest;
	}

	public void setCategoryInterest(String categoryInterest) {
		this.categoryInterest = categoryInterest;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
