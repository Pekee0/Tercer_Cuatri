package Clases.EJ6;

import java.util.ArrayList;
import java.util.Scanner;

public class FlotaVehiculos {

    ArrayList <Vehiculo> flota;

    public FlotaVehiculos ()
    {

        flota = new ArrayList<>();


    }


    public void AgregarVehiculo (Vehiculo a)
    {
        flota.add(a);

    }

    public int buscarVehiculo(Vehiculo a)
    {
        for (int i = 0; i < flota.size(); i++)
        {
            Vehiculo vehiculo = flota.get(i);
            if (vehiculo.getPatente().equals(a.getPatente()))
            {
                return i; // Retorna el índice del vehículo encontrado
            }
        }

        return -1;
    }

    public void modificarVehiculo (int indice)
    {
        Scanner sc = new Scanner(System.in);
       Vehiculo vehiculo = flota.get(indice);

       int opc = 0;
       switch (opc)
       {
           case 1:
               System.out.println("ingrese el nuevo kilometraje");
               vehiculo.nuevoKilometrajeVehiculo(vehiculo,sc);
               break;

               case 2:
                   System.out.println("Ingrese el nuevo estado del vehiculo");
                   vehiculo.setEstado(sc.nextLine());
            break;

           case 3:
               System.out.println("Ingrese el nuevo precio del alquiler del vehiculo");
               vehiculo.setPrecioAlquiler(sc.nextInt());
               break;
           case 4:
               ///posible historial
               break;

       }

       flota.remove(indice);
       AgregarVehiculo(vehiculo);

    }

    public void mostrarFlota()
    {
        for(Vehiculo flota: flota)
        {
            System.out.println(flota.toString());
        }
    }
    public void listarEstado (ArrayList <Vehiculo> flota)
    {
        for( int i = 0; i < flota.size(); i++)
        {
            System.out.println("Estado: " + flota.get(i).getEstado());
        }

    }



}
