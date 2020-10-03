package com.example.orderbook.scrip.service;

import java.util.List;

import com.example.orderbook.security.model.Scrip;

public interface ScripService {
	
	public Scrip addScrip(Scrip scrip);
	
	public List<Scrip> listAllScrip();
	
	public Scrip getScrip(Long scripId);
	
	public String deleteScrip(Long scripId);
	
}
