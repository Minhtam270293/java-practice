/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practice.string;

/**
 *
 * @author NguyenMinhTam
 */
public class PracticeString {

    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = new String("Hello");

//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        int n = s1.length();
//        System.out.println(n);
//
//        String greet = "Good morning   ";
//        System.out.println(greet.trim());
//        System.out.println(greet.isEmpty());
//
//        char letter = greet.charAt(3);
//        System.out.println(letter);
//
//        System.out.println(s1.compareTo("Gello"));
//        System.out.println(s1.compareTo("Kellolllll"));
//        System.out.println(s1.compareTo("Kello"));
//        TestString.printUppercase("This is A Test Text");
        String text2 = "1Love2Hate3Peace";
        int valueText2 = TestString.calcDigit(text2);
        System.out.println(valueText2);
        TestString.upperString(text2);
    }
}
