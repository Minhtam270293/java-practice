/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NguyenMinhTam
 */
public class Exercise05 {

    public boolean isRightAngled(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        int sumOfSquares;
        if (a * a == b * b + c * c) {
            return true;
        }
        if (b * b == a * a + c * c) {
            return true;
        }
        if (c * c == a * a + b * b) {
            return true;
        }
        return false;
    }
}
