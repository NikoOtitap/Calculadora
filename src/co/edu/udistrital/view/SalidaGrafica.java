/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class SalidaGrafica implements Salida {

    @Override
    public void mostrar(String texto) {
        JOptionPane.showMessageDialog(null,texto);
    }
}
    