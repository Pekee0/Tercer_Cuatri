package Clases.EJ6;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private  int año;
    private int kilometraje;
    private int precioAlquiler;
    private  String estado; // (disponible, alquilado, en reparación).

    private ArrayList <Vehiculo> historial;


    public Vehiculo (String patente, String marca, String modelo, int año,int kilometraje, int precioAlquiler, String estado)
    {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this. kilometraje = kilometraje;
        this.precioAlquiler = precioAlquiler;
        this.estado = estado;
        this.historial = new ArrayList<>();
    }

    public String getPatente() {
        return patente;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }



    public Vehiculo agregarVehiculo(Vehiculo a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la patente del vehiculo");
        a.patente = String.valueOf(sc.next().charAt(0));

        System.out.println("ingrese la marca del vehiculo");
        a.marca = String.valueOf(sc.next().charAt(0));

        System.out.println("ingrese el modelo del vehiculo");
        a.modelo = String.valueOf(sc.next().charAt(0));

        System.out.println("ingrese el año del vehiculo");
        a.año = sc.nextInt();

        System.out.println("ingrese el kilometraje del vehiculo");
        a.kilometraje = sc.nextInt();

        a.precioAlquiler = sc.nextInt();
        a.estado = String.valueOf(sc.next().charAt(0));

        return a;
    }



}
