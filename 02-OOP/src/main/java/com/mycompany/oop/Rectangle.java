/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
class Rectangle {

    // state
    private int length;
    private int width;

    // creation
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // operations
    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("length - %d width - %d area %d - perimeter - %d", length, width, area(), perimeter());
    }
}
