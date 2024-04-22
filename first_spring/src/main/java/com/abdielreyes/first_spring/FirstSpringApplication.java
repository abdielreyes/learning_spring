package com.abdielreyes.first_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
		// Alien obj2 = context.getBean(Alien.class);
		// obj2.code();

	}

}
