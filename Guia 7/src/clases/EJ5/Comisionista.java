package clases.EJ5;

public class Comisionista extends Empleado5 {

    private int canitdadEntregas;


    public Comisionista()
    {

    }

    public int getCanitdadEntregas() {
        return canitdadEntregas;
    }

    public void setCanitdadEntregas(int canitdadEntregas) {
        this.canitdadEntregas = canitdadEntregas;
    }


    @Override
    public String toString() {
        return "Comisionista{" +
                "canitdadEntregas=" + canitdadEntregas +
                '}';
    }

    @Override
    public double calcularSalario()
    {

        return 0;
    }
}
