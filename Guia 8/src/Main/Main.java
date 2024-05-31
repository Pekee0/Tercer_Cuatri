package Main;

import Ejercicio1.AnalizadorDeTexto;
import Ejercicio2.Busqueda;
import Ejercicio2.Historial;
import Ejercicio3.Item;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //EJ1();
        //EJ2();
        //EJ3();
        //EJ4(sc);
    }

    public static void EJ1 ()
    {
        AnalizadorDeTexto analisis = new AnalizadorDeTexto();
        analisis.recibirTexto("Hola me llamo gonzalo Marsala");
        analisis.mostrarSet();
        System.out.println("Texto en orden alfabetico:");
        analisis.OrdenarAlfabeticamente();
    }

   public static void EJ2 ()
   {
       Historial historial = new Historial();
       historial.agregarBusqueda(new Busqueda("Friv"));
       historial.agregarBusqueda(new Busqueda("Guess the game"));

       historial.mostrarHistorial();
   }

   public static void EJ3 () {
        TreeSet treeSet = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
   }

   public static void EJ4 (Scanner sc)
   {
       Item item = new Item(200.0, 3 );
       String keyname1 = "papitas";

       Item item2 = new Item(1000,2);
       String keyname2 = "CoflerBlock";

       HashMap <String,Item> Inventario = new HashMap<>();

       Inventario.put(keyname1,item);
       Inventario.put(keyname2,item2);

       System.out.println(Inventario.toString());


   }
}