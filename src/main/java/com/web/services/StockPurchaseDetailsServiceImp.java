package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.StockPurchaseDetails;
import com.web.repository.StockPurchaseDetailsRepository;


@Service
public class StockPurchaseDetailsServiceImp implements StockPurchaseDetailsService {

	@Autowired
	private StockPurchaseDetailsRepository stockPurchaseDetailsRepository;
	
	@Override
	public List<StockPurchaseDetails> stockPurchaseDetailsList(){
		// TODO Auto-generated method stub
		return stockPurchaseDetailsRepository.findAll();
	}

}
