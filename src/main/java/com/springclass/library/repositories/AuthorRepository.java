package com.springclass.library.repositories;

import com.springclass.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Optional<Author> findByName(String name);
}
