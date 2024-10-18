/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coding.exercises.set2;

/**
 *
 * @author NguyenMinhTam
 */
public class Square {

    private int side;

    public Square(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public int calculateArea() {
        if (side <= 0) {
            return -1;
        }

        return this.side * this.side;
    }

    public int caclulatePerimeter() {
        if (side <= 0) {
            return -1;
        }
        return this.side * 4;
    }

}
