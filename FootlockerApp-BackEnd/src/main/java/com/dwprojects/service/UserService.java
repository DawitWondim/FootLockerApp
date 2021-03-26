package com.dwprojects.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dwprojects.model.User;
import com.dwprojects.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
    UserRepository userRepository;
	
	@Cacheable("users")
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
}
