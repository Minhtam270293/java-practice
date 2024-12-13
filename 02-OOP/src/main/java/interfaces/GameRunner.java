/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author PC
 */
public class GameRunner {

    public static void main(String[] args) {

        GamingConsole[] games = {new ChessGame(), new MarioGame()};

        // GamingConsole game = new MarioGame();
        for (GamingConsole game : games) {

            game.up();
            game.down();
            game.left();
            game.right();
        }
    }
}
