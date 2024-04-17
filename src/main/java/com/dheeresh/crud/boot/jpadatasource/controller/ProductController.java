package com.dheeresh.crud.boot.jpadatasource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dheeresh.crud.boot.jpadatasource.model.Product;
import com.dheeresh.crud.boot.jpadatasource.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> allProducts() {
		return productService.getProducts();
	}

	@GetMapping("/product/{productId}")
	public Product getProduct(@PathVariable int productId) {
		return productService.getProductById(productId);
	}

	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PostMapping("/saveallproduct")
	public List<Product> saveAllProduct(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product updateProduct) {
		return productService.updateProduct(updateProduct);
	}

	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		return productService.deleteProduct(productId);
	}

	@GetMapping("/product/productname")
	public Product getProductByName(@RequestParam String productname) {
		return productService.getProductByName(productname);
	}

}
