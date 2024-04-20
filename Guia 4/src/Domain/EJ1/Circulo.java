package Domain.EJ1;

public class Circulo {

    private double radio = 1.0;
    private String color = "Rojo";


    public Circulo(double radio, String color)
    {
        this.radio = radio;
        this.color = color;
    }

    public Circulo()
    {

    }




    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


    public double calcularArea(double radio)
    {
        return 3.14 * (Math.pow(radio,2));
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
