package com.example.orderbook.server.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderbook.Producer;
import com.example.orderbook.server.model.OrderBook;
import com.example.orderbook.server.repository.OrderBookServerRepository;

@Service
@Transactional
public class OrderBookServerServiceImpl implements OrderBookServerService{

	@Autowired
	private OrderBookServerRepository OrderBookServerRepository;
	
	@Autowired
	private Producer producer;

	@Override
	public OrderBook placeOrder(OrderBook order) {
		
		OrderBookServerRepository.save(order);
		producer.send(order);
		return order;
	}

}
