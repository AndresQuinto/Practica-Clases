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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro p1 = new Perro();
        p1.Jugar();
        p1.SerAmigable();
        p1.deambular();
        p1.serInvisible();
        p1.volar();
        
        Gato gat1 = new Gato();
        gat1.Jugar();
        gat1.SerAmigable();
        gat1.comer();
        gat1.serInvisible();
        gat1.volar();
        
        Leon le1 = new Leon();
        le1.serInvisible();
        le1.volar();
        
        
    }
    
}
