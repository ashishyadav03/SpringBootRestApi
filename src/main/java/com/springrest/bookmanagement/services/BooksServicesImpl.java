package com.springrest.bookmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.bookmanagement.model.Books;
import com.springrest.bookmanagement.repository.BooksRepository;

@Service
public class BooksServicesImpl implements BooksServices {

	@Autowired
	private BooksRepository booksRepository;
	

	
	@Override
	public List<Books> getBooks() {
		 
		return booksRepository.findAll();
	}

	@Override
	public Books getBook(long parseLong) {
 
		return booksRepository.findById(parseLong).get();
	}

	@Override
	public Books addBooks(Books book) {
  		return booksRepository.save(book);
	}

	@Override
	public Books updateBooks(Books book) {
		
 
 		return booksRepository.save(book);
	}

	@Override
	public void deleteBook(long parseLong) {
		Books entity = booksRepository.getById(parseLong);
 		booksRepository.delete(entity);
	}

}
