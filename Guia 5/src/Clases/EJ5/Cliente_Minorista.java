package Clases.EJ5;

import java.time.LocalDateTime;

public class Cliente_Minorista extends Cliente {

    public Cliente_Minorista(int numeroDeFactura, LocalDateTime fecha, String nombre_Apellido, String domicilio, String cuit) {
        super(numeroDeFactura, fecha, nombre_Apellido, domicilio, cuit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
