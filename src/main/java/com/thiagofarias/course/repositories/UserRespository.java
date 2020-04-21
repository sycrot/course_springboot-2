package com.thiagofarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagofarias.course.entities.User;

public interface UserRespository extends JpaRepository<User, Long> {

}
