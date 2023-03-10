package com.example.bibliotheek.dtos;

import com.example.bibliotheek.models.Gender;

import java.time.LocalDate;
import java.util.UUID;

public record AuthorDto(Long id, String initials, String firstname, String lastname, LocalDate dateOfBirth,
                        Gender gender) {

}
