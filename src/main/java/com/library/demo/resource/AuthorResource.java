package com.library.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.library.demo.entities.Author;
import com.library.demo.services.AuthorService;

@RestController
@RequestMapping(value = "/authors")
public class AuthorResource {

	@Autowired
	private AuthorService service;

	@GetMapping
	public ResponseEntity<List<Author>> findAll() {
		List<Author> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Author> findById(@PathVariable Long id) {
		Author obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
