package Clases.EJ7;

import java.util.Scanner;

public class Socio {

    private String nombre;
    private String dni;
    private double cuota;


    public Socio ()
    {

    }

    public Socio(String nombre, String dni, double cuota)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }


    public Socio CrearNuevoSocio (Socio socio)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        socio.nombre = sc.nextLine();

        System.out.println("Ingrese su DNI: ");
        socio.dni = sc.nextLine();

        System.out.println("Ingrese el monto de la cuota que abona");
        socio.cuota = sc.nextDouble();

        return socio;
    }

  /*  public Socio PagarCuota (Socio socio)
    {

    }
*/
}
