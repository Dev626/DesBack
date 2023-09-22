package com.ovenfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusinessApplication {
	
	public static String dsOauth2 = "dsoauth2";
	public static String propertiesFile;
 
	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}
	
}