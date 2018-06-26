package com.web.services;

import com.web.model.User;

public interface UserService {

	public User findUserByEmailandPassword(String email, String password);

	public String save(User user);

}
