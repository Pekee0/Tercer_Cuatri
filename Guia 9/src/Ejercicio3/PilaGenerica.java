package Ejercicio3;

import java.util.EmptyStackException;
import java.util.Stack;

public class PilaGenerica <T extends Number>
{
    private Stack <T> elementos;

    public PilaGenerica()
    {
        elementos = new Stack<>();
    }

    public void Apilar(T elemento)
    {
        elementos.add(elemento);
    }
    public T Desapilar()
    {
        if (elementos.isEmpty())
        {
            throw new IllegalStateException("La pila esta Vacia");

        }

        return elementos.remove(elementos.size()-1);
    }

}
