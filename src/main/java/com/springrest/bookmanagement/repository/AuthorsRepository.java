package com.springrest.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.bookmanagement.model.Authors;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors, Long>{

}
