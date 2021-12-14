package com.currencyconversion.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currencyconversion.bean.CurrencyConversion;

@FeignClient(name="currency-exchange")
//@FeignClient(name="currency-exchange",url="localhost:8000")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable String from,@PathVariable String to);
	

	}
	
