package com.promineotech.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HttpController {

	/**
	 * GET == read
	 */
	@GetMapping
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.status(HttpStatus.OK).body("HI");
	}
}
