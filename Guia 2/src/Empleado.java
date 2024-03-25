public class Empleado {

    /// ATRIBUTOS

    private int dni;

    private String nombre;
    private String apellido;
    private double salario;

    /// setter y getter
    public Empleado (int dni, String nombre, String apellido, double salario)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni(){return dni};
    /// METODOS

    public double calcularSalario(double salario)
    {
        return salario*12;
    }

    /*public double aumentarSalario(double porcentaje)
    {

    }
*/

    @Override
    public String toString() {
        return "Empleado{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
