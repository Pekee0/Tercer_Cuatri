package App;

import Domain.ArrayReales;
import Domain.Matematica;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //EJ1(sc);
        EJ2();
    }

    public static void EJ1(Scanner sc)
    {
        ArrayReales numeros = new ArrayReales();

        for (int i = 0; i < 10; i++)
        {
            numeros.agregarNums(Math.random());
        }

        System.out.println(numeros.mostrarArray());
        System.out.println("Mayor: " + numeros.maximo());
        System.out.println("Menor: " + numeros.minimo());
        System.out.println("Suma: " + numeros.sumatorio());

    }

    public static void EJ2()
    {
        Matematica mats = new Matematica();

        for (int i = 0; i < 10; i++)
        {
            mats.agregar(Math.random());
        }

        System.out.println(mats.mostrarArray());
        System.out.println("primero: " + mats.inicio());
        System.out.println("ultimo: " + mats.fin());


    }
}