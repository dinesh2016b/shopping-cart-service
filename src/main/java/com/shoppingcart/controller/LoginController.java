package com.shoppingcart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.model.LoginRequest;
import com.shoppingcart.model.LoginResponse;
import com.shoppingcart.exception.ShoppingCartException;
import com.shoppingcart.service.LoginManagementService;
import com.shoppingcart.util.ApplicationConstants;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600, allowCredentials = "true")
public class LoginController {

	private Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginManagementService loginManagementService;
	@PostMapping(path = ApplicationConstants.ENDPOINT_LOGIN, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest, HttpServletRequest httpServletRequest) throws Exception {
		LoginResponse loginResponse;
		try {
			log.info("----> login EMS..");
			loginResponse = loginManagementService.loginProcess(loginRequest, httpServletRequest);
			log.info("---> Cookies : "+httpServletRequest.getSession().getAttribute("jwt_access_token"));
		} catch (ShoppingCartException e) {
			log.error("EMS exception: " + e.getMessage());
			throw e;
		}

		return ResponseEntity.ok(loginResponse);
	}
}