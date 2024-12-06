/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class Fan {

    // state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; // 1 to 5

    // creation
    Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte newSpeed) {
        if (newSpeed >= 0) {
            this.speed = newSpeed;
        }
    }

    // print the state
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
    }
}
