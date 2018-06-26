package com.web.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Gold;
import com.web.services.GoldService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private GoldService goldService;
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Object> addOrder(@RequestBody Gold goldBean) {
		return new ResponseEntity<Object>(goldService.add(goldBean), HttpStatus.OK);
	}

	
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Gold> getAllOrder() {
		List<Gold> orderdtos = goldService.getALL();
		return orderdtos;
	}

}
