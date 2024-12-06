/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.oop;

/**
 *
 * @author NguyenMinhTam
 */
public class App {

    public static void main(String[] args) {
        Fan myRoomFan = new Fan("Mitsubishi", 0.45, "WHITE");
        myRoomFan.switchOn();

        System.out.println(myRoomFan);
    }
}
