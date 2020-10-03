package com.example.orderbook.scrip.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderbook.scrip.repository.ScripRepository;
import com.example.orderbook.security.model.Scrip;

@Service
@Transactional
public class ScripServiceImpl implements ScripService{

	@Autowired
	private ScripRepository scripRepository;
	
	@Override
	public Scrip addScrip(Scrip scrip) {
		scripRepository.save(scrip);
		return scrip;
	}

	@Override
	public List<Scrip> listAllScrip() {
		return scripRepository.findAll();
	}

	@Override
	public Scrip getScrip(Long scripId) {
		Optional<Scrip> sc=  scripRepository.findById(scripId);
		if(sc.isPresent()) {
			return sc.get();
		}
		return null;
	}

	@Override
	public String deleteScrip(Long scripId) {
		 scripRepository.deleteById(scripId);
		 return "Sucessfully deleted scrip";
	}

}
