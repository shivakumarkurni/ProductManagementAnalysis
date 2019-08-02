package com.hcl.ProductManagementAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.ProductManagementAnalytics.entiy.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {
	
	
	
}
