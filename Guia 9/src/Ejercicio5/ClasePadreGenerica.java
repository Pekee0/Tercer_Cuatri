package Ejercicio5;

public class ClasePadreGenerica<T> {

    private T valor;

    public ClasePadreGenerica(T valor)
    {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
