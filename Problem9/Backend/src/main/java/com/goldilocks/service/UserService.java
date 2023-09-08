package com.goldilocks.service;

import com.goldilocks.entity.User;
import com.goldilocks.exception.InvalidCredentialException;


public interface UserService {
	
	public User loginUser(User user) throws InvalidCredentialException;

}
