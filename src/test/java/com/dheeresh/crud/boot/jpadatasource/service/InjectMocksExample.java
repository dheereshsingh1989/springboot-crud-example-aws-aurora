package com.dheeresh.crud.boot.jpadatasource.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = {MockitoExtension.class})
class InjectMocksExample {

	@Mock
	private Map<String, String> map;
	
	@InjectMocks
	private ITCompany company;
	
	@Test
	@DisplayName("Nullpointer Test - AssertThrows")
	void throwNullPonterExceptionTest() {
		
		when(map.get(anyString())).thenThrow(NullPointerException.class);
		assertThrows(NullPointerException.class, ()-> company.getCompanyWebsite(anyString()));
		
		verify(map).get(anyString());
	}
}
