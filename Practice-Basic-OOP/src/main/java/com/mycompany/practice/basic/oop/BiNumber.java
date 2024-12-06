/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.basic.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class BiNumber {

    private int x;
    private int y;

    BiNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setXY(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public int add() {
        return this.x + this.y;
    }

    public int multiply() {
        return this.x * this.y;
    }

    public void doubleValue() {
        this.x = this.x * 2;
        this.y = this.y * 2;
    }
}
