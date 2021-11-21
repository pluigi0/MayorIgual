
package Condicionales;

import javax.swing.JOptionPane;

/*
Pedir dos números y decir cuál es el mayor o si son iguales.
 */
public class NumeroMayoIgual {
    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero porfavor: "));
        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Typea otro numero, gracias: "));
        
        if (numero1 < numero2 ){
            JOptionPane.showMessageDialog(null, +numero2+ " Es mayor que "+numero1);
        }
        if (numero1 > numero2 ){
            JOptionPane.showMessageDialog(null, +numero1+ " Es mayor que "+numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, +numero1+ " y " +numero2+ " Son iguales");
        }
        
    }
    
}
