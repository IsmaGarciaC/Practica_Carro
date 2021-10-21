/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacarro;

/**
 *
 * @author Ismael
 */
public class PracticaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c = new Carro();
        c.crearID();
        c.buscarID();
        c.listarID();
        c.eliminarID();
        c.actualizarId();
    }
    
}
