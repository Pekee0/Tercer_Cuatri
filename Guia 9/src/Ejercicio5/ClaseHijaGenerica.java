package Ejercicio5;

public class ClaseHijaGenerica  <T extends ClasePadreGenerica <?>> extends ClasePadreGenerica<T> {

    public ClaseHijaGenerica(T valor)
    {
        super(valor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
