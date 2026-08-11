/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import java.util.Scanner;

/**
 *
 * @author Biblioteca
 */
public class Consola {
    Scanner sc = new Scanner(System.in);
    public int mostrar_menu(){
        System.out.println("ElIJA LA OPERACION\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n");
        return sc.nextInt();
    }
    public void mostrar_resultado(double resultado){
        System.out.println("el resultado es " + resultado);
    }
    public Double primer_numero(){
        System.out.print("Ingrese el primer numero: ");
        return sc.nextDouble();
    }
    public Double segundo_numero(){
        System.out.print("Ingrese el segundo numero: ");
        return sc.nextDouble();
    }
}
