package app;

import java.util.Scanner;
import Clases.Cliente;
import Clases.ClienteBank;
import Clases.CuentaBank;
import Clases.Factura;

public class Main {

    public static void main (String [] args )
    {
        Scanner teclado = new Scanner(System.in);
        //Ej2(teclado);
        Ej3(teclado);
    }

    public static  void Ej2 (Scanner sc)
    {
        Cliente cl1 = new Cliente( "Gonzalo", "gonza.marsala@gmail.com", 20);
        System.out.println(cl1.toString());

        Factura fc1 = new Factura(1000, cl1);

        fc1.setTotal(fc1.aplicarDescuento(1000, cl1.getDescuento()));

        System.out.println(fc1.toString());

    }

    public static void Ej3(Scanner sc)
    {
        ClienteBank clb1 = new ClienteBank("gonzalo", 'm');
        CuentaBank cb1 = new CuentaBank(10000,clb1,clb1.getNombre());
        cb1.depositar(200);
        cb1.mostrarSaldo();
        cb1.extraer(300);
        cb1.mostrarSaldo();

    }
}
