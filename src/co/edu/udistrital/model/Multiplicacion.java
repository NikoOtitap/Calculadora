/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

/**
 *
 * @author Biblioteca
 */
public class Multiplicacion implements Operacion {
    
    private final Operacion operacion;
    
    public Multiplicacion(){
        this.operacion=new Suma();
    }

    @Override
    public double operar(double a, double b){
        if(b<0){
            a=-a;
            b=-b;
        }
        return sumaRecursiva(a,b);
    }
    public double sumaRecursiva(double factor1, double factor2){
        if(factor2==0){
            return 0;
        }
        return operacion.operar(factor1,this.sumaRecursiva(factor1, factor2-1));
    }
}
