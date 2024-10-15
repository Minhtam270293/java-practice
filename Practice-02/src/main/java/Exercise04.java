/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NguyenMinhTam
 */
public class Exercise04 {

    public boolean isTriangle(int angle1, int angle2, int angle3) {
        if (angle1 < 0 || angle2 < 0 || angle3 < 0) {
            return false;
        }

        int angleSum = angle1 + angle2 + angle3;
        return angleSum == 180;

    }
}
