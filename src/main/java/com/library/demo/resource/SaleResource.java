package com.library.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.demo.entities.Sale;
import com.library.demo.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource {
	
	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<List<Sale>> findAll(){
		List<Sale> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Sale> findById(@PathVariable Long id){
		Sale obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
}
