package co.edu.udistrital.app;


import co.edu.udistrital.cliente.Cliente;
import co.edu.udistrital.factory.FabricaArchivo;
import co.edu.udistrital.factory.FabricaConsola;
import co.edu.udistrital.factory.FabricaEntradaSalida;
import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.model.Suma;
import co.edu.udistrital.view.Entrada;
import co.edu.udistrital.view.Salida;
import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaEntradaSalida fabrica = new FabricaArchivo();
        Operacion operacion = new Suma();
        Entrada entrada = fabrica.crearEntrada();
        Salida salida = fabrica.crearSalida();

        double a = parseDouble(entrada.capturar());
        double b = parseDouble(entrada.capturar());

        double resultado = operacion.operar(a, b);

        salida.mostrar(Double.toString(resultado));
    }
}