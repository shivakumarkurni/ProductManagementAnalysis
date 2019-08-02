package com.hcl.ProductManagementAnalytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ProductManagementAnalytics.entiy.Product;
import com.hcl.ProductManagementAnalytics.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/products/all")
	public ResponseEntity<List<Product>> getProducts() {

		return new ResponseEntity<>(productService.productList(), HttpStatus.OK);
	}

	@GetMapping("/products/getProduct/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable int productId) {

		return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);

	}
	
	@GetMapping("/productAnalytics/product/{prodId}")
	public ResponseEntity<List<?>>getProdInterestCount(@PathVariable int prodId){
		
		return new ResponseEntity<List<?>>(productService.getAnalyticsProdInterested(prodId),HttpStatus.OK);
		
	}

}
