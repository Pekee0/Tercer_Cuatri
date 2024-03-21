
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        EJ1(teclado);
        EJ2(teclado);

        

    }
    
    public static void EJ1(Scanner sc)
    {
        Rectangulo rec1 = new Rectangulo();

        System.out.println("Ingrese un valor para el alto del recatangulo. ");
        rec1.setAlto(sc.nextDouble());

        System.out.println("Ingrese un valor para el ancho del rectangulo. ");
        rec1.setAncho(sc.nextDouble());

        System.out.println("El area del rectangulo es de " + rec1.calcularArea());
        System.out.println("El perimetro del rectangulo es de " + rec1.calcularPerimetro());
    }

    public static void EJ2 (Scanner sc)
    {

    }
}