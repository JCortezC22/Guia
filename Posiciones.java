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

public class Posiciones {
    public static void main(String[] args) {
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        // Solicitamos el primer nombre al usuario
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");

        // Convertimos el nombre a minúsculas
        nombre = nombre.toLowerCase();

        JOptionPane.showMessageDialog(null, "Posiciones del nombre en el alfabeto:");

        for (char letra : nombre.toCharArray()) {
            int posicion = -1;
            for (int i = 0; i < alfabeto.length; i++) {
                if (letra == alfabeto[i]) {
                    posicion = i + 1;
                    break;
                }
            }
            if (posicion != -1) {
                JOptionPane.showMessageDialog(null, letra + " posicion " + posicion);
            }
        }
    }
}

