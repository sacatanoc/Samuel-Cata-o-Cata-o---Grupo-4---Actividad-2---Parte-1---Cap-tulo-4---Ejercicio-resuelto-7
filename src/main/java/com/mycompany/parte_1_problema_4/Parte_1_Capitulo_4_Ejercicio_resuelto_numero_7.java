/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_4;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_7 {

    public static void main(String[] args) {
        
        double A, B;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor A: ");
        A = lector.nextDouble();
        System.out.println("Por favor ingrese el valor B: ");
        B = lector.nextDouble();
        if (A>B){
            System.out.println("A es mayor que B");
        } else if (A==B){
            System.out.println("A es igual que B");
        } else {
            System.out.println("A es menor que B");
        }
                
    }
}
