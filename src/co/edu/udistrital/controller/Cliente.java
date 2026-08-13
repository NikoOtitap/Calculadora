/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.factory.FabricaEntradaSalida;
import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.model.Suma;
import co.edu.udistrital.view.Entrada;
import co.edu.udistrital.view.Salida;
import static java.lang.Double.parseDouble;

/**
 *
 * @author oliva
 */
public class Cliente {
    
    private FabricaEntradaSalida fabrica;
    private Operacion operacion;
    
    public Cliente(FabricaEntradaSalida fabrica,Operacion operacion){
        this.fabrica = fabrica;
        this.operacion = operacion;
    }
    
    public void ejecutar() {
        Entrada entrada = fabrica.crearEntrada();
        Salida salida = fabrica.crearSalida();
        salida.mostrar("ingrese dos numeros");
        double a = parseDouble(entrada.capturar());
        double b = parseDouble(entrada.capturar());

        double resultado = operacion.operar(a, b);

        salida.mostrar(Double.toString(resultado));
    }
}
