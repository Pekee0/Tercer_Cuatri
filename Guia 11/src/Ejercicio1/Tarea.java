package Ejercicio1;

import java.io.Serializable;
import java.time.LocalDate;

public class Tarea implements Serializable {

    private int id;

    private String Descripcion;



    public Tarea(int id, String descripcion)
    {
        this.id = id;
        this.Descripcion = descripcion;

    }

    public Tarea()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }



    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", Descripcion='" + Descripcion + '\'' + '}';
    }
}

