/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
class Address {

    private String line1;
    private String city;
    private String zip;

    // creation
    public Address(String line1, String city, String zip) {
        super();
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + " " + city + " " + zip;
    }

}
