package com.hcl.ProductManagementAnalytics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ProductManagementAnalytics.entiy.Categories;
import com.hcl.ProductManagementAnalytics.entiy.CategoryCount;
import com.hcl.ProductManagementAnalytics.repository.CategoryCountRepository;
import com.hcl.ProductManagementAnalytics.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	CategoryCountRepository categoryCountRepository;

	public List<Categories> categoryList() {

		return categoryRepository.findAll();
	}

	public Categories getCategoryById(int categoryId) {

		Categories categories = categoryRepository.findById(categoryId).get();

		CategoryCount categoryCount = new CategoryCount();
		categoryCount.setCategoryCount(1);
		categoryCount.setCategoryInterest("interested");
		categoryCount.setUserId(1);

		categoryCountRepository.save(categoryCount);

		return categories;

	}
	
	public int categoryInterests() {
		
		
	}

}
