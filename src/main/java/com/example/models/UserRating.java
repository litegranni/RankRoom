package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String movie;
    private int rating;

    public UserRating() {
    }

    public UserRating(String username, String movie, int rating) {
        this.username = username;
        this.movie = movie;
        this.rating = rating;
    }

    // Getters och setters

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getMovie() {
        return movie;
    }

    public int getRating() {
        return rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
