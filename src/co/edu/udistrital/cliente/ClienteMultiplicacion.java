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

/**
 *
 * @author oliva
 */
public class ClienteMultiplicacion {
    private FabricaEntradaSalida fabrica;
    private Operacion operacion;
    private double factor1;
    private double factor2;
    private Entrada entrada;
    private Salida salida;
    public ClienteMultiplicacion(FabricaEntradaSalida fabrica,Operacion operacion){
        this.fabrica = fabrica;
        this.operacion = operacion;
        this.entrada = fabrica.crearEntrada();
        this.salida = fabrica.crearSalida();
    }
    public void capturar(){
        salida.mostrar("ingrese dos numeros");
        double factor1 = parseDouble(entrada.capturar());
        double factor2 = parseDouble(entrada.capturar());
        this.factor1=factor1;
        this.factor2=factor2;
    }
    public void mostrar(double resultado){
        salida.mostrar(Double.toString(resultado));   
    }
    public double multiplicar(){
        if(factor2<0){
            factor1=-factor1;
            factor2=-factor2;
        }
        return sumaRecursiva(factor1,factor2);
    }
    public double sumaRecursiva(double factor1, double factor2){
        if(factor2==0){
            return 0;
        }
        return operacion.operar(factor1,this.sumaRecursiva(factor1, factor2-1));
    }
    public void ejecutar(){
        this.capturar();
        double resultado=this.multiplicar();
        this.mostrar(resultado);
    }
}