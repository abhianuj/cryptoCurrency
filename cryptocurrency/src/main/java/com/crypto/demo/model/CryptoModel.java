package com.crypto.demo.model;

public class CryptoModel {
	private Integer id;
	private String name;
	private Integer value;
	private String currency;
	
	
	
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