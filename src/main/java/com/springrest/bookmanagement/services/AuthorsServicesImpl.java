package com.springrest.bookmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.bookmanagement.model.Authors;
import com.springrest.bookmanagement.repository.AuthorsRepository;

@Service
public class AuthorsServicesImpl implements AuthorsServices {

	@Autowired
	private AuthorsRepository authorsRepository;

	@Override
	public List<Authors> getAuthors() {
 		return authorsRepository.findAll();
	}
}
