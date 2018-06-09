package com.webapplication.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapplication.model.User;

public interface UserRepository extends CrudRepository<User,String> {

	@Query("select user from User  user where user.email =?1 and user.password =?2")	
	User findUser(String email,String password);
	
}
