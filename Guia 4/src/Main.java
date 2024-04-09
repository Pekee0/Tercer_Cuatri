import java.util.Scanner;

public class Main {

    public static  void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Ejercicio1(sc);

    }

    public static  void Ejercicio1(Scanner sc)
    {
        Circulo circulin = new Circulo();

        System.out.println("Ingrese un valor para el radio: ");
        circulin.setRadio(sc.nextDouble());
        System.out.println("Ingrese el color del circulo: ");
        circulin.setColor((sc.next()));

        System.out.println("su color es: " + circulin.getColor());

        Cilindro cilindron = new Cilindro();

        System.out.println("Ingrese un valor para el radio: ");
        cilindron.setRadio(sc.nextDouble());
        System.out.println("Ingrese un valor para la altura: ");
        cilindron.setAltura(sc.nextDouble());
        System.out.println("Ingrese un color: ");
        cilindron.setColor(sc.next());


        System.out.println("el area es de: " + cilindron.calcularArea(cilindron.getRadio()));
        System.out.println("El volumen es de: " + cilindron.calcularVolumen(cilindron.getAltura(), cilindron.getRadio()));






    }
}
