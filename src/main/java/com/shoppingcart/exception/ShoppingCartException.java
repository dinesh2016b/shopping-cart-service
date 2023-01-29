package com.shoppingcart.exception;

import org.springframework.security.authentication.BadCredentialsException;

public class ShoppingCartException extends Exception {

	private static final long serialVersionUID = 1L;
	private ErrorStatus errorStatus;

	public ShoppingCartException(Throwable throwable) {
		super(throwable);
	}

	public ShoppingCartException(ErrorStatus errorStatus) {
		this.errorStatus = errorStatus;
	}

	public ShoppingCartException(ErrorStatus errorStatus, String message) {
		super(message);
		this.errorStatus = errorStatus;
	}

	public ShoppingCartException(ErrorStatus errorStatus, String message, Throwable throwable) {
		super(message, throwable);
		this.errorStatus = errorStatus;
	}

	public ShoppingCartException(ErrorStatus errorStatus, Throwable throwable) {
		super(throwable);
		this.errorStatus = errorStatus;
	}

	public ShoppingCartException(String message, BadCredentialsException e) {
		super(message);
	}

	public ErrorStatus getErrorStatus() {
		return errorStatus;
	}

}
