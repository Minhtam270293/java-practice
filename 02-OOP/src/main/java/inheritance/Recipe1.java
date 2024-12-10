/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author PC
 */
public class Recipe1 extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw material");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Prepare the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleanup the utensils");
    }

}
