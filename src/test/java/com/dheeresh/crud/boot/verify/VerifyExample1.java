package com.dheeresh.crud.boot.verify;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(value = MockitoExtension.class)
@DisplayName("Verify Method - Test")
class VerifyExample1 {

	@Mock
	private MyUtils mockObject;
	@Mock
	private MyUtils mockObject1, mockObject2;
	
	@Test
	void test() {
		mockObject.add(anyInt(), anyInt());
		verify(mockObject).add(anyInt(), anyInt());
	}
	
	@Test
	void timesTest() {
		
		mockObject.add(anyInt(), anyInt());
		mockObject.add(anyInt(), anyInt());
		verify(mockObject, times(2)).add(anyInt(), anyInt());
	}
	
	@Test
	void times1Test() {
		
		mockObject.add(anyInt(), anyInt());
		mockObject.add(anyInt(), anyInt());
		
		verify(mockObject, atLeast(2)).add(anyInt(), anyInt());
	}
	
	@Test
	void verifyNoInteraction() {
		//mockObject1.add(anyInt(), anyInt()); 
		//mockObject2.add(anyInt(), anyInt());
		
		verifyNoInteractions(mockObject, mockObject2);
	}
}
