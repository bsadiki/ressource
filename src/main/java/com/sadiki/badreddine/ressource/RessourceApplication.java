package com.sadiki.badreddine.ressource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class RessourceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RessourceApplication.class, args);
	}
}
