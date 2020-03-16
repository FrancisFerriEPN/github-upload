/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablashash;

import javax.swing.JOptionPane;

/**
 *
 * @author No Name
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos"));//Pedimos que ingrese la cantidad
        //de valores que vamos a utilizar
        new Principal(n).setVisible(true);
        
    }
    
}
