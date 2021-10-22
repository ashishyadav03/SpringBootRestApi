package com.springrest.bookmanagement.services;

import java.util.List;

import com.springrest.bookmanagement.model.Books;

public interface BooksServices {

	public List<Books> getBooks();

	public Books getBook(long parseLong);

	public Books addBooks(Books book);

	public Books updateBooks(Books book);

	public void deleteBook(long parseLong);

}
