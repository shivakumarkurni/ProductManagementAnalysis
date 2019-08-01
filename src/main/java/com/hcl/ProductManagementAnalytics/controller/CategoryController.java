package com.hcl.ProductManagementAnalytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ProductManagementAnalytics.entiy.Categories;
import com.hcl.ProductManagementAnalytics.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories/all")
	public ResponseEntity<List<Categories>> categoryList(){
		
		return new ResponseEntity<>(categoryService.categoryList(),HttpStatus.OK);
	}

}
