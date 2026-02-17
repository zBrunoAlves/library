package com.library.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.library.demo.entities.Genre;
import com.library.demo.repositories.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repository;
	
	public List<Genre> findAll(){
		return repository.findAll();
	}
	
	public Genre findById(Long id) {
		Optional<Genre> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
