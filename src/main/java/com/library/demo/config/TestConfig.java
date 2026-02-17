package com.library.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.library.demo.entities.User;
import com.library.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Bruno", "bruno@gmail.com", "admin", "céu", "12345678900");
		User u2 = new User(null, "Jessica", "jessica@gmail.com", "admin", "céu2", "40028922");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
