/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.string;

/**
 *
 * @author NguyenMinhTam
 */
public class TestString {

    public static void printUppercase(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                System.out.println(a.charAt(i));
            }
        }
    }

    ;

    public static int calcDigit(String a) {
        int sum = 0;
        int value = 0;
        for (int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);

            if (Character.isDigit(current)) {
                value = Character.getNumericValue(current);
                sum += value;
            }
        }
        return sum;
    }

    public static void upperString(String a) {
        System.out.println(a.toUpperCase());
    }
}
