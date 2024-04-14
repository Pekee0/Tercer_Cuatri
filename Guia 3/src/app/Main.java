package app;

import java.util.Scanner;
import Clases.Cliente;
import Clases.ClienteBank;
import Clases.CuentaBank;
import Clases.Factura;
import Clases.Autor;
import Clases.Libro;
public class Main {

    public static void main (String [] args )
    {
        Scanner teclado = new Scanner(System.in);
        //EJ1(teclado);
        //Ej2(teclado);
        //Ej3(teclado);
    }

    public static void EJ1(Scanner sc)
    {
        Autor aut = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

        System.out.println(aut.toString());

        Libro lib = new Libro("Effective Java", 450.0, 150,aut);

        System.out.println(lib.toString());

        lib.setPrecio(500.0);
        lib.setStock(200);
        System.out.println("Nueva data\n " + lib.toString());

        System.out.println("Nombre: " + lib.getAutor().getNombre() + "\nApellido: " + lib.getAutor().getApellido() + "\nMail: " + lib.getAutor().getMail() + "\nGenero: " + lib.getAutor().getGenero());

        lib.printProlijo();
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
