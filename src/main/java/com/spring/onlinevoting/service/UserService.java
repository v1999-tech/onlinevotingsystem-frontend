package com.spring.onlinevoting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onlinevoting.entity.User;
import com.spring.onlinevoting.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}

	public boolean deleteUser() {
		try {
			userRepository.deleteAll();
		}
		catch(Exception e) {
			return true;
		}
		return false;
	}

	public User updateUser(int userId, User obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
