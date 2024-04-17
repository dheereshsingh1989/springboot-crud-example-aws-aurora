package com.dheeresh.crud.boot.jpadatasource.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import com.dheeresh.crud.boot.jpadatasource.model.Product;
import com.dheeresh.crud.boot.jpadatasource.repository.ProductRepository;

@TestInstance(value = Lifecycle.PER_CLASS)
@ExtendWith(value = {MockitoExtension.class})
class ProductServiceTest {

	private ProductRepository productRepository;
	
	@BeforeEach
	public void init() {
		productRepository = mock(ProductRepository.class);
	}
	
	@Test
	void testFindByProductName() {
		
		 Product product = createDummyProduct();
		 when(productRepository.findByProductName("mobile")).thenReturn(product);
		 
		 assertAll( 
				 	()->assertEquals(999, productRepository.findByProductName("mobile").getPrice()),
				 	()->assertEquals("mobile", productRepository.findByProductName("mobile").getProductName()),
				 	()->assertEquals(10, productRepository.findByProductName("mobile").getQuantity())
				 );
	}
	
	private Product createDummyProduct() {
		
		Product product = new Product();
		product.setPrice(999);
		product.setProductName("mobile");
		product.setQuantity(10);
		return product;
	}
}
