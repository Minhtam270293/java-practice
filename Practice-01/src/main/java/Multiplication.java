/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NguyenMinhTam
 */
public class Multiplication {
        void print() {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", 5, i, 5*i);
            }
        }
        
        void print(int table) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", table, i, table*i);
            }
        }
        
        void print(int table, int from, int to) {
        for(int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d%n", table, i, table*i);
            }
        }
    }
