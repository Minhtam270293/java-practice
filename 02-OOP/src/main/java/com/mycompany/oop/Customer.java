/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
class Customer {

    // state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    // creating
    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    // operations
    public void setWorkAddress(Address newAddress) {
        this.workAddress = newAddress;
    }

    public void setHomeAddress(Address newAddress) {
        this.homeAddress = newAddress;
    }

    public Address getWorkAddres() {
        return this.workAddress;
    }

    public Address getHomekAddres() {
        return this.homeAddress;
    }

    public String toString() {
        return String.format("name - [%s] home address - [%s] - work address - [%s]", name, homeAddress, workAddress);
    }

}
