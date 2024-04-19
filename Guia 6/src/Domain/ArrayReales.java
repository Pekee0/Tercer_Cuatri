package Domain;

import interfaces.IEstadisticas;

import java.util.ArrayList;

public class ArrayReales implements IEstadisticas {

    private ArrayList<Object> reales ;

    public ArrayReales() {
        reales = new ArrayList<Object>();
    }

    @Override
    public double maximo() {
        double max;
        max = (double)reales.get(0);
        for (int i = 0; i < reales.size(); i++)
        {
            if(max < (double)reales.get(i))
            {
                max = (double) reales.get(i);
            }

        }
        return max;
    }

    @Override
    public double minimo()
    {
        double min;
        min = (double)reales.get(0);
        for (int i = 0; i < reales.size(); i++)
        {
            if(min > (double)reales.get(i))
            {
                min = (double) reales.get(i);
            }

        }
        return min;
    }

    @Override
    public double sumatorio()
    {
        double total = 0;

        for (int i = 0; i < reales.size(); i++)
        {
            total += (double)reales.get(i);

        }
        return total;
    }

    public void agregarNums(double num)
    {
        reales.add(num);

    }

    public String mostrarArray()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < reales.size();i++)
        {
            sb.append(reales.get(i).toString()+"\n");
        }
        return sb.toString();
    }
}
