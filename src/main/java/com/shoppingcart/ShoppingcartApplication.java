package com.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ShoppingcartApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		log.info("--------> ShoppingcartApplication started..");
		SpringApplication.run(ShoppingcartApplication.class, args);
	}
}
