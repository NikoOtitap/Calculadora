package co.edu.udistrital.app;


import co.edu.udistrital.controller.Cliente;
import co.edu.udistrital.factory.FabricaArchivo;
import co.edu.udistrital.factory.FabricaConsola;
import co.edu.udistrital.factory.FabricaEntradaSalida;
import co.edu.udistrital.factory.FabricaGrafica;
import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.model.Suma;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        FabricaEntradaSalida fabrica = new FabricaArchivo();
        Operacion operacion = new Suma();
        cliente.ejecutar(fabrica,operacion);
    }
}