package Clases.EJ3;

import java.util.UUID;

public class ClienteBank {

   private UUID id;
   private String nombre;
   private char genero;

    public ClienteBank (String nombre, char genero)
    {
        id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public UUID getId() {
        return id;
    }


}


