package com.thiagofarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagofarias.course.entities.Product;

public interface ProductRespository extends JpaRepository<Product, Long> {

}
