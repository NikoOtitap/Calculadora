package co.edu.udistrital.view;
import java.util.Scanner;

public class EntradaTeclado implements Entrada {
    Scanner sc = new Scanner(System.in);
    @Override
    public int leerInt() {
        return sc.nextInt();
    }
}
