package com.seeddesafiocdc.desafiocdc.repository;

import com.seeddesafiocdc.desafiocdc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
