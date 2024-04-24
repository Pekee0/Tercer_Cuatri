package Main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
      //  EJ1(teclado);
        // EJ2(teclado);
        //EJ3(teclado);
        //EJ4();
        //EJ5();
        

    }
    
    public static void EJ1(Scanner sc)
    {
        Rectangulo rec1 = new Rectangulo();

        System.out.println("Ingrese un valor para el alto del recatangulo. ");
        rec1.setAlto(sc.nextDouble());

        System.out.println("Ingrese un valor para el ancho del rectangulo. ");
        rec1.setAncho(sc.nextDouble());

        System.out.println("El area del rectangulo es de " + rec1.calcularArea());
        System.out.println("El perimetro del rectangulo es de " + rec1.calcularPerimetro());
    }

    public static void EJ2 (Scanner sc)
    {
        Empleado emp1 = new Empleado(23456345,"Carlos", "Gutiérrez", 25000);
        Empleado emp2 = new Empleado(34234123, "Ana", "Sánchez", 27500);
        emp2.mostrarEmpleado();
        emp1.mostrarEmpleado();

        emp1.aumentarSalario(15);
        emp1.mostrarEmpleado();
    }

    public static void EJ3 (Scanner sc)
    {

        Venta ven1 = new Venta(1,5,"Pocion de transformacion", 400);
        System.out.println(ven1.toString());

    }

    public static void EJ4(){
       Cuenta cuenta1= new Cuenta(1, "luchi", 15000);
        System.out.println(cuenta1.toString());
       cuenta1.credito(2500);
        System.out.println(cuenta1.toString());
    cuenta1.debito(1500);
        System.out.println(cuenta1.toString());
    cuenta1.debito(30000);
        System.out.println(cuenta1.toString());

    }

    public static void EJ5(){

        Hora horaA= new Hora(12, 4, 12);
        horaA.mostrarHora();
        
    }
}