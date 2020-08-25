package com.crypto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	//{{url}/api/all}
	@GetMapping("/all")
	public ResponseEntity<List<CryptoModel>> getAllCrypto(){
		List<CryptoModel> cryptoData =  cryptoService.getAllCrypto();
		return new ResponseEntity<List<CryptoModel>>(cryptoData, HttpStatus.OK);
	}
	
	@GetMapping("cryptocoin/{id}")
	public ResponseEntity<CryptoModel> getCryptoById(@PathVariable Integer id){
		CryptoModel cryptoData = cryptoService.getCrypto(id);
		return new ResponseEntity<CryptoModel>(cryptoData,HttpStatus.OK);
	}
	
	@PostMapping("cryptocoin")
	public ResponseEntity<String> addCrypto(@RequestBody CryptoModel cryptoModel){
		cryptoService.addCrypto(cryptoModel);
		return new ResponseEntity<String>("Added Cryptocurrency", HttpStatus.OK);
	}
	
}
