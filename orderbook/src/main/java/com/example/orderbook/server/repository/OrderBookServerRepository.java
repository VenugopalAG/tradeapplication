package com.example.orderbook.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderbook.server.model.OrderBook;

@Repository
public interface OrderBookServerRepository extends JpaRepository<OrderBook, Long> {

}
