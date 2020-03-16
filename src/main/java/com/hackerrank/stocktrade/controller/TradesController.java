package com.hackerrank.stocktrade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/trades")
public class TradesController {
    
    @RequestMapping(method=RequestMethod.POST)
	public void addTrades() {
		
	}
    @RequestMapping(method=RequestMethod.GET)
	public void getAllTrades() {
		
	}
    @RequestMapping(method=RequestMethod.DELETE)
	public void deleteAllTrades() {
		
	}
    
}
