/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circunferencia;

/**
 *
 * @author jordy
 */
import javax.swing.JOptionPane;

public class Descuentos{
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre del trabajador:");
        String sueldoInput = JOptionPane.showInputDialog("Sueldo del trabajador:");
        
        double sueldo = Double.parseDouble(sueldoInput);
        
        double afp = sueldo * 0.0625;
        double isss = 0;
        double renta = 0;
        
        if (sueldo > 300.00) {
            String genero = JOptionPane.showInputDialog("Género del trabajador (hombre o mujer):");
            
            switch (genero.toLowerCase()) {
                case "hombre":
                    isss = sueldo * 0.03;
                    renta = sueldo * 0.10;
                    break;
                case "mujer":
                    isss = sueldo * 0.02;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Género no reconocido. Se aplicarán descuentos predeterminados.");
                    break;
            }
        }
        
        double totalDescuentos = afp + isss + renta;
        
        String mensaje = "Tabla de ejemplo\n" +
                         "Nombre: " + nombre + "\n" +
                         "Sueldo: $" + sueldo + "\n" +
                         "AFP: $" + afp + "\n" +
                         "ISSS: $" + isss + "\n" +
                         "Renta: $" + renta + "\n" +
                         "Descuento total: $" + totalDescuentos;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
