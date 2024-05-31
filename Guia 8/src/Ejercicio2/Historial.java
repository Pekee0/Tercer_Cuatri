package Ejercicio2;

import com.sun.source.util.Trees;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Historial {

    LinkedHashSet <Busqueda> HistorialBusqueda;

    public Historial()
    {this.HistorialBusqueda =  new LinkedHashSet <Busqueda>();}

    public LinkedHashSet<Busqueda> getHistorialBusqueda() {
        return HistorialBusqueda;
    }

    public void agregarBusqueda (Busqueda busqueda)
    {
        HistorialBusqueda.add(busqueda);
    }

    public void mostrarHistorial()
    {
        TreeSet <Busqueda> tree = new TreeSet<>();
        tree.addAll(HistorialBusqueda);

        for (Busqueda busqueda : tree)
        {
            System.out.println(busqueda.toString());
        }
    }
}
