/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.basic.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class MotorBike {

    private int speed;

    public void setSpeed(int newSpeed) {
        if (speed > 0) {
            this.speed = newSpeed;
        }
    }

    int getSpeed() {
        return this.speed;
    }

    void start() {
        System.out.println("Bike started");
    }
}
