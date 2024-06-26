package Main;

import Ejercicio1.AnalizadorDeTexto;
import Ejercicio2.Busqueda;
import Ejercicio2.Historial;
import Ejercicio3.Evento;
import Ejercicio3.GestorDeEventos;
import Ejercicio3.Prioridad;
import Ejercicio4.GestorDeInventario;
import Ejercicio4.Item;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //EJ1();
        //EJ2();
       // EJ3();
        EJ4();
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

       GestorDeEventos agenda = new GestorDeEventos();

       Evento evento1 = new Evento("papas", Prioridad.ALTA);
        Evento evento2 = new Evento("Casamiento",Prioridad.MEDIA);
        Evento evento3 = new Evento("Jugar a la play", Prioridad.ALTA);
        Evento evento4 = new Evento("Hacer la guia 7",Prioridad.BAJA);

       agenda.AgregarEvento(evento1);
       agenda.AgregarEvento(evento2);
       agenda.AgregarEvento(evento3);
       agenda.AgregarEvento(evento4);

       agenda.MostrarEvento();

   }

   public static void EJ4 ()
   {
       GestorDeInventario inventario = new GestorDeInventario();

       inventario.agregarItem(new Item(2000,3,"Papas fritas"));
       inventario.agregarItem(new Item(3000,10,"Bubbaloo"));
       inventario.agregarItem(new Item(3000,2,"Twistos"));
       inventario.agregarItem(new Item(200,100,"Prime"));

       inventario.mostrarItemOrdenados();
       System.out.println("\n");

       inventario.actualizarPrecio(10,"Bubbaloo");
       inventario.actualizarStock(30,"Bubbaloo");

       inventario.mostrarItemOrdenados();

   }
}