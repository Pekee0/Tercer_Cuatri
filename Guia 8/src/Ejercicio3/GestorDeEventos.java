package Ejercicio3;

import java.util.Comparator;
import java.util.TreeSet;

public class GestorDeEventos {

    private TreeSet <Evento> Inventario;

    public GestorDeEventos ()
    {
        Inventario = new TreeSet<>(new Comparator<Evento>() {
            @Override
            public int compare(Evento o1, Evento o2) {
                int pancho = o1.getPrioridad().compareTo(o2.getPrioridad());
                if(pancho == 0)
                {
                    pancho = o1.getFecha().compareTo(o2.getFecha());
                }
                if(pancho == 0)
                {
                    pancho = o1.getNombre().compareTo(o2.getNombre());
                }

                return pancho;
            }
        });
    }

    public void AgregarEvento(Evento evento)
    {
        Inventario.add(evento);
    }

    public void MostrarEvento() // Ver como mostrar o agregar por PRIORIDAD
    {
        for(Evento evento:Inventario)
        {
            System.out.println(evento.toString());
        }
    }

}
