package com.thiagofarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagofarias.course.entities.Order;

public interface OrderRespository extends JpaRepository<Order, Long> {

}
