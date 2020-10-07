package com.example.orderbook.security.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.orderbook.client.model.Clients;

@Entity
public class Scrip implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String scripId;
	
	@Column
	private Long currentPrice;

	@OneToMany(mappedBy = "scrip")
	private Set<Clients> clients;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Long currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public String getScripId() {
		return scripId;
	}

	public void setScripId(String scripId) {
		this.scripId = scripId;
	}

	public Set<Clients> getClients() {
		return clients;
	}

	public void setClients(Set<Clients> clients) {
		this.clients = clients;
	}
	
}
