package com.codingdojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CadenasController {
	
	@GetMapping("/")
	public String rutaRaiz() {
		return "Hello client! How are you doing?";
	}
	
	@GetMapping("/random")
	public String rutaRandom() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
