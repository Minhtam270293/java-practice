package com.mycompany.practice.basic.oop;

import java.math.BigDecimal;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NguyenMinhTam
 */
public class SimpleInterest {

    private BigDecimal principal;
    private BigDecimal interest;

    SimpleInterest(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }

    ;

    public BigDecimal calcTotal(int year) {
        BigDecimal formattedYear = new BigDecimal(year);
        return principal.add(principal.multiply(interest).multiply(formattedYear));
    }
}
