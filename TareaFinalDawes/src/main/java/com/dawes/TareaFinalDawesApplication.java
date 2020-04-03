package com.dawes;

import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TareaFinalDawesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaFinalDawesApplication.class, args);
		Persistence.generateSchema("jpa", null);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
