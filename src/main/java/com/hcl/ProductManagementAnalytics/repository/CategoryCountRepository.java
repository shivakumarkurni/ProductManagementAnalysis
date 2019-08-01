package com.hcl.ProductManagementAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ProductManagementAnalytics.entiy.CategoryCount;

public interface CategoryCountRepository extends JpaRepository<CategoryCount, Integer> {

}
