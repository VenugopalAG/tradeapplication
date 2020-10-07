package com.example.orderbook.scrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderbook.security.model.Scrip;

public interface ScripRepository extends JpaRepository<Scrip, Long> {

	public Scrip  findByScripId(String scripId);
	
}
