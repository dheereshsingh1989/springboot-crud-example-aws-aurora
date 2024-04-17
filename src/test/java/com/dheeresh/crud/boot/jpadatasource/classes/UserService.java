package com.dheeresh.crud.boot.jpadatasource.classes;

public class UserService {

	private User user;
	
	public String getEmailById(String id) {
		return user.getUserEmailByUserId(id);
	}
}
