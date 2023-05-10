package com.example.Order.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Order.Model.Order;
import com.example.Order.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	private static final Logger logger = LoggerFactory.getLogger(OrdersController.class);

	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/{id}")
	ResponseEntity<Order> getOrderByID(@PathVariable String id){
		logger.info("Logging an Controller message"+id);
		System.out.println("Logging an Controller message"+id);
		return ResponseEntity.ok(orderService.getOrderByID(id));
	}

}
