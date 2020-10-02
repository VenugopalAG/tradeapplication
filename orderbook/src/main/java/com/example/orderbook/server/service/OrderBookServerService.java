package com.example.orderbook.server.service;

import com.example.orderbook.server.model.OrderBook;

public interface OrderBookServerService {

	public OrderBook placeOrder(OrderBook order);
}
