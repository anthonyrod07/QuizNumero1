/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoccss;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class CalculoCCSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
        int n = Integer.parseInt(input);

        double montoTotal = 0.0;

        for (int i = 1; i <= n; i++) {
            String salarioInput = JOptionPane.showInputDialog("Ingrese el salario del empleado " + i + ":");
            double salario = Double.parseDouble(salarioInput);

            double sem = salario * 0.0925;
            double ivm = salario * 0.0508;

            montoTotal += sem + ivm;
        }

        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS un monto de ₡" + montoTotal + " por concepto de SEM y IVM.");
    }
    
}


    
    

