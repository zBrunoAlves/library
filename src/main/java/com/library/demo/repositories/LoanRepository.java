package com.library.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.demo.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
