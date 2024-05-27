package main;

import clases.EJ3.Empleado;
import clases.EJ1.Producto;
import clases.EJ5.*;
import colecciones.EJ2.ListaDeNodos;
import colecciones.EJ1.Tienda;
import colecciones.EJ3.VectorEmpleados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio1();
        //ejercicio2();
        //ejercicio3(sc);
        //ejercicio4();
        ejercicio5();

    }

    public static void ejercicio1() {
        Tienda tienda = new Tienda();
        Producto producto = (new Producto("Pepa",6,15));
        tienda.agregarProducto(producto);
        tienda.agregarProducto(new Producto("Pipas",2.50,7));
        tienda.agregarProducto(new Producto("Fernet",24,3));
        Producto producto1 = new Producto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto: ");
        producto1.setNombre(sc.next());
        sc.nextLine();
        System.out.println("Ingrese precio del producto: ");
        producto1.setPrecio(sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese cantidad disponible del producto: ");
        producto1.setCantidadDisponible(sc.nextInt());
        sc.nextLine();

        tienda.agregarProducto(producto1);

        System.out.println(tienda.mostrarInventario());

        System.out.println(tienda.buscarPorNombre("Pipas"));

        tienda.buscarPorNombre(producto.getNombre());
        System.out.println(producto.toString());

        tienda.actualizarCantidad(10,"Pipas");
        System.out.println(tienda.buscarPorNombre("Pipas"));

        int sumatoria = tienda.calcularCantidad();
        System.out.println("la cantidad total del inventario es: " + sumatoria);
    }

    public static void ejercicio2()
    {
        ListaDeNodos listaDeNodos = new ListaDeNodos();
        listaDeNodos.agregar(5);
        listaDeNodos.agregar(10);
        listaDeNodos.agregar(15);
        listaDeNodos.agregar(20);

        System.out.println(listaDeNodos.mostrarInventario());

        int i = (int)listaDeNodos.eliminarYretornarNuevoPrimero();
        System.out.println(i+"\n");

        System.out.println(listaDeNodos.mostrarInventario());

        i = (int)listaDeNodos.peek();
        System.out.println("Primer nodo: " + i);

        System.out.println(listaDeNodos.estaVacioVesNoHayObjectsAqui());
        System.out.println(listaDeNodos.devolverCantidad());
    }

    public static void ejercicio3(Scanner sc)
    {

        VectorEmpleados empleados = new VectorEmpleados();

        Empleado empleado1 = new Empleado();

        System.out.println("Ingrese el nombre");
        empleado1.setNombre(sc.nextLine());
        sc.nextLine();

        System.out.println("ingrese el Salario");
        empleado1.setSalario(sc.nextDouble());
        sc.nextLine();

        System.out.println("Ingrese el cargo");
        empleado1.setCargo(sc.nextLine());
        sc.nextLine();
        empleados.mostrarEmpleados();

       double total =  empleados.salarioPromedio();
        System.out.println("Salario promedio: "+ total);

        
    }

    public static void ejercicio4()
    {

    }

    public static void ejercicio5()
    {
       

        Comisionista comisionista1 = new Comisionista();
        comisionista1.setNombre("Juanjo");
        comisionista1.setTelefono("22345670");

        Comisionista comisionista2 = new Comisionista();
        Comisionista comisionista3 = new Comisionista();
        Comisionista comisionista4 = new Comisionista();
        Comisionista comisionista5 = new Comisionista();

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNombre("Pepe");
        vendedor1.setCelularDesignado(new Celular(1,"A04","Samgsung","223123456"));
        vendedor1.setApellido("gomez");
        vendedor1.setDni(45622053);
        vendedor1.setLegajo(1);
        vendedor1.setMail("pepegomez@gmail.com");
        vendedor1.setFechaDeIngreso("23-3-10");
        vendedor1.setSalarioBase(1000);
        vendedor1.setPorcentajeComision(0.4);

        Vendedor vendedor2 = new Vendedor();
        Vendedor vendedor3 = new Vendedor();
        Vendedor vendedor4 = new Vendedor();
        Vendedor vendedor5 = new Vendedor();

        Repartidor repartidor1 = new Repartidor();
        Repartidor repartidor2 = new Repartidor();
        Repartidor repartidor3 = new Repartidor();
        Repartidor repartidor4 = new Repartidor();
        Repartidor repartidor5 = new Repartidor();


    }
}
