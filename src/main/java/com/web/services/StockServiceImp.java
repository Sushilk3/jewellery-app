package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Stock;
import com.web.repository.StockRepository;

@Service
public class StockServiceImp implements  StockService {

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public List<Stock> stockList() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
	}

}
