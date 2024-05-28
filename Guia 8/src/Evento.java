import java.time.LocalDate;

public class Evento  {
    private String nombre;
    private LocalDate fecha;
    private Prioridad prioridad;

    public Evento(String nombre, LocalDate fecha, Prioridad prioridad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }



    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", prioridad='" + prioridad + '\'' +
                '}';
    }
}
