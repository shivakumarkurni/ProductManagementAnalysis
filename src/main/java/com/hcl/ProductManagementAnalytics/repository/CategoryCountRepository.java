package com.hcl.ProductManagementAnalytics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hcl.ProductManagementAnalytics.entiy.CategoryCount;

public interface CategoryCountRepository extends JpaRepository<CategoryCount, Integer> {

	@Query(value="select * FROM category_count cc WHERE cc.category_Id= :categoryId and cc.user_Id=:userId",nativeQuery=true)
	public CategoryCount getCategoryCountByCategoryIdAndUserId(@Param("categoryId") int categoryId,@Param("userId") int userId);
	
	@Query("select sum(categoryCount) FROM CategoryCount cc WHERE cc.categoryId= :categoryId")
	public List<?> getCategoryCountByCategoryId(@Param("categoryId") int categoryId);

}
