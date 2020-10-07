package com.example.orderbook.client.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderbook.client.model.Clients;
import com.example.orderbook.client.repository.ClientRepository;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Clients addClient(Clients client) {
		clientRepository.save(client);
		return client;
	}
}
