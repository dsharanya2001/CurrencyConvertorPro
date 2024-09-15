package com.example.currency_conversion_service;

import java.math.BigDecimal;



public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversion_multiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private String env;
	
	public CurrencyConversion() {
		super();
	}

	public CurrencyConversion(Long id, String from, String to, BigDecimal conversion_multiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion_multiple = conversion_multiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversion_multiple() {
		return conversion_multiple;
	}

	public void setConversion_multiple(BigDecimal conversion_multiple) {
		this.conversion_multiple = conversion_multiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
	
	
}