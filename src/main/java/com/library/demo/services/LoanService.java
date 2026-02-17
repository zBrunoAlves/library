package com.library.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.library.demo.entities.Loan;
import com.library.demo.repositories.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository repository;

	public List<Loan> findAll() {
		return repository.findAll();
	}

	public Loan findById(Long id) {
		Optional<Loan> obj = repository.findById(id);
		return obj.get();
	}
}
