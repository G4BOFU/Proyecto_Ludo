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
public class jugador {
    
    Ficha f;
    Ficha f1 = new Ficha();
    Ficha f2 = new Ficha();
    Ficha f3 = new Ficha();
    Ficha f4 = new Ficha();

    String moverficha(int dado, Ficha fich) {

        fich.posfinal = fich.posfinal + dado;
        if (fich.posfinal == 57) {

            return "La ficha ha llegado a la casilla final";

        } else if (fich.posfinal > 57) {

            fich.posfinal = fich.posfinal - dado;

            return "El numero " + dado + " es mayor a las casillas que te faltan, por lo tanto, te quedas en el mismo lugar";
        }
        return "el dado arrojo " + dado + " te encuentras en la casilla " + fich.posfinal;

    }

    String sacarficha(int dado) {

        if (dado == 6 || dado == 1) {

            return "Has salido, ahora volveras a lanzar para moverte" + this.moverficha(dado, f);
        }
        return "No has podido salir, has perdido el turno ";

    }

}
