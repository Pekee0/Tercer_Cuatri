package Clases.EJ6;

import java.util.Scanner;

public class Automovil extends Vehiculo{

        private  String fechaDeAlquiler;
        private  String nombreDelInquilino;

        public Automovil (String fechaDeAlquiler, String nombreDelInquilino, String patente, String marca, String modelo, int año, int kilometraje, int precioAlquiler,String estado)
        {
            super(patente, marca, modelo, año, kilometraje, precioAlquiler, estado);
            this.fechaDeAlquiler = fechaDeAlquiler;
            this.nombreDelInquilino = nombreDelInquilino;

        }

    @Override
    public Vehiculo agregarVehiculo(Vehiculo a) {
        super.agregarVehiculo(a);

        System.out.println("Ingrese la fecha del Alquier");


        return a;
    }
}
