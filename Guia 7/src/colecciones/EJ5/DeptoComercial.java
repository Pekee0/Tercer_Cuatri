package colecciones.EJ5;

import clases.EJ5.Comisionista;
import clases.EJ5.Empleado5;
import clases.EJ5.Repartidor;
import clases.EJ5.Vendedor;

import java.util.ArrayList;

public class DeptoComercial {

    private int codigoDepto;
    private ArrayList <Empleado5> empleados;

    public DeptoComercial(int codigoDepto)
    {
        this.codigoDepto = codigoDepto;
        empleados = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "DeptoComercial{" +
                "codigoDepto=" + codigoDepto +
                ", empleados=" + empleados +
                '}';
    }


    public void aplicarAumentos(double aumento)
    {
        Empleado5 empleado = null;
        double salario = empleado.getSalarioBase();

        for (Empleado5 empleado5: empleados)
        {
            empleado.setSalarioBase(salario*aumento);
        }
    }


    public int cantidadVendedores()
    {
        int cantidad = 0;

        for(Empleado5 empleado: empleados)
        {
            if (empleado instanceof Vendedor)
            {
                cantidad++;
            }
        }

        return cantidad;
    }
    public int cantidadComisionistas()
    {
        int cantidad = 0;

        for(Empleado5 empleado: empleados)
        {
            if (empleado instanceof Comisionista)
            {
                cantidad++;
            }
        }

        return cantidad;
    }

    public int cantidadRepartidopres()
    {
        int cantidad = 0;

        for(Empleado5 empleado: empleados)
        {
            if (empleado instanceof Repartidor)
            {
                cantidad++;
            }
        }

        return cantidad;
    }

    public int masDeCincoSalidas()
    {
        int cantidad = 0;

        for (Empleado5 empleado: empleados)
        {
            if (empleado instanceof Repartidor)
            {
                if (((Repartidor) empleado).getSalidasPordia() > 5)
                {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }


    public int ventasMenoraCinco()
    {
        int cantidad = 0;

        for (Empleado5 empleado : empleados)
        {
            if (empleado instanceof Vendedor)
            {
                if(((Vendedor) empleado).getPorcentajeComision() < 0.5)
                {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

    public int comisionistasConVeinteEntregas()
    {
        int cantidad = 0;

        for (Empleado5 empleado : empleados)
        {
            if(empleado instanceof Comisionista)
            {
                if (((Comisionista) empleado).getCanitdadEntregas()>= 20)
                {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

    public int cantVendedoresConSamsung()
    {
        int cantidad = 0;

        for(Empleado5 empleado: empleados)
        {
            if(empleado instanceof Vendedor)
            {
                if(((Vendedor) empleado).getCelularDesignado().getMarca().equalsIgnoreCase("samsung"))
                {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

    public Empleado5 mejorVendedor()
    {
            Vendedor aux = null;

        for (Empleado5 empleado : empleados)
        {
            if(empleado instanceof Vendedor)
            {
                if(aux.getPorcentajeComision() < ((Vendedor) empleado).getPorcentajeComision())
                {
                    aux = (Vendedor) empleado;
                }
            }
        }

        return aux;
    }



    

}
