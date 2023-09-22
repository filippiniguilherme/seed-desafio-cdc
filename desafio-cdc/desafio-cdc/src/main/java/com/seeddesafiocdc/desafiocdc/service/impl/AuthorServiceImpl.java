package com.seeddesafiocdc.desafiocdc.service.impl;

import com.seeddesafiocdc.desafiocdc.domain.Author;
import com.seeddesafiocdc.desafiocdc.dto.AuthorDTO;
import com.seeddesafiocdc.desafiocdc.repository.AuthorRepository;
import com.seeddesafiocdc.desafiocdc.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<List<Author>> getAll() {
        return Optional.of(authorRepository.findAll());
    }

    public AuthorDTO save(Author author) {
        return AuthorDTO.create(authorRepository.save(author));
    }


}
