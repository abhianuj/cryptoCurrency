package com.crypto.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRYPTO")
public class CryptoModel {
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer value;
	@Column
	private String currency;
	
	public CryptoModel() {
		
	}
	
	public CryptoModel(Integer id, String name, Integer value, String currency) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.currency = currency;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}