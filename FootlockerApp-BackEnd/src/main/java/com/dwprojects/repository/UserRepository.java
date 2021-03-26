package com.dwprojects.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwprojects.model.User;

public interface UserRepository extends JpaRepository <User, Integer>
{
	public List<User> findAll();
}
