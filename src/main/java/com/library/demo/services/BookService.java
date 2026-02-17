package com.library.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.demo.entities.Book;
import com.library.demo.entities.User;
import com.library.demo.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public List<Book> findAll() {
		return repository.findAll();
	}
	
	
	public Book findById(Long id) {
		Optional<Book> obj = repository.findById(id);
		return obj.get();
	}
	
}
