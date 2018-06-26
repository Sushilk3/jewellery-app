package com.web.services;

import java.util.List;

import com.web.model.Gold;

public interface GoldService {
	
	public String add(Gold goldBean);
	
	public List<Gold> getALL();

}
