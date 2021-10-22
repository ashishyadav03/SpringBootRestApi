package com.springrest.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.bookmanagement.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{

}
