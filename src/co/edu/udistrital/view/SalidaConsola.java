package co.edu.udistrital.view;

public class SalidaConsola implements Salida{
    @Override
    public void mostrar(String texto) {
        System.out.println("el resultado es " + resultado);
    }
}
