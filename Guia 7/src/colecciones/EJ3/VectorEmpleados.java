package colecciones.EJ3;

import clases.EJ3.Empleado;

import java.util.Vector;

public class VectorEmpleados {

    private Vector<Empleado> empleados;

    public VectorEmpleados() {
        empleados = new Vector<>(20, 5);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public String buscarYmostrarDatos(String nombre) {
        Empleado aux = new Empleado();
        for (int i = 0; i < empleados.size(); i++) {
            if (nombre.equals(empleados.get(i).getNombre())) {
                aux = empleados.get(i);
            }
        }
        return aux.toString();
    }

    public String mostrarEmpleados() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < empleados.size(); i++) {
            sb.append(empleados.get(i).toString() + "\n");
        }
        return sb.toString();
    }

    public void actualizarSalario(String nombre, double nuevoSalario) {
        for (int i = 0; i < empleados.size(); i++) {
            if (nombre.equals(empleados.get(i).getNombre())) {
                empleados.get(i).setSalario(nuevoSalario);
            }
        }
    }

    public double salarioPromedio() {
        double salario = 0.00;


        for (int i = 0; i < empleados.size(); i++) {
            salario += empleados.get(i).getSalario();
        }
        salario = (salario / empleados.size());

        return salario;
    }
}
