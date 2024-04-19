package domain;

import java.util.ArrayList;

public class Factura {

    private int cantidad;

    private String item;
    private double precioUnitario;
    private double precioTotal;

    public Factura(int cantidad,String item,double precioUnitario) {

        this.cantidad = cantidad;
        this.item = item;
        this.precioUnitario = precioUnitario;
        setPrecioTotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
        precioTotal = cantidad * precioUnitario;
    }


    @Override
    public String toString() {
        return "Factura{" +
                "cantidad=" + cantidad +
                ", item='" + item + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
