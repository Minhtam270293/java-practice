/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author PC
 */
public class ChessGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void left() {
        System.out.println("Move piece left");
    }

    @Override
    public void right() {
        System.out.println("Move piece right");
    }

}
