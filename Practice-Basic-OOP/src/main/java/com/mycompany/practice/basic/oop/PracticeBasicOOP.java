/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practice.basic.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class PracticeBasicOOP {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(30);
        MotorBike honda = new MotorBike(60);
        MotorBike yamaha = new MotorBike();

        ducati.accelerate(100);
        ducati.decreaseSpeed(500);

        honda.accelerate(50);
        honda.decreaseSpeed(99);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(yamaha.getSpeed());

    }
}
