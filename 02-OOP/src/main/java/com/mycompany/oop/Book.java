/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

import java.util.ArrayList;

/**
 *
 * @author NguyenMinhTam
 */
public class Book {

    private String id;
    private String name;
    private String author;
    private ArrayList<Review> reviews;

    // creation
    Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.reviews = new ArrayList<>();
    }

    // operations
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addReview(Review newReview) {
        this.reviews.add(newReview);
    }

    public String toString() {
        return String.format("name - [%s], author - [%s], review - [%s]", name, author, reviews);
    }
}
