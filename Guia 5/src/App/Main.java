package App;

import EJ_5.Cliente;
import EJ_5.Cliente_Mayorista;
import EJ_5.Cliente_Minorista;
import EJ_5.ListaFacturas;
import domain.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


       /* ListaElectrodomesticos lista = new ListaElectrodomesticos();

        lista.agregar(new Lavadora());
        lista.agregar(new Lavadora(10,430,"rojo",'A',50));
        lista.agregar(new Lavadora());

        lista.agregar(new Television());
        lista.agregar(new Television(500,"blanco",'C',70,15,true));
        lista.agregar(new Television());

        lista.agregar(new Electrodomestico());

        double precioLavadoras;
        double precioTelevisores;
        double precioElectro;

        System.out.println("TELEVISORES" + lista.mostrarClasesTelevisores());

        System.out.println("LAVADORAS" + lista.mostrarClasesLavadoras());

        System.out.println("MOSTRAR TODO:" + lista.mostrarTodo());

        System.out.println("Precio suma total:" + lista.devolverSumaPrecioElectrodomesticos());

            */
        Ej5();

    }

    public static void Ej5()
    {
        Cliente_Minorista clientem1 = new Cliente_Minorista(4, LocalDateTime.now(),"Marsala Gonzalo","Bouchard3358","20456220526");
        Cliente_Mayorista clienteM2 = new Cliente_Mayorista(2,LocalDateTime.now(),"Pablo Walter","Bayley 2254","20432460089");
        clientem1.agregarFactura(new Factura(4,"panchos",6));
        clientem1.agregarFactura(new Factura(32,"juegosPs2",10));
        clientem1.agregarFactura(new Factura(3,"empanadas",6));
        clienteM2.agregarFactura(new Factura(2,"caramelos",1));
        clienteM2.agregarFactura(new Factura(6,"celular",20));
        System.out.println(clientem1.toString());
        System.out.println(clienteM2.toString());
    }

    public static void Ej6()
    {
        
    }
}