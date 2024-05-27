package clases.EJ5;

import java.util.Objects;

public class Celular {

    private int id;
    private String modelo;
    private String marca;
    private String numero;


    public Celular(int id, String modelo, String marca, String numero) {

        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.numero = numero;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numero=" + numero +
                '}';
    }



}
