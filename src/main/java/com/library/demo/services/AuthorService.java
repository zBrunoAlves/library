package com.library.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.library.demo.entities.Author;
import com.library.demo.repositories.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repository;
	
	
	public List<Author> findAll(){
		return repository.findAll();
	}
	
	public Author findById(Long id) {
		Optional<Author> obj = repository.findById(id);
		return obj.get();
	}
}
