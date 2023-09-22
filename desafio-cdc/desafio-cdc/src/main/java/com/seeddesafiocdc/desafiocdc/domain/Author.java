package com.seeddesafiocdc.desafiocdc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
public class Author {

    public Author() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    @Email(message = "Invalid email format")
    private String email;
    @NonNull
    @Column(length = 400)
    private String description;
    private LocalDateTime createdDate = LocalDateTime.now();
}
