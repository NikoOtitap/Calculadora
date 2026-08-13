package co.edu.udistrital.view;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntradaArchivo implements Entrada {

    private Scanner archivo;

    public EntradaArchivo(String nombreArchivo) {
        try {
            archivo = new Scanner(new File(nombreArchivo));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("No se encontró el archivo");
        }
    }

    @Override
    public String capturar() {
        return archivo.nextLine();
    }
}
