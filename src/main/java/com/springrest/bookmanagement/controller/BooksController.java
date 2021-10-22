package com.springrest.bookmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.bookmanagement.model.Books;
import com.springrest.bookmanagement.services.BooksServices;

@RestController
public class BooksController {
	
	@Autowired
	private BooksServices booksServices;
	
	 
	@GetMapping("/books")
	public List<Books> getBooks(){
		return this.booksServices.getBooks();
	}
	
	@GetMapping("/books/{bookCode}")
	public Books getBook(@PathVariable String bookCode) {
		return this.booksServices.getBook(Long.parseLong(bookCode));
	}
	
	@PostMapping("/books")
	public Books addBooks(@RequestBody Books book) {
		return this.booksServices.addBooks(book);
	}
	
	@PutMapping("/books")
	public Books updateBooks(@RequestBody Books book) {
		return this.booksServices.updateBooks(book);
	}
	
	@DeleteMapping("/books/{bookCode}")
	public void deleteBooks(@PathVariable String bookCode) {
		this.booksServices.deleteBook(Long.parseLong(bookCode));
	}
}
