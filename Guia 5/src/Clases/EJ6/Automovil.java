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
    public Vehiculo CrearVehiculo(Vehiculo a) {
            Automovil auto = (Automovil) a;
            Scanner sc = new Scanner(System.in);
            super.CrearVehiculo(a);

        System.out.println("Ingrese la fecha del Alquier");
        auto.fechaDeAlquiler =(sc.nextLine());


        return a;
    }

    @Override
    public String toString() {
        return super.toString() + "Automovil{" +
                "fechaDeAlquiler='" + fechaDeAlquiler + '\'' +
                ", nombreDelInquilino='" + nombreDelInquilino + '\'' +
                '}';
    }
}
