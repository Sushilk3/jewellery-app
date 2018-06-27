package com.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Stock;
import com.web.services.StockService;
import com.web.util.CustomErrorType;

@RestController
@RequestMapping("/stock")
public class StockController {
	
	
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private StockService stockService;

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<Object> stockList() {

		logger.info("stock list ");
	
		List<Stock> stockList = stockService.stockList();

		if (stockList.size() == 0) {
			logger.error("stock not found ");
			return new ResponseEntity<Object>(new CustomErrorType("stock not found "),
					HttpStatus.OK);
		}

		return new ResponseEntity<Object>(stockList, HttpStatus.OK);

	}


}
