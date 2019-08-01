package com.hcl.ProductManagementAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ProductManagementAnalytics.entiy.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
