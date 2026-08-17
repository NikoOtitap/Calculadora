/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.view.Consola;
import co.edu.udistrital.model.Suma;
import co.edu.udistrital.model.Resta;
import co.edu.udistrital.model.Multiplicacion;
import co.edu.udistrital.model.Division;
import co.edu.udistrital.model.Operacion;
/**
 *
 * @author Biblioteca
 */
public class Controlador {
    
    
    private Consola vista;
    private Operacion operador;
    
    public void menu_princripal(){
        this.vista = new Consola();
        int opcion=this.vista.mostrar_menu();
        double a = this.vista.primer_numero();
        double b=this.vista.segundo_numero();
        switch (opcion) {
            case 1:
                operador= new Suma();
                break;
            case 2:
                operador= new Resta();
                break;
            case 3:
                operador= new Multiplicacion();
                break;
            default:
                operador= new Division();
                break;
        }
        double resultado=this.operador.operar(a, b);
        this.vista.mostrar_resultado(resultado);
    }
}