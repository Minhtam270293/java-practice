/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practice.array;

import java.util.Scanner;

/**
 *
 * @author NguyenMinhTam
 */
public class PracticeArray {

    public static void main(String[] args) {
//        int[] score = {3, 5, 7, 9, 11, 1, 2, 3, 4, 5};
//        ArrayFunction.printArr(score);

        System.out.print("Elements of your array: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int ele : a) {
            System.out.print(ele);
        }
    }
}
