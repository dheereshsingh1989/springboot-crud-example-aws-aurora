package com.dheeresh.crud.boot.jpadatasource.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value= {MockitoExtension.class})
class ArgumentMatchersTest {

	@Mock
	private List<Integer> list;
	
	@Mock
	private List<String> listString;
	
	@Test
	void testIntListMatcher() {
	
		when(list.add(anyInt())).thenReturn(true);
		assertTrue(list.add(50));
	}
	
	@Test
	void testStringListMatcher() {

		// Test Case for String List
		
		//when(listString.get(anyInt())).thenReturn("exact");
		doReturn("exact").when(listString).get(anyInt());
		
		assertEquals("exact", listString.get(5));
		assertEquals("exact", listString.get(10));
		
	}
}
