package Clases.EJ3;

import java.util.Scanner;

public class Venta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double punitario;
    private double ptotal;

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public int getCantidad() {
        return cantidad;
    }

    public double getPtotal() {
        return ptotal;
    }

    public double getPunitario() {
        return punitario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPtotal(double ptotal) {
        this.ptotal = contarTotal(cantidad,punitario);
    }

    public void setPunitario(double punitario) {
        this.punitario = punitario;
    }

    public Venta(int id, int cantidad, String descripcion, double punitario) {

        this.id = id;
        this.cantidad = cantidad;
        this.punitario = punitario;
        this.descripcion = descripcion;
        ptotal = contarTotal(cantidad,punitario);
    }


    /// METODOS

    public double contarTotal(int cantidad, double punitario)
    {
        ptotal = (double) cantidad * punitario;
        return  ptotal;

    }

    @Override
    public String toString() {
        return "Clases.EJ3.Venta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", punitario=" + punitario +
                ", ptotal=" + ptotal +
                '}';
    }
}
