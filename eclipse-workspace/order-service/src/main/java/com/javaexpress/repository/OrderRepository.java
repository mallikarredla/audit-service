package com.javaexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

}
