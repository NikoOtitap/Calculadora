package co.edu.udistrital.view;
import java.io.FileWriter;
import java.io.IOException;

public class SalidaArchivo implements Salida {

    private String nombreArchivo;

    public SalidaArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrar(String resultado) {
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            archivo.write(resultado);
            archivo.close();
        } catch (IOException e) {
            throw new RuntimeException("No se pudo escribir el archivo");
        }
    }
}
