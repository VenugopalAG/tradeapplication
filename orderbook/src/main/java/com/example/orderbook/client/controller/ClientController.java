package com.example.orderbook.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderbook.client.model.Clients;
import com.example.orderbook.client.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping("/clients")
	public Clients addClient(@RequestBody Clients client) {
		clientService.addClient(client);
		return client;
	}
}
