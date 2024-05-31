public class Evento {
    private String nombre;
    private String fecha;
    private String prioridad;

    public Evento(String nombre, String fecha, String prioridad) {
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
