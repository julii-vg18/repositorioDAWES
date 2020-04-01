package com.dawes;

import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareaFinalDawesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaFinalDawesApplication.class, args);
		Persistence.generateSchema("jpa", null);
	}

}
