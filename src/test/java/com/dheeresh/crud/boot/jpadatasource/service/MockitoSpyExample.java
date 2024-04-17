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
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Optional;

import com.dheeresh.crud.boot.jpadatasource.model.Product;
import com.dheeresh.crud.boot.jpadatasource.repository.ProductRepository;

@TestInstance(value = Lifecycle.PER_CLASS)
@ExtendWith(value = { MockitoExtension.class })
@DisplayName("Spy - Unit Test")
class MockitoSpyExample {

	// annotation approach
	
	@Spy
	private ArrayList<String> spyList;
	
	@Test
	void testSpy() {
		
		spyList.add("ABC");
		spyList.add("XYZ");
		assertEquals(2, spyList.size());
	}
	
	
	
	// this is programmatic approach 
	/*
	 * @Test public void testSpy() {
	 * 
	 * ArrayList<String> list = spy(new ArrayList<>()); //ArrayList<String> list =
	 * mock(ArrayList.class); --> this line of code will fail the test.
	 * 
	 * list.add("ABC"); list.add("DEF");
	 * 
	 * assertEquals(2, list.size()); }
	 */
		
	
	
	

}
