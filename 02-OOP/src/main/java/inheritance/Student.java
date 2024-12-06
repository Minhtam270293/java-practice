/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author NguyenMinhTam
 */
public class Student extends Person {

    private String collegeName;
    private int year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }
}
