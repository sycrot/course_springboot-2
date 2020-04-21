package com.thiagofarias.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagofarias.course.entities.Category;
import com.thiagofarias.course.repositories.CategoryRespository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRespository repository;
	
	public List<Category> findAll() {
		
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}

}
