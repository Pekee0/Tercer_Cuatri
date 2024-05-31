package Ejercicio1;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nombre;
    private String mail;
    private double descuento;

    public Cliente()
    {

    }

    public Cliente (String nombre, String mail, double descuento)
    {
        id = UUID.randomUUID();
        this.nombre = nombre;
        this.mail = mail;
        this.descuento = descuento;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
