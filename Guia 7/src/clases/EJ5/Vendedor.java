package clases.EJ5;

public class Vendedor extends Empleado5 {

    private double porcentajeComision;

    private Celular celularDesignado;


    public Vendedor ()
    {
        super();

    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public Celular getCelularDesignado() {
        return celularDesignado;
    }

    public void setCelularDesignado(Celular celularDesignado) {
        this.celularDesignado = celularDesignado;
    }

    public void llamar()
    {
        System.out.println(" * ruido de que llama a alguien * ");
    }

    public void atender()
    {
        System.out.println("Buenas buenas");
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", celularDesignado=" + celularDesignado +
                '}';
    }

    @Override
    public double calcularSalario() {
        return 0;
    }


}
