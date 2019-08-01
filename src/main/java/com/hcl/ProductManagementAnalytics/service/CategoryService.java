package com.hcl.ProductManagementAnalytics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ProductManagementAnalytics.entiy.Categories;
import com.hcl.ProductManagementAnalytics.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public List<Categories> categoryList() {

		return categoryRepository.findAll();
	}
	
	public Categories getCategoryById(int categoryId) {
		
		Categories categories=categoryRepository.findById(categoryId).get();
		
		return categories;
		
		
		
	}

}
