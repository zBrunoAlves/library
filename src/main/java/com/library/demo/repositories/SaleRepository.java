package com.library.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.demo.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
