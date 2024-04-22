package com.curso.springboot.vscode.springbootvsc;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.vscode.springbootvsc.models.MessageDTO;

@RestController
@SpringBootApplication
public class SpringbootVscApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootVscApplication.class, args);
	}

	@GetMapping("/api/message")
	public MessageDTO messageView() {
		return new MessageDTO(LocalDateTime.now(), "Hello, World!");
	}

}
