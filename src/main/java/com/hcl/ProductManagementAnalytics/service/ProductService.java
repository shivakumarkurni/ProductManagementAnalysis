package com.hcl.ProductManagementAnalytics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ProductManagementAnalytics.entiy.Product;
import com.hcl.ProductManagementAnalytics.entiy.ProductCount;
import com.hcl.ProductManagementAnalytics.repository.ProductCountRepository;
import com.hcl.ProductManagementAnalytics.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired

	ProductRepository productRepository;

	@Autowired
	ProductCountRepository productCountRepository;

	public List<Product> productList() {

		return productRepository.findAll();
	}

	public Product getProductById(int productId) {

		Product product = productRepository.findById(productId).get();
		

		ProductCount productCount = new ProductCount();
		productCount.setProdCount(1);
		productCount.setProdId(product.getProductId());
		productCount.setProdInterested("interested");
		productCount.setUserId(2);

		productCountRepository.save(productCount);

		return product;

	}
	
	public List<?> getAnalyticsProdInterested(int prodId){
		
		return productCountRepository.getProductCountByProdId(prodId);
		
		
		
	}

}
