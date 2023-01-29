package com.shoppingcart.service.impl;

import org.springframework.stereotype.Service;

import com.shoppingcart.exception.ShoppingCartException;
import com.shoppingcart.model.LoginRequest;
import com.shoppingcart.model.LoginResponse;
import com.shoppingcart.service.LoginManagementService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoginManagementServiceImpl implements LoginManagementService {

	@Override
	public LoginResponse loginProcess(LoginRequest loginRequest, HttpServletRequest httpServletRequest)
			throws ShoppingCartException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginResponse logoutProcess(LoginRequest loginRequest, HttpServletRequest httpServletRequest)
			throws ShoppingCartException {
		// TODO Auto-generated method stub
		return null;
	}

}
