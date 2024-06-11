package Main;

import Ejercicio1.ListaGenerica;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        //EJ1();
        EJ2();
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

    }
}