package com.springclass.library.repositories;

import com.springclass.library.model.Author;
import com.springclass.library.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {
    Optional<Subject> findByTitle(String subjects);
}
