package com.dheeresh.crud.boot.jpadatasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dheeresh.crud.boot.jpadatasource.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByProductName(String productName);  
	
}