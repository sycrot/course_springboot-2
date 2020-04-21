package com.thiagofarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagofarias.course.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
