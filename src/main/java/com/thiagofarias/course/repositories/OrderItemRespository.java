package com.thiagofarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagofarias.course.entities.OrderItem;

public interface OrderItemRespository extends JpaRepository<OrderItem, Long> {

}
