package com.goldilocks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldilocks.entity.User;
import com.goldilocks.exception.InvalidCredentialException;
import com.goldilocks.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public User loginUser(User user) throws InvalidCredentialException {
		// TODO Auto-generated method stub
		
		User loginUser = userRepo.findByUsername(user.getUsername());
		
		if(loginUser == null) {
			throw new InvalidCredentialException("username is not correct");
		}
		
		if (!loginUser.getPassword().equals(user.getPassword())) {
			throw new InvalidCredentialException("password is not correct");
		}
		
		return user;
	}

}
