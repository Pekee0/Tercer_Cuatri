package Ejercicio3;

public class Evento {
    private String nombre;
    private String fecha;
    private int prioridad; // -1 baja, 0 media,  1 alta

    public Evento(String nombre, String fecha, int prioridad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }




    @Override
    public String toString() {
        return "Clases.EJ3.Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", prioridad='" + prioridad + '\'' +
                '}';
    }
}
