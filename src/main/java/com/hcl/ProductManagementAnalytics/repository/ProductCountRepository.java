package com.hcl.ProductManagementAnalytics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hcl.ProductManagementAnalytics.entiy.ProductCount;

public interface ProductCountRepository extends JpaRepository<ProductCount, Integer> {
	
	@Query("select count(prodInterested) from ProductCount p where p.prodId=:prodId")
	List<?> getProductCountByProdId(@Param("prodId")int prodId);

}
