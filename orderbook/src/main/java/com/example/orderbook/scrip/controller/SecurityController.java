package com.example.orderbook.scrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderbook.scrip.service.ScripService;
import com.example.orderbook.security.model.Scrip;

@RestController
public class SecurityController {

	@Autowired
	private ScripService scripService;
	
	@PostMapping("/scrips")
	public Scrip addScrip(@RequestBody Scrip scrip) {
		scripService.addScrip(scrip);
		return scrip;
	}
	
	@GetMapping("/scrips") 
	public List<Scrip> listAllScrip(){
		return scripService.listAllScrip();
	}
	
	@GetMapping("/scrips/{scripId}") 
	public Scrip getScrip(@PathVariable Long scripId){
		return scripService.getScrip(scripId);
	}
	
	@DeleteMapping("/scrips/{scripId}") 
	public String deleteScrip(@PathVariable Long scripId){
		return scripService.deleteScrip(scripId);
	}
}
