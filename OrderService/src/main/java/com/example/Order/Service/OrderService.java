package com.example.Order.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Order.Model.Order;
import com.example.Order.Repository.OrderRepository;

@Service
public class OrderService {
	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

	
	@Autowired
	OrderRepository orderRepository;
	
	
	
	public Order getOrderByID(String id) {
		// TODO Auto-generated method stub
		logger.info("Logging an service message"+id);
		System.out.println("Logging an service message"+id);
		return orderRepository.findById(id).get();
	}

}
