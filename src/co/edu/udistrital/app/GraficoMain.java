package co.edu.udistrital.app;


import co.edu.udistrital.cliente.Cliente;
import co.edu.udistrital.factory.FabricaArchivo;
import co.edu.udistrital.factory.FabricaConsola;
import co.edu.udistrital.factory.FabricaEntradaSalida;
import co.edu.udistrital.factory.FabricaGrafica;
import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.model.Suma;

public class GraficoMain {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(new FabricaGrafica(),new Suma());
        cliente.ejecutar();
    }
}