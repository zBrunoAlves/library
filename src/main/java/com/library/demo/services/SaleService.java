package com.library.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.library.demo.entities.Sale;
import com.library.demo.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	public List<Sale> findAll() {
		return repository.findAll();
	}

	public Sale findById(Long id) {
		Optional<Sale> obj = repository.findById(id);
		return obj.get();
	}
}
