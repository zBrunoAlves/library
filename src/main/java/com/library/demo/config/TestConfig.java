package com.library.demo.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.library.demo.entities.Author;
import com.library.demo.entities.Book;
import com.library.demo.entities.Genre;
import com.library.demo.entities.Loan;
import com.library.demo.entities.Sale;
import com.library.demo.entities.User;
import com.library.demo.repositories.AuthorRepository;
import com.library.demo.repositories.BookRepository;
import com.library.demo.repositories.GenreRepository;
import com.library.demo.repositories.LoanRepository;
import com.library.demo.repositories.SaleRepository;
import com.library.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private GenreRepository genreRepository;

	@Autowired
	private LoanRepository loanRepository;

	@Autowired
	private SaleRepository saleRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Bruno", "bruno@gmail.com", "admin", "céu", "12345678900");
		User u2 = new User(null, "Jessica", "jessica@gmail.com", "admin", "céu2", "40028922");
		userRepository.saveAll(Arrays.asList(u1, u2));

		Author a1 = new Author(null, "Bruno");
		Author a2 = new Author(null, "Jessica");
		authorRepository.saveAll(Arrays.asList(a1, a2));

		Genre g1 = new Genre(null, "medo");
		genreRepository.saveAll(Arrays.asList(g1));

		Book b1 = new Book(null, "teste", 2025, 5, new BigDecimal("56.00"), g1, a1);
		Book b2 = new Book(null, "teste", 1900, 5, new BigDecimal("2.00"), g1, a2);
		bookRepository.saveAll(Arrays.asList(b1, b2));

		Loan l1 = new Loan(u2, LocalDate.of(2026, 1, 1), LocalDate.of(2026, 2, 2));
		Loan l2 = new Loan(u1, LocalDate.of(2026, 3, 5), LocalDate.of(2026, 5, 7));
		loanRepository.saveAll(Arrays.asList(l1, l2));

		Sale s1 = new Sale(null, LocalDate.of(2026, 5, 12), u2);
		Sale s2 = new Sale(null, LocalDate.of(2023, 5, 12), u1);
		saleRepository.saveAll(Arrays.asList(s1, s2));
	}

}
