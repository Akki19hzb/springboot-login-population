package com.webapplication.service;

import java.util.List;
import com.webapplication.model.User;

public interface UserServiceInterface {


	List<User> getAllUsers();

	User getUser(String id);

	void addUser(User user);

	void updateUser(User user, String id);

	void deleteUser(String id);
	
	User checkUser(User user);
}
