package com.pms.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.entity.Product;
@Service
public interface ProductService {
	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProductById(Integer id);

	public String deleteProduct(Integer id);
	public Product editProduct(Product product, Integer id);

}
