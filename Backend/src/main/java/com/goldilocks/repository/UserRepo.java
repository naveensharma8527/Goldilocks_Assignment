package com.goldilocks.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.goldilocks.entity.User;

public interface UserRepo extends JpaRepository<User,String>{

	User findByUsername(String email);

	
}