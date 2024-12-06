/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class Review {

    private String id;
    private String description;
    private double rating;

    Review(String id, String description, float rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return "id: " + id + "description: " + description + "rating: " + rating;
    }

}
