/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.basic.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class MyChar {

    private char x;

    MyChar(char x) {
        this.x = x;
    }

    public char get() {
        return this.x;
    }

    public boolean isVowel() {
        char[] vowels = {'a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'};

        for (int i = 0; i < vowels.length; i++) {
            if (this.x == vowels[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumber() {
        int[] digitRange = {48, 57};

        if ((int) this.x >= digitRange[0] && (int) this.x <= digitRange[1]) {
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        int[] lowercaseRange = {97, 122};
        int[] uppercaseRange = {65, 90};

        if (((int) this.x >= lowercaseRange[0] && (int) this.x <= lowercaseRange[1])
                || ((int) this.x >= uppercaseRange[0] && (int) this.x <= uppercaseRange[1])) {
            return true;
        }
        return false;
    }

    public void printLowerCase() {
        if (this.isAlphabet()) {

            if ((int) this.x >= 65 && (int) this.x <= 90) {
                int charcode = (int) this.x + 32;
                System.out.println((char) charcode);
            } else {
                System.out.println(this.x);
            }
        }
    }

    public void printUpperCase() {
        if (this.isAlphabet()) {

            if ((int) this.x >= 97 && (int) this.x <= 122) {
                int charcode = (int) this.x - 32;
                System.out.println((char) charcode);
            } else {
                System.out.println(this.x);
            }
        }
    }

}
