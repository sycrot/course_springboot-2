package com.thiagofarias.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagofarias.course.entities.Order;
import com.thiagofarias.course.repositories.OrderRespository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRespository repository;
	
	public List<Order> findAll() {
		
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}

}
