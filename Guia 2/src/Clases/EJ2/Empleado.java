package Clases.EJ2;

public class Empleado {

    /// ATRIBUTOS

    private int dni;

    private String nombre;
    private String apellido;
    private double salario;

    /// setter y getter
    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }


    /// METODOS

    public double calcularSalario(double salario) {
        return salario * 12;
    }

    public double aumentarSalario(double porcentaje) {
        return salario = salario  + salario * (porcentaje / 100);
    }

    public void mostrarEmpleado()
    {
        System.out.println("Nombre"  + this.nombre);
        System.out.println("Apellido" + this.apellido);
        System.out.println("DNI" + this.dni);
        System.out.println("Salario" + this.salario);

    }

}
