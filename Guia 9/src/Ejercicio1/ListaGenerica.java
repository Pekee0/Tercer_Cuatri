package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T>  {

    private List<T> elementos = new ArrayList<>();
    private int tope;

    public ListaGenerica(int tope)
    {
        this.tope = tope;
    }

    public boolean agregarElementos (T o)
    {
        if (elementos.size() < tope)
        {
            elementos.add(o);
            return true;
        }

        return false;
    }

    public int ObtenerTamaño ()
    {
        int size = elementos.size();
        return size;
    }

    public int ObtenerPosicionEspecifica(T o)
    {
        for (int i = 0; i < elementos.size(); i++)
        {
            if(elementos.get(i).equals(o))
            {
                return i;
            }
        }

        return -1;
    }

    public List<T> getElementos() {
        return elementos;
    }



    public static < T extends Comparable <T>> void mostrarLista(List<T> lista)
    {
        for(T elemento : lista)
        {
            System.out.println(elemento);
        }
    }


}
