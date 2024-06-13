package Main;

import Ejercicio1.ListaGenerica;
import Ejercicio3.PilaGenerica;
import Ejercicio9.Contenedor;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //EJ1();
        //EJ2();
        //EJ3();
        //EJ4();
        //EJ5();
        EJ9();
    }

    public static void EJ1()
    {
        ListaGenerica <Integer> lista = new ListaGenerica<Integer>(10);
        lista.agregarElementos(1);
        lista.agregarElementos(2);
        lista.agregarElementos(3);
        lista.agregarElementos(4);

        System.out.println("tamaño: " +  lista.ObtenerTamaño());
        int pos = lista.ObtenerPosicionEspecifica(2);
        System.out.println("posicion: " + pos);

    }

    public static void EJ2()
    {
        Integer[] nums = {1,2,3,4,5};

        IntercambiarElementos(nums,1,3);

        System.out.println("Elementos intercambiados");
        for (Integer num : nums)
        {
            System.out.println(num + "");
        }

    }

    public static <T> void IntercambiarElementos(T[] array,int index1, int index2)
    {
        if (array == null || index1 == 0|| index2 == 0 || index1 > array.length || index2 > array.length)
        {
            throw new IllegalArgumentException("Index out of bounds");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void EJ3()
    {
        PilaGenerica pila = new PilaGenerica();
        pila.Apilar(1);
        pila.Apilar(2);
        pila.Apilar(3);

        pila.Desapilar();
        pila.verPila();
    }

    public static void EJ4()
    {
        //ListaGenerica.mostrarLista();
    }

    public static void EJ5()
    {
       Integer num1 = 5;
       Integer num2 = 6;

        System.out.println("Comparacion de enteros: " + comparar(num1,num2));

    }

    public static <T> boolean comparar (T elemento1, T elemento2)
    {
        return elemento1.equals(elemento2);
    }

    public static <T> void ImprimirLista(List<? super Integer> lista)
    {
        for (Object t: lista)
        {
            System.out.println(t);
        }
    }

    public static void EJ9()
    {
        Contenedor contenedor = new Contenedor();
        contenedor.concatenar(7,"pene");

    }

}