package com.shoppingcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ShoppingcartApplication extends SpringBootServletInitializer {

	private static Logger log = LoggerFactory.getLogger(ShoppingcartApplication.class);
	
	
	public static void main(String[] args) {
		log.info("--------> ShoppingcartApplication started..");
		SpringApplication.run(ShoppingcartApplication.class, args);
	}
}
