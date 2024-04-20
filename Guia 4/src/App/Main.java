package App;

import Domain.EJ1.Cilindro;
import Domain.EJ2.Alumno;
import Domain.EJ2.Persona;
import Domain.EJ2.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        //EJ1();
        EJ2();
    }

    public static void EJ1()
    {
        Cilindro cil = new Cilindro(2,"verde",2);
        System.out.println("Radio: " + cil.getRadio() + "\n" + "Altura: " + cil.getAltura() + "\n" + "Area de base: " +cil.calcularArea(cil.getRadio()) + "\n" + "Volumen: " + cil.calcularVolumen(cil.getAltura(), cil.calcularArea(cil.getRadio())));

    }

    public static  void EJ2()
    {
        int i,contadoralu = 0,contadorProfe = 0;

        Alumno alu1 = new Alumno("1","gon","marsala","gonza.marsala@gmail.com","Bouchard3358",2021,300,"Programacion");
        Alumno alu2 = new Alumno("2","tomi","althabe","tomason1@gmail.com","Napoles2771",2024,200,"Locucion");
        Alumno alu3 =  new Alumno("3","abi","Maldonado","danaamaldo@gmail.com","Guido2278",2024,200,"ProfIngles");
        Alumno alu4 =  new Alumno("4","trini","garay","trinugraray@gmail.com","SanLorenzo278",2021,200,"Arquitectura");

        Staff profe1 = new Staff("10","Jimena", "nivio","jimenivio@gmail.com","lavalle8",200000,'N');
        Staff profe2 = new Staff("10","Milagros", "DelMoral","milidelmo@gmail.com","dorrego2050",150000,'M');
        Staff profe3 = new Staff("10","Lucio", "Flamenco","Luflamenco@gmail.com","roca1243",100000,'N');
        Staff profe4= new Staff("10","Valentino", "Mastrandrea","tinox1@gmail.com","malabia1551",500000,'M');

        ArrayList <Persona> personas = new ArrayList<Persona>();
        personas.add(profe1);
        personas.add(alu1);
        personas.add(profe2);
        personas.add(alu2);
        personas.add(profe3);
        personas.add(alu3);
        personas.add(profe4);
        personas.add(alu4);

        for(i = 0; i< personas.size(); i++)
        {
            if(personas.get(i) instanceof Alumno)
            {
                contadoralu++;
            }
            else if(personas.get(i) instanceof Staff)
            {
                contadorProfe++;
            }
        }

        System.out.println("la cantidad de profes es de: " + contadorProfe);
        System.out.println("la cantidad de Alumnos es de: " + contadoralu);

        double totalcuota = 0;
        for (i = 0; i < personas.size(); i++)
        {
            if(personas.get(i) instanceof Alumno)
            {
                totalcuota += ((Alumno) personas.get(i)).getCuotaMensual();
            }
        }

        System.out.println("El total es de: " + totalcuota);


    }

    public static void EJ3()
    {

    }


}
