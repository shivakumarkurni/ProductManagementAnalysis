package com.hcl.ProductManagementAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.ProductManagementAnalytics.entiy.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {
	
	
	@Query(name="select COUNT() FROM CategoryCount cc WHERE cc.categoryId= {1}")
	public int categoryInterests(int categoryId);

}
