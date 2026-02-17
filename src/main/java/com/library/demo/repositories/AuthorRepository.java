package com.library.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.demo.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
