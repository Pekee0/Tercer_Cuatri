package clases.EJ5;

public class Repartidor extends Empleado5 {

    int salidasPordia;
    Celular celularAsignado;

    public Repartidor()
    {

    }

    public int getSalidasPordia() {
        return salidasPordia;
    }

    public void setSalidasPordia(int salidasPordia) {
        this.salidasPordia = salidasPordia;
    }

    public Celular getCelularAsignado() {
        return celularAsignado;
    }

    public void setCelularAsignado(Celular celularAsignado) {
        this.celularAsignado = celularAsignado;
    }

    @Override
    public double calcularSalario() {

        return 0;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "salidasPordia=" + salidasPordia +
                ", celularAsignado=" + celularAsignado +
                '}';
    }
}
