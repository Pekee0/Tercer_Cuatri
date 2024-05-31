package Ejercicio2;

import java.time.LocalDate;

public class Busqueda implements Comparable<Busqueda>    {

private String busqueda;
private LocalDate fecha;


 public Busqueda(String busqueda)
 {
     this.busqueda = busqueda;
     this.fecha = LocalDate.now();
 }


    @Override
    public int compareTo(Busqueda o) {
        return LocalDate.MIN.compareTo(o.fecha);
    }

    @Override
    public String toString() {
        return "Busqueda{" +
                "busqueda='" + busqueda + '\'' +
                ", fecha=" + fecha +
                '}';
    }


    public String getBusqueda() {return busqueda;}

    public LocalDate getFecha() {return fecha;}

}
