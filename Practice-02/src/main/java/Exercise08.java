/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NguyenMinhTam
 */
public class Exercise08 {

    public boolean isPerfect(int n) {
        if (n < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}
