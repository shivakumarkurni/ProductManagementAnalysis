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

		int userId = 1;

		Product product = productRepository.findById(productId).get();

		ProductCount productCount = productCountRepository.getProductCountByProdIdAndUserId(product.getProductId(),
				userId);

		if (productCount != null) {
			productCount.setProdCount(productCount.getProdCount() + 1);
			productCountRepository.save(productCount);

		} else {

			ProductCount productCount1 = new ProductCount();
			productCount1.setProdCount(1);
			productCount1.setProdId(product.getProductId());
			productCount1.setProdInterested("interested");
			productCount1.setUserId(1);

			productCountRepository.save(productCount1);
		}

		return product;

	}

	public List<?> getAnalyticsProdInterested(int prodId) {

		return productCountRepository.getProductCountByProdId(prodId);

	}

}
