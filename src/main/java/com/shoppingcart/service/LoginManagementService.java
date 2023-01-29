package com.shoppingcart.service;


import com.shoppingcart.exception.ShoppingCartException;
import com.shoppingcart.model.LoginRequest;
import com.shoppingcart.model.LoginResponse;

import jakarta.servlet.http.HttpServletRequest;

public interface LoginManagementService {

	public LoginResponse loginProcess(LoginRequest loginRequest, HttpServletRequest httpServletRequest)
			throws ShoppingCartException;

	public LoginResponse logoutProcess(LoginRequest loginRequest, HttpServletRequest httpServletRequest)
			throws ShoppingCartException;
}
