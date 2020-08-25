package com.crypto.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crypto.demo.model.CryptoModel;

@Repository
public class CryptoRepo {
	public List<CryptoModel> getAllCoins(){
		List<CryptoModel> cryptoModel = new ArrayList<>();
		
		CryptoModel bitcoin = new CryptoModel(1,"Bitcoin",28280,"USD");
		CryptoModel etherum = new CryptoModel(2,"Etherum",8210,"USD");
		cryptoModel.add(bitcoin);
		cryptoModel.add(etherum);
		
		return cryptoModel;
	}
}
