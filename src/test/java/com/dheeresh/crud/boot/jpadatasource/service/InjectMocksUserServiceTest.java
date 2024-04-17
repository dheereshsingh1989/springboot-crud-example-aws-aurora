package com.dheeresh.crud.boot.jpadatasource.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dheeresh.crud.boot.jpadatasource.classes.User;
import com.dheeresh.crud.boot.jpadatasource.classes.UserService;

@ExtendWith(value = {MockitoExtension.class})
class InjectMocksUserServiceTest {

	@InjectMocks
	private UserService userService;
	
	@Mock
	private User user;
	
	@Test
	public void testGetEmailByUserId() {
		
		when(user.getUserEmailByUserId("abc")).thenReturn("abc.com");
		String email = userService.getEmailById("abc");
		assertEquals("abc.com", email);
	}

}
