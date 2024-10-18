/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coding.exercises.set2;

/**
 *
 * @author NguyenMinhTam
 */
public class RGBColor {

    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        if (0 <= red && red <= 255
                && 0 <= blue && blue <= 255
                && 0 <= green && green <= 255) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public void invert() {
        this.red = 255 - this.red;
        this.blue = 255 - this.blue;
        this.green = 255 - this.green;
    }
}
