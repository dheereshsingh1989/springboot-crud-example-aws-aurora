package com.dheeresh.crud.boot.jpadatasource.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = {MockitoExtension.class})
class InjectMockUserService {

	@Mock
	private Map<String, String> map;
	
	@InjectMocks
	private ITCompany company;
	
	
	@Test
	public void testInjectMock() {
		
		when(map.get("google")).thenReturn("www.google.com");
		assertEquals("www.google.com", company.getCompanyWebsite("google"));
	}
	
}
