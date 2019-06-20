package com.app.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {


	Page<Product> findByProdCost(Double prodCost, Pageable p);
	
	//Note:
	/** here to use pagination process we should provide pageable parameter to method las param.**/
}
