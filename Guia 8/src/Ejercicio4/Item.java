package Ejercicio4;

public class Item {

    private String nombre;
    private double precio;
    private int stock;

    public Item (double precio, int stock, String nombre)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Item ()
    {

    }

    public double getPrecio(){return precio;}

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock(){return stock;}

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Item{" +
                "precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}


