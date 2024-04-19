package EJ_5;

import domain.Factura;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Cliente {

    private int numeroDeFactura;
    private LocalDateTime fecha;
    private String nombre_Apellido;
    private  String domicilio;
    private String cuit;
    private ListaFacturas facturas;


    public Cliente(int numeroDeFactura, LocalDateTime fecha, String nombre_Apellido, String domicilio,
                   String cuit) {
        this.numeroDeFactura = numeroDeFactura;
        this.fecha = fecha;
        this.nombre_Apellido = nombre_Apellido;
        this.domicilio = domicilio;
        this.cuit = cuit;
        facturas = new ListaFacturas();
    }

    public int getNumeroDeFactura() {
        return numeroDeFactura;
    }

    public void setNumeroDeFactura(int numeroDeFactura) {
        this.numeroDeFactura = numeroDeFactura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNombre_Apellido() {
        return nombre_Apellido;
    }

    public void setNombre_Apellido(String nombre_Apellido) {
        this.nombre_Apellido = nombre_Apellido;
    }


    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void agregarFactura(Factura factura) {
        facturas.agregar(factura);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroDeFactura=" + numeroDeFactura +
                ", fecha=" + fecha +
                ", nombre_Apellido='" + nombre_Apellido + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", cuit='" + cuit + '\'' +
                ", facturas=" + facturas.mostrarFacturas() +
                '}';
    }
}
