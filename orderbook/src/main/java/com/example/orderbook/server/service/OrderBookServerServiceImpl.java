package com.example.orderbook.server.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderbook.Producer;
import com.example.orderbook.client.model.Clients;
import com.example.orderbook.client.repository.ClientRepository;
import com.example.orderbook.scrip.repository.ScripRepository;
import com.example.orderbook.security.model.Scrip;
import com.example.orderbook.server.model.OrderBook;
import com.example.orderbook.server.repository.OrderBookServerRepository;

@Service
@Transactional
public class OrderBookServerServiceImpl implements OrderBookServerService{

	@Autowired
	private OrderBookServerRepository OrderBookServerRepository;
	
	@Autowired
	private Producer producer;
	
	@Autowired
	private ScripRepository scripRepository;
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public OrderBook placeOrder(OrderBook order) {
		
		Clients client = clientRepository.findByClientId(order.getClientId());
		Scrip scrip = scripRepository.findByScripId(order.getSecurityId());
		client.setScrip(scrip);
		clientRepository.save(client);
		OrderBookServerRepository.save(order);
		
		producer.send(order);
		return order;
	}

}
