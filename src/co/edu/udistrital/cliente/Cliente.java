/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.cliente;

import co.edu.udistrital.factory.FabricaEntradaSalida;
import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.view.Entrada;
import co.edu.udistrital.view.Salida;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author oliva
 */
public class Cliente{
    private FabricaEntradaSalida fabrica;
    private Operacion operacion;
    private double a;
    private double b;
    private Entrada entrada;
    private Salida salida;
    public Cliente(FabricaEntradaSalida fabrica,Operacion operacion){
        this.fabrica = fabrica;
        this.operacion = operacion;
        this.entrada = fabrica.crearEntrada();
        this.salida = fabrica.crearSalida();
    }
    public void capturar(){
        salida.mostrar("ingrese un numero");
        double a = parseDouble(entrada.capturar());
        salida.mostrar("ingrese un numero entero");
        double b = parseInt(entrada.capturar());
        this.a=a;
        this.b=b;
    }
    public void mostrar(double resultado){
        salida.mostrar(Double.toString(resultado));   
    }
    public void ejecutar(){
        this.capturar();
        double resultado=operacion.operar(a, b);
        this.mostrar(resultado);
    }
}