package com.crypto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crypto.demo.model.CryptoModel;
import com.crypto.demo.service.CryptoService;

@RestController
@RequestMapping("/api")
public class CryptoController {
	
	private CryptoService cryptoService;
	
	@Autowired
	public CryptoController(CryptoService cryptoService) {
		this.cryptoService = cryptoService;
	}

	@GetMapping("/all")
	public List<CryptoModel> getAllCrypto(){
		return cryptoService.getAllCrypto();
	}
	
}
