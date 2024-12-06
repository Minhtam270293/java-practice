/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author NguyenMinhTam
 */
public class Person extends Object {

    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }

    // Setter and Getter methods for the fields
// name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

// phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return getClass().getName() + "#" + Integer.toHexString(hashCode());
    }
}
