package com.webapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webapplication.model.User;
import com.webapplication.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers()
	{
		List<User> users=new ArrayList<>();
		userRepository.findAll()
		.forEach(users::add);
		return users;
	}
	
	@Override
	public User getUser(String id) {
		User user = userRepository.findOne(id);
		return user;
	}

	@Override
	public void addUser(User user) {
		
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(User user,String id) {
		User object = userRepository.findOne(id);
		if (object != null)
		{
		userRepository.save(user);
		}
		
	}

	@Override
	public User checkUser (User user) {
		User result = userRepository.findUser(user.getEmail(), user.getPassword());
		return result;
	}
	
	@Override
	public void deleteUser(String id) {
		User user = userRepository.findOne(id);
		if (user != null)
		{
		userRepository.delete(id);
		}
	}
	
	
}
