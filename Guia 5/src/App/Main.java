package App;
import Clases.EJ1.Persona;
import Clases.EJ3.*;
import Clases.EJ5.*;
import Clases.EJ6.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EJ1();
        EJ2();
        EJ3();
        EJ4();
        EJ5();

    }

    public static void EJ1()
    {
        Persona p = new Persona("Gon",20, 'M',60.0,1.60);
       double r = p.calcularMC(p.getPeso(), p.getAltura());

        if(r == -1)
        {
            System.out.println("Falta sopa");
        } else if (r == 0) {
            System.out.println("tas joya");
        } else if (r == 1) {
            System.out.println("afloja con los dannette");
        }
        boolean b = p.esMayorDeEdad();
        if (b)
        {
            System.out.println("birrita ");
        }
        else
        {
            System.out.println("gaseosa pibe");
        }

        p.comprobarSexo(p.getSexo());

        p.toString();

    }

    public static void EJ2()
    {

    }

    public static void EJ3()
    {
       ListaElectrodomesticos lista = new ListaElectrodomesticos();

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
    }

    public static void EJ4()
    {

    }

    public static void EJ5()
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

    public static void EJ6()
    {
        ArrayList <Vehiculo> flota = new ArrayList<>();
        Automovil v1 = new Automovil("4-2-2024","Gonzalo","abc123", "peugeot", "205",2005,23000,2000,"disponible");
        Utilitarios v2 = new Utilitarios("GPUS", "bbb333","Mercedes Bensz", "pertrner",1990,3000,3000,"Disponible");

        flota.add(v1);
        flota.add(v2);




    }
}