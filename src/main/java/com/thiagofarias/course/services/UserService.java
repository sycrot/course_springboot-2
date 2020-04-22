package com.thiagofarias.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagofarias.course.entities.User;
import com.thiagofarias.course.repositories.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository repository;
	
	public List<User> findAll() {
		
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		
		return repository.save(obj);
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
