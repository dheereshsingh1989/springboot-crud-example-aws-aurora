package com.dheeresh.crud.boot.jpadatasource.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import com.dheeresh.crud.boot.jpadatasource.model.Product;
import com.dheeresh.crud.boot.jpadatasource.repository.ProductRepository;

@TestInstance(value = Lifecycle.PER_CLASS)
@ExtendWith(value = { MockitoExtension.class })
@DisplayName("Product Class - Unit Test")
class ProductServiceTestWithAnnotationWay {

	@Mock
	private ProductRepository productRepository;

	// no need to open mock, since we re using, MockitoExtension

	@Test
	@DisplayName("Find Product ByName - Test")
	void testFindByProductName() {

		Product product = createDummyProduct();
		when(productRepository.findByProductName("mobile")).thenReturn(product);

		assertAll(
				() -> assertEquals(999, productRepository.findByProductName("mobile").getPrice()),
				() -> assertEquals("mobile", productRepository.findByProductName("mobile").getProductName()),
				() -> assertEquals(10, productRepository.findByProductName("mobile").getQuantity()));
	}

	private Product createDummyProduct() {
		Product product = new Product();
		product.setId(1);
		product.setPrice(999);
		product.setProductName("mobile");
		product.setQuantity(10);
		return product;
	}
}
