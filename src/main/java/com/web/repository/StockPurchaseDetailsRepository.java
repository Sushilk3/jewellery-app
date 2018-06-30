package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.StockPurchaseDetails;

public interface StockPurchaseDetailsRepository extends JpaRepository<StockPurchaseDetails, Integer>  {
	

}
