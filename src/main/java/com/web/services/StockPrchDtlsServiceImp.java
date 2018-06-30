package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.StockPrchDtls;
import com.web.repository.StockPrchDtlsRepository;


@Service
public class StockPrchDtlsServiceImp implements StockPrchDtlsService {

	@Autowired
	private StockPrchDtlsRepository stockPurchaseDetailsRepository;
	
	@Override
	public List<StockPrchDtls> stockPurchaseDetailsList(){
		// TODO Auto-generated method stub
		return stockPurchaseDetailsRepository.findAll();
	}

}
