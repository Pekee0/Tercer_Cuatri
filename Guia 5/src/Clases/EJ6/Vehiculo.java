package Clases.EJ6;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Vehiculo {

    private String patente;
    private String marca;
    private String modelo;
    private  int año;
    private int kilometraje;
    private int precioAlquiler;
    private  String estado; // (disponible, alquilado, en reparación).

    private ArrayList <Vehiculo> historial;

    public Vehiculo()
    {

    }

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


    public void alquilarOdevolerVehiculo(Vehiculo vehiculo)
    {
        if (estado == "Alquilado")
        {
            if(verificacionTecnica())
            {
                estado = "Disponible";
            }
            else
            {
                estado = "En reparacion";
            }
        }

    }
    public void nuevoKilometrajeVehiculo(Vehiculo vehiculo,Scanner sc)
    {
        Random rd = new Random();
        vehiculo.setKilometraje(kilometraje + rd.nextInt(10,1000));
    }

    public boolean verificacionTecnica()
    {
        Random rd = new Random();

        return rd.nextBoolean();
    }


    public Vehiculo CrearVehiculo(Vehiculo a)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la patente del vehiculo");
        a.patente = (sc.next());

        System.out.println("ingrese la marca del vehiculo");
        a.marca =(sc.next());

        System.out.println("ingrese el modelo del vehiculo");
        a.modelo = sc.next();

        System.out.println("ingrese el año del vehiculo");
        a.año = sc.nextInt();

        System.out.println("ingrese el kilometraje del vehiculo");
        a.kilometraje = sc.nextInt();

        System.out.println("ingrese el precio de alqiler:");
        a.precioAlquiler = sc.nextInt();

        System.out.println("Ingrese el estado en el que se encuentra");
        a.estado = (sc.next());

        return a;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", kilometraje=" + kilometraje +
                ", precioAlquiler=" + precioAlquiler +
                ", estado='" + estado + '\'' +
                ", historial=" + historial +
                '}';
    }
}
