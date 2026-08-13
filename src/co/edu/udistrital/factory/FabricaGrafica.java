/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.factory;

import co.edu.udistrital.view.Entrada;
import co.edu.udistrital.view.EntradaGrafica;
import co.edu.udistrital.view.Salida;
import co.edu.udistrital.view.SalidaGrafica;

/**
 *
 * @author Estudiantes
 */
public class FabricaGrafica extends FabricaEntradaSalida {

    @Override
    public Entrada crearEntrada() {
        return new EntradaGrafica();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaGrafica();
    }
    
}
