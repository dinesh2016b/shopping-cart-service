package com.shoppingcart.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.shoppingcart.exception.ShoppingCartException;
import com.shoppingcart.model.LoginRequest;
import com.shoppingcart.model.LoginResponse;
import com.shoppingcart.service.LoginManagementService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoginManagementServiceImpl implements LoginManagementService {

	private Logger log = LoggerFactory.getLogger(LoginManagementServiceImpl.class);
	
	@Override
	public LoginResponse loginProcess(LoginRequest loginRequest, HttpServletRequest httpServletRequest)
			throws ShoppingCartException {
		log.info("----> loginProcess..");
		return new LoginResponse();
	}

	@Override
	public LoginResponse logoutProcess(LoginRequest loginRequest, HttpServletRequest httpServletRequest)
			throws ShoppingCartException {
		log.info("----> logoutProcess..");
		return new LoginResponse();
	}

}
