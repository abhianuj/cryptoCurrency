package com.crypto.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crypto.demo.model.CryptoModel;

@Repository
public interface CryptoRepo extends CrudRepository<CryptoModel, Integer> {
	
}
