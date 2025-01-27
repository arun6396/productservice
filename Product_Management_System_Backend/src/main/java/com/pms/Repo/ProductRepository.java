package com.pms.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pms.entity.Product;
@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	
}
