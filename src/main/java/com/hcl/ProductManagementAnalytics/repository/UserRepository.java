package com.hcl.ProductManagementAnalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ProductManagementAnalytics.entiy.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//Derived Queries
	public User findByName(String name);

}
