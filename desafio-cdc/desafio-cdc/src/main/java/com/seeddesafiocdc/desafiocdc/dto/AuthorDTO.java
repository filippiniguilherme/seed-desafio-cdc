package com.seeddesafiocdc.desafiocdc.dto;

import com.seeddesafiocdc.desafiocdc.domain.Author;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class AuthorDTO {
    private Long authorId;
    private String authorName;

    public static AuthorDTO create(Author author) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(author, AuthorDTO.class);
    }
}