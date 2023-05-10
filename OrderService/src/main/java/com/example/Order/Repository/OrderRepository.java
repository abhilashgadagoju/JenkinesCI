package com.example.Order.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Order.Model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
