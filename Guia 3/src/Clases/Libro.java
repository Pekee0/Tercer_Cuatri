package Clases;

import Clases.Autor;

public class Libro {

    private String titulo;
    private Double precio;
    private int stock;
    private Autor autor;


    public Libro (String titulo, Double precio, int stock, Autor autor)
    {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }


    @Override
    public String toString() {
        return "Clases.Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }

    public void printProlijo() {

        System.out.println("El libro " + this.titulo + " de " + this.getAutor().getNombre() + ". Se vende a " + this.precio + "pesos.");

    }
}

