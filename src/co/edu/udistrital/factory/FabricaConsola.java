/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.factory;

import co.edu.udistrital.view.Entrada;
import co.edu.udistrital.view.Salida;
import co.edu.udistrital.view.EntradaTeclado;
import co.edu.udistrital.view.SalidaConsola;

/**
 *
 * @author Estudiantes
 */
public class FabricaConsola extends FabricaEntradaSalida {

    @Override
    Entrada crearEntrada() {
        return new EntradaTeclado();
    }

    @Override
    Salida crearSalida() {
        return new SalidaConsola();
    }
    
}
