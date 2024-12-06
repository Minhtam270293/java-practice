/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.basic.oop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author NguyenMinhTam
 */
public class Student {

    private String name;
    private ArrayList<Integer> markList;

    Student(String name) {
        this.name = name;
        this.markList = new ArrayList<>();
    }

    Student(String name, ArrayList<Integer> markList) {
        this.name = name;
        this.markList = markList != null ? markList : new ArrayList<>();
    }

    public int getNumberOfMarks() {
        return this.markList.size();
    }

    public int getSumOfMarks() {
        int sum = 0;
        for (int mark : markList) {
            sum += mark;
        }
        return sum;
    }

    public int getMaxMark() {
        int max = this.markList.get(0);

        for (int i = 1; i < this.markList.size(); i++) {
            max = this.markList.get(i) > max ? this.markList.get(i) : max;
        }

        return max;
    }

    public int getMinMark() {
        int min = this.markList.get(0);

        for (int i = 1; i < this.markList.size(); i++) {
            min = this.markList.get(i) < min ? this.markList.get(i) : min;
        }

        return min;
    }

    public BigDecimal getAverageMark() {

        BigDecimal sum = BigDecimal.valueOf(this.getSumOfMarks());
        BigDecimal count = BigDecimal.valueOf(this.getNumberOfMarks());

        return sum.divide(count, 2, RoundingMode.HALF_UP);
    }

    public void addNewMark(int mark) {

        if (mark >= 0) {
            this.markList.add(mark);
        }
    }

    public void removeMarkAt(int index) {

        if (index >= 0 && index < this.markList.size()) {
            this.markList.remove(index);
        }
    }

}
