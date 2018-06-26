package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Gold;
import com.web.repository.GoldRepository;

@Service
public class GoldServiceImpl implements GoldService {

	@Autowired
	GoldRepository goldRepository;

	@Override
	public String add(Gold gold) {
		goldRepository.save(gold);
		return "Order added Successfully";
	}

	@Override
	public List<Gold> getALL() {
		return  goldRepository.findAll();
	}

}
