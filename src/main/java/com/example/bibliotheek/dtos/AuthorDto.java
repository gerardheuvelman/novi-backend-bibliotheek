package com.example.bibliotheek.dtos;

import com.example.bibliotheek.models.Gender;

import java.time.LocalDate;
import java.util.UUID;

public class AuthorDto {

    private Long id;
    private String initials;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private Gender gender;

    public AuthorDto( String initials, String firstname, String lastname, LocalDate dateOfBirth, Gender gender) {
        this.initials = initials;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getInitials() {
        return initials;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}