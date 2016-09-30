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
public class Perro extends Canino implements Mascota,Poderes {
    
    
    @Override
    public void comer(){
        
        System.out.println("el perro esta comiendo");
       
        
    }
    @Override
    public void deambular(){
        System.out.println("el perro esta deambulando");
    }

    @Override
    public void SerAmigable() {
        System.out.println("el perro esta siendo amigable");
          }

    @Override
    public void Jugar() {
        System.out.println("el perro esta jugando");
    }

    @Override
    public void volar() {
        
        System.out.println("el perro esta volando");
    }

    @Override
    public void serInvisible() {
        System.out.println("el perro es invisible");
    }
    
}
