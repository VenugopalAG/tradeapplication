package com.example.orderbook.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderbook.client.model.Clients;

@Repository
public interface ClientRepository  extends JpaRepository<Clients, Long>{

	public Clients findByClientId(String cleintId);
}
