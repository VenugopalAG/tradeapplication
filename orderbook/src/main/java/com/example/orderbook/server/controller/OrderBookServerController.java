package com.example.orderbook.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderbook.server.model.OrderBook;
import com.example.orderbook.server.service.OrderBookServerService;

@RestController
public class OrderBookServerController {

	@Autowired
	private OrderBookServerService orderBookServerService;
	
	@PostMapping("/order")
	public OrderBook placeOrder(@RequestBody OrderBook order) {
		orderBookServerService.placeOrder(order);
		return order;
	}
}
