/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ludo;

/**
 *
 * @author Gabo
 */
public class Proyecto_Ludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tablero t = new Tablero();
        Ficha ficha = new Ficha();
        jugador j = new jugador();
        
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(6, j.f1));
        System.out.println(j.moverficha(4, j.f1));
    }
    
}
