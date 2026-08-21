/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.app;

import co.edu.udistrital.cliente.Cliente;
import co.edu.udistrital.factory.FabricaGrafica;
import co.edu.udistrital.model.Multiplicacion;
import co.edu.udistrital.model.Suma;

/**
 *
 * @author oliva
 */
public class MultiplicacionMain {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(new FabricaGrafica(),new Multiplicacion());
        cliente.ejecutar();
    }
}
