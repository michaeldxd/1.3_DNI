/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.PaqueteLogica;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Escaneo = new Scanner(System.in);
        int numero;
        System.out.print("Por favor, ingrese su numero de DNI: ");
        numero = Escaneo.nextInt();
        DNI dni = new DNI(numero);
        dni.obtenerLetra();
    }
    
}
