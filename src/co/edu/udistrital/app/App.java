package co.edu.udistrital.app;


import co.edu.udistrital.controller.Cliente;
import co.edu.udistrital.factory.FabricaArchivo;
import co.edu.udistrital.factory.FabricaConsola;
import co.edu.udistrital.factory.FabricaEntradaSalida;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        FabricaEntradaSalida fabrica = new FabricaArchivo();
        cliente.ejecutar(fabrica);
    }
}