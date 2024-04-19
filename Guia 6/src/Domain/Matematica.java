package Domain;

import interfaces.IExtremos;

import java.util.ArrayList;

public class Matematica implements IExtremos {

    private ArrayList <Double> numeros;


    public Matematica()
    {
        numeros = new ArrayList<Double>();
    }

    @Override
    public double inicio() {

        double primero;

        primero = numeros.get(0);
        return primero;
    }

    @Override
    public double fin() {

        double ultimo;

        ultimo = numeros.get(numeros.size()-1);

        return ultimo;
    }

    public void agregar(double num)
    {

        numeros.add(num);
    }

    public String mostrarArray()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numeros.size();i++)
        {
            sb.append(numeros.get(i).toString()+"\n");
        }
        return sb.toString();
    }
}
