package com.thiagofarias.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiagofarias.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "maria", "maria@maria", "99989", "1223");	
		return ResponseEntity.ok().body(u);
		
	}
	
}
