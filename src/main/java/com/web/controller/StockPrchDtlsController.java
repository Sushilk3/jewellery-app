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

import com.web.model.StockPrchDtls;
import com.web.services.StockPrchDtlsService;
import com.web.util.CustomErrorType;

@RestController
@RequestMapping("/stockPrchDtls")
public class StockPrchDtlsController {
	

	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	@Autowired
	private StockPrchDtlsService stockPrchDtlsService;

	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<Object> stockList() {

		logger.info("stockPrchDtls list ");
	
		List<StockPrchDtls> stockPurchaseDetailsList = stockPrchDtlsService.stockPurchaseDetailsList();

		if (stockPurchaseDetailsList.size() == 0) {
			logger.error("sstockPrchDtls Data not found ");
			return new ResponseEntity<Object>(new CustomErrorType("stock not found "),
					HttpStatus.OK);
		}

		return new ResponseEntity<Object>(stockPurchaseDetailsList, HttpStatus.OK);

	}

	

}
