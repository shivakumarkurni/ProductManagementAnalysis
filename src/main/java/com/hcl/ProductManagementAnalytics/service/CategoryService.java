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
		int users = 1;

		Categories categories = categoryRepository.findById(categoryId).get();

		CategoryCount categoryCount = categoryCountRepository
				.getCategoryCountByCategoryIdAndUserId(categories.getCategoryId(), users);

		if (categoryCount != null) {

			if (categoryCount.getCategoryId() == categoryId) {
				categoryCount.setCategoryCount(categoryCount.getCategoryCount() + 1);
				categoryCountRepository.save(categoryCount);

			}

		} else {

			CategoryCount categoryCount1 = new CategoryCount();
			categoryCount1.setCategoryCount(1);
			categoryCount1.setCategoryInterest("interested");
			categoryCount1.setUserId(1);
			categoryCount1.setCategoryId(categories.getCategoryId());

			categoryCountRepository.save(categoryCount1);
		}

		return categories;

	}

	public List<?> getAnalyticsByCategory(int categoryId) {

		return categoryCountRepository.getCategoryCountByCategoryId(categoryId);
	}

}
