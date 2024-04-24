package Clases.EJ3;

public class Lavadora extends Electrodomestico {

// ATRIBUTOS--------------------------------------------------------------------------------------------------------
    private double carga;

// CONSTANTES--------------------------------------------------------------------------------------------------------
    private static final double CARGA = 5;


// CONSTRUCTORES-----------------------------------------------------------------------------------------------------

    public Lavadora()
    {

    }

        public  Lavadora(double precio, double peso)
    {
        super(precio,peso);
    }

    public Lavadora (double carga,double precioBase, String color, char consumoEnergetico, double peso)
    {
        super(precioBase,color,consumoEnergetico,peso);
        this.carga = carga;
    }





// METODOS-------------------------------------------------------------------------------------------------------
    public double getCarga() {
        return carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (carga > 30)
        {
            setPrecioBase(getPrecioBase()+50);
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "Lavadora{" +
                "carga=" + carga +
                '}';
    }
}
