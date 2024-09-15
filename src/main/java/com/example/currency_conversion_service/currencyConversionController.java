package com.example.currency_conversion_service;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class currencyConversionController {

	@GetMapping("/currecy-conversion/from/{from}/to/{to}/quantity/{quantity}")
	
	public CurrencyConversion calculatecurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal  quantity ) {
		
		HashMap<String,String> uriVariables=new HashMap<>();
		uriVariables.put("from",from);
		uriVariables.put("to",to);
		
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversion.class,uriVariables);
		
		CurrencyConversion currencyconversion = responseEntity.getBody();
		
		return new CurrencyConversion(currencyconversion.getId(),from,to,currencyconversion.getConversion_multiple(),quantity,quantity.multiply(quantity));
	}
	
}
