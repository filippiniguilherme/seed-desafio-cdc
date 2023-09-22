package com.seeddesafiocdc.desafiocdc.service;

import com.seeddesafiocdc.desafiocdc.domain.Author;
import com.seeddesafiocdc.desafiocdc.dto.AuthorDTO;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<List<Author>> getAll();

    AuthorDTO save(final Author author);
}
