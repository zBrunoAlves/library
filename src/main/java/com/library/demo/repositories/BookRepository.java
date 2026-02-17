package com.library.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.demo.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
