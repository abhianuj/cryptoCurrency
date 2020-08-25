package com.crypto.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crypto.demo.model.CryptoModel;
import com.crypto.demo.repository.CryptoRepo;

@Service
public class CryptoService {

	@Autowired
	CryptoRepo cryptoRepo;
	
	public List<CryptoModel> getAllCrypto(){
		List<CryptoModel> cryptoData = new ArrayList<CryptoModel>();
		for(CryptoModel cryptoModel : cryptoRepo.findAll()) {
			cryptoData.add(cryptoModel);
		}
		return cryptoData;
	}
	
	public CryptoModel getCrypto(Integer id) {
		Optional<CryptoModel> cryptoData = cryptoRepo.findById(id);
		if(cryptoData.isPresent()) {
			return cryptoData.get();
		}
		return null;	
	}
	
	public void addCrypto(CryptoModel cryptoModel) {
		cryptoRepo.save(cryptoModel);
	}
	
}
