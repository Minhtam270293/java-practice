/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NguyenMinhTam
 */
public class Exercise02 {

    public static int convertHourstoMinutes(int hours) {
        if (hours < 0) {
            return - 1;
        };
        return hours * 60;
    }

    public static int convertDaystoMinutes(int days) {
        if (days < 0) {
            return -1;
        };
        return days * 24 * 60;
    }
}
