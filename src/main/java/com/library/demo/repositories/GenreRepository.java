package com.library.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.demo.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
