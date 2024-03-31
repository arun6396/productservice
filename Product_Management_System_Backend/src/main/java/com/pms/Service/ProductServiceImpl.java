package com.pms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.Repo.ProductRepository;
import com.pms.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private ProductRepository productRepository;
	@Override
	public Product saveProduct(Product product) {
	
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {

		return productRepository.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		Product product = productRepository.findById(id).get();
		
		if(product != null) {
			productRepository.delete(product);
			return "Product Delete Successfully";
		}
		return "Something  Wrong on server"; 
	}

	@Override
	public Product editProduct(Product p, Integer id) {
		Product oldProduct = productRepository.findById(id).get();
		oldProduct.setProductName(p.getProductName());
		oldProduct.setDescription(p.getDescription());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());
		return productRepository.save(oldProduct);
	}

	

	

	
}
