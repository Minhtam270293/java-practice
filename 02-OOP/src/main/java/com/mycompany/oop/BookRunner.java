/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class BookRunner {

    public static void main(String[] args) {

        Book onepiece = new Book("12", "One Piece Pirate", "oda");

        onepiece.addReview(new Review("01", "Not good", 3));
        onepiece.addReview(new Review("02", "Do not buy", 2));

        System.out.println(onepiece);

    }
}
