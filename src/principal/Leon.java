/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author andres
 */
public class Leon extends Felino implements Poderes{

    @Override
    public void volar() {
        System.out.println("el leon esta volando");
    }

    @Override
    public void serInvisible() {
        System.out.println("el leon es invisible");
    }
 
    
    
}
