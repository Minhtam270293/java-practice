/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coding.exercises.set2;

/**
 *
 * @author NguyenMinhTam
 */
public class Dimension {

    private int feet;
    private int inches;

    public Dimension(int inches) {
        if (inches > 0) {
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }

    public int getFeet() {
        return this.feet;
    }

    public int getInches() {
        return this.inches;
    }

}
