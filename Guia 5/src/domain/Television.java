package domain;

public class Television extends Electrodomestico {
    ///ATRIBUTOS----------------------------------------------------------------------------------------------------
    private int pulgadas;
    private boolean sintonizadorTDT;

    ///CONSTANTES---------------------------------------------------------------------------------------------------
    private static final int PULGADAS = 20;
    private static final boolean SINTONIZADOR_TDT = false;

    ///CONSTRUCTORES-------------------------------------------------------------------------------------------------
    public Television() {
        pulgadas = PULGADAS;
        sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television (double precio, double peso) {
        super(precio,peso);
        pulgadas = PULGADAS;
        sintonizadorTDT = SINTONIZADOR_TDT;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas,
                      boolean sintonizadorTDT) {
        super(precioBase,color,consumoEnergetico,peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    ///GETTER'S------------------------------------------------------------------------------------------------------
    public int getPulgadas() {
        return pulgadas;
    }
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    ///METODOS------------------------------------------------------------------------------------------------------

    @Override
    public void precioFinal() {
        super.precioFinal();

        if(pulgadas > 40) {
            setPrecioBase(getPrecioBase()*0.3);
        }

        if(sintonizadorTDT) {
            setPrecioBase(getPrecioBase()+50);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Television{" +
                "pulgadas=" + pulgadas +
                ", sintonizadorTDT=" + sintonizadorTDT +
                '}';
    }
}
