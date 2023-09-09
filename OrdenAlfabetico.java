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

public class OrdenAlfabetico {
    public static void main(String[] args) {
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; // Alfabeto personalizado
        
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre: ").toLowerCase(); // Convertir el nombre a minúsculas
        
        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "No ingresó un nombre.");
            System.exit(0);
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            int posicion = -1;
            
            // Buscar la posición de la letra en el alfabeto personalizado
            for (int j = 0; j < alfabeto.length; j++) {
                if (letra == alfabeto[j]) {
                    posicion = j + 1;
                    break;
                }
            }
            
            if (posicion != -1) {
                resultado.append(letra).append(" posicion ").append(posicion).append("\n");
            } else {
                resultado.append(letra).append(" no es una letra válida.").append("\n");
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString(), "Posiciones en el Alfabeto", JOptionPane.PLAIN_MESSAGE);
    }
}

