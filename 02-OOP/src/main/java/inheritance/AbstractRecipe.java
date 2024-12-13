/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author PC
 */
public abstract class AbstractRecipe {
    
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }
    
    abstract  void getReady();
    abstract  void doTheDish();
    abstract void cleanUp();
 
}
