package com.crypto.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crypto.demo.model.CryptoModel;
import com.crypto.demo.repository.CryptoRepo;

@Service
public class CryptoService {

	@Autowired
	CryptoRepo cryptoRepo;
	public List<CryptoModel> getAllCrypto(){
		List<CryptoModel> cryptoCurrency = cryptoRepo.getAllCoins();
		return cryptoCurrency;
	}
	
}
