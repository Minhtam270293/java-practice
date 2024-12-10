/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author PC
 */
public class FlyRunner {

    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Plane()};

        for (Flyable obj : flyingObjects) {
            obj.fly();
        }

        Animal[] animals = {new Cat(), new Dog()};

        for (Animal obj : animals) {
            obj.bark();
        }
    }
}
