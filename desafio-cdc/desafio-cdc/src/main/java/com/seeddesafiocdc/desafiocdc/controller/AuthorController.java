package com.seeddesafiocdc.desafiocdc.controller;

import com.seeddesafiocdc.desafiocdc.domain.Author;
import com.seeddesafiocdc.desafiocdc.dto.AuthorDTO;
import com.seeddesafiocdc.desafiocdc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@ResponseBody
@Validated
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<Optional<List<Author>>> getAuthor() {
        return ResponseEntity.ok(authorService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Author author) throws EntityNotFoundException, IllegalArgumentException {
        AuthorDTO e = authorService.save(author);

        return e != null ? new ResponseEntity<>("Successfully save author.", HttpStatus.OK) : ResponseEntity.notFound().build();
    }
}
