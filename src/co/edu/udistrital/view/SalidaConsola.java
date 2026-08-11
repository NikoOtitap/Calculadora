package co.edu.udistrital.view;

public class SalidaConsola implements Salida{
    @Override
    public void mostrarResultado(int resultado) {
        System.out.println("el resultado es " + resultado);
    }
}
