/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.factory;

import co.edu.udistrital.view.Entrada;
import co.edu.udistrital.view.Salida;
import co.edu.udistrital.view.EntradaArchivo;
import co.edu.udistrital.view.SalidaArchivo;

/**
 *
 * @author Estudiantes
 */
public class FabricaArchivo extends FabricaEntradaSalida {

    @Override
    public Entrada crearEntrada() {
        return new EntradaArchivo("entrada.txt");
    }

    @Override
    public Salida crearSalida() {
        return new SalidaArchivo("salida.txt");
    }
    
}
