package Clases.EJ1;

public class Rectangulo
{
    /// ATRIBUTOS
    private double ancho;
    private double alto;


    /// SETTERS & GETTERS
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    /// METODOS
    public double calcularArea()
    {
        return ancho * alto;
    }

    public double calcularPerimetro()
    {
        return (ancho * 2) + (alto * 2);
    }
}


