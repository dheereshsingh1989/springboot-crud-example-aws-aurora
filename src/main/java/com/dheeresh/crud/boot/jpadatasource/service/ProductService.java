package com.dheeresh.crud.boot.jpadatasource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dheeresh.crud.boot.jpadatasource.model.Product;
import com.dheeresh.crud.boot.jpadatasource.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products){
		return productRepository.saveAll(products);
	}
	
	public List<Product> getProducts() {
		return productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}
	
	public Product getProductById(int productId) {
		return productRepository.findById(productId).orElse(null);
	}
	
	public String deleteProduct(int productId) {
		productRepository.deleteById(productId);
		return "Product Deleted successfully with id - " + productId;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct = getProductById(product.getId());
		
		existingProduct.setPrice(product.getPrice());
		existingProduct.setProductName(product.getProductName());
		existingProduct.setQuantity(product.getQuantity());
		return productRepository.save(existingProduct);
	}
	
	public Product getProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}
	
}
