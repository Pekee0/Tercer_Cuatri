package Domain.EJ1;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro() {
        super();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen(double altura, double area)
    {
        return (calcularArea(area) * altura);

    }

    @Override
    public double calcularArea(double radio) {

        return ((2 * Math.PI) * radio  * getAltura()) + super.calcularArea(radio);

    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + "Altura: " + getAltura();
    }
}
