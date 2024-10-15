/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NguyenMinhTam
 */
public class Exercise06 {

    public long calcSumSquare(int n) {
        if (n < 0) {
            return -1;
        }

        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
