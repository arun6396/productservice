package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.pms*")
public class ProductManagementSystemBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementSystemBackendApplication.class, args);
	}

}
