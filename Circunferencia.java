/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circunferencia;

/**
 *
 * @author jordy
 */
import javax.swing.JOptionPane;

public class Circunferencia {
    public static void main(String[] args) {
        String radioInput = JOptionPane.showInputDialog("Ingresa el radio de la circunferencia:");
        
        double radio = Double.parseDouble(radioInput);
        
        double pi = 3.1415926535;
        double area = pi * radio * radio;
        double volumen = (4.0 / 3.0) * pi * radio * radio * radio;
        
        String mensaje = "Área de la circunferencia: " + area + "\nVolumen de la esfera: " + volumen;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
