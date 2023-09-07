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

public class Tienda {
    public static void main(String[] args) {
        double descuentoDocenasExactas = 0.15; 
        double descuentoGeneral = 0.10;
        int obsequioPorDocenaExtra = 1; 

        for (int cliente = 1; cliente <= 10; cliente++) {
            JOptionPane.showMessageDialog(null, "Cliente " + cliente + ":");
            
            String cantidadCompradaStr = JOptionPane.showInputDialog("Cantidad comprada (en docenas): ");
            int cantidadComprada = Integer.parseInt(cantidadCompradaStr);
            
            String precioUnitarioStr = JOptionPane.showInputDialog("Precio unitario: ");
            double precioUnitario = Double.parseDouble(precioUnitarioStr);

            double montoCompra, montoDescuento, unidadesObsequio;
            switch (cantidadComprada) {
                case 3 -> {
                    montoDescuento = precioUnitario * 12 * descuentoDocenasExactas;
                    unidadesObsequio = 0;
                }
                default -> {
                    montoDescuento = precioUnitario * 12 * descuentoGeneral;
                    unidadesObsequio = Math.max(0, (cantidadComprada - 3) * obsequioPorDocenaExtra);
                }
            }
            montoCompra = (precioUnitario * cantidadComprada * 12) - montoDescuento;

            JOptionPane.showMessageDialog(null, "Monto de la compra: $" + montoCompra);
            JOptionPane.showMessageDialog(null, "Monto de descuento: $" + montoDescuento);
            JOptionPane.showMessageDialog(null, "Unidades de obsequio: " + unidadesObsequio);
        }
    }
}


