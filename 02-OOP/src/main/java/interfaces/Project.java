/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author PC
 */
public class Project {

    interface Test {

        void nothing();

        default void nothing1() {
        }
    ;

    }

    class Class1 implements Test {

        @Override
        public void nothing() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    class Class2 implements Test {

        @Override
        public void nothing() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

    public static void main(String[] args) {
        ComplexAlgo algo = new RealAlgo();
        System.out.println(algo.complexAlgo(10, 99));
    }
}
