package com.dheeresh.crud.boot.verify;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dheeresh.crud.boot.jpadatasource.service.ITCompany;

@ExtendWith(value= {MockitoExtension.class})
class MockVoidMethod {

	@Mock
	List<String> mockList;
	
	@Test
	public void mockVoidMethodTest() {
		
		doNothing().when(mockList).add(anyInt(), anyString());
		
		mockList.add(anyInt(), anyString());
		
		verify(mockList, times(1)).add(anyInt() ,anyString());
		System.out.println(mockList.get(anyInt()));
	}
	
	@Test
	public void spyVoidMethodTest() {
		
		ITCompany company = spy(ITCompany.class);
		
		doCallRealMethod().when(company).registerCompany("netflix", "www.netflix.com");
		
		company.registerCompany("netflix", "www.netflix.com");
		
		verify(company, times(1)).registerCompany("netflix", "www.netflix.com");
		assertEquals("www.netflix.com", company.getCompanyWebsite("netflix"));
	}
	
	

}
