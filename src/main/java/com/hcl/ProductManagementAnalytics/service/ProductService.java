package com.hcl.ProductManagementAnalytics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ProductManagementAnalytics.entiy.Product;
import com.hcl.ProductManagementAnalytics.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	
	ProductRepository productRepository;
	
	
	public List<Product> productList(){
		
		return productRepository.findAll();
	}

}
