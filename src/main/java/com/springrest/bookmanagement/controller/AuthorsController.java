package com.springrest.bookmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.bookmanagement.model.Authors;
import com.springrest.bookmanagement.services.AuthorsServices;

@RestController
public class AuthorsController {

	@Autowired
	private AuthorsServices authorsServices;
	
	@GetMapping("/authors")
	public List<Authors> getBooks(){
		return this.authorsServices.getAuthors();
	}
	
}
