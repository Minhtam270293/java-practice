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

    MotorBike() {
        this(5);
    }

    MotorBike(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed > 0) {
            this.speed = newSpeed;
        }
    }

    int getSpeed() {
        return this.speed;
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            this.speed += amount;
        }
    }

    public void decreaseSpeed(int amount) {
        if (amount > 0) {
            this.speed = this.speed - amount < 0
                    ? 0 : this.speed - amount;

        }
    }

    void start() {
        System.out.println("Bike started");
    }
}
