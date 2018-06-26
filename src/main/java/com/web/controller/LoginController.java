package com.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.User;
import com.web.services.UserService;
import com.web.util.CustomErrorType;

@RestController
@RequestMapping("/")
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Object> Login(@ModelAttribute("user") User user, ModelMap modelMap) {

		logger.info("Login User {}", user);

		User currentUser = userService.findUserByEmailandPassword(user.getEmail(), user.getPassword());

		if (currentUser == null) {
			logger.error("User Email  {} not found.", user.getEmail());
			return new ResponseEntity<Object>(new CustomErrorType("User with id " + user.getEmail() + " not found."),
					HttpStatus.OK);
		}

		return new ResponseEntity<Object>(currentUser, HttpStatus.OK);

	}

}
