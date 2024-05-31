package Ejercicio3;

import java.time.LocalDate;

public class Evento implements Comparable <Prioridad> {
    private String nombre;
    private LocalDate fecha;
    private Prioridad prioridad;

    public Evento(String nombre,Prioridad prioridad) {
        this.nombre = nombre;
        this.fecha = LocalDate.now();
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", prioridad='" + prioridad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Prioridad o) {
        return 0;
    }
}
