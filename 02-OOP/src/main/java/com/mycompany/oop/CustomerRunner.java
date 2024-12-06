/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class CustomerRunner {

    public static void main(String[] args) {
        Address homeAddress = new Address("line1", "Tokyo", "5555");
        Customer kid1 = new Customer("Goku", homeAddress);

        Address workAddress = new Address("line 1 for work", "Nagas", "343434");
        kid1.setWorkAddress(workAddress);

        System.out.println(kid1);

    }

}
