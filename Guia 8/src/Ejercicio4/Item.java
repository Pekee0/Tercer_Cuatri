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

    public int getStock(){return stock;}



    @Override
    public String toString() {
        return "Item{" +
                "precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}


