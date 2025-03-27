package com.library.model;

import jakarta.validation.constraints.*;

public class Book {
    @NotNull(message = "ID is required")
    @Min(value = 1, message = "ID must be positive")
    private Integer id;

    @NotBlank(message = "Title is required")
    @Size(max = 100, message = "Title too long")
    private String title;

    @NotBlank(message = "Author is required")
    @Size(max = 50, message = "Author name too long")
    private String author;

    @Size(max = 30, message = "Genre too long")
    private String genre;

    @NotBlank(message = "Availability required")
    private String availability;

    // Required no-arg constructor
    public Book() {
        this.availability = "Available";
    }

    // Getters and Setters (for all fields)
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public String getAvailability() { return availability; }
    public void setAvailability(String availability) { this.availability = availability; }
    
}
 