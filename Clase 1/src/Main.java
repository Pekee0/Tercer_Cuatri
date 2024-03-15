
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        //CalcularSueldo(teclado);
        //ClasificacionDeSexo(teclado);
       // Ej1(teclado);
        //Ej2(teclado);
        //EJ3(teclado);
        //EJ4(teclado);
        //EJ5(teclado);
        //Ej6(teclado);
        //EJ7(teclado);
        //Ej8(teclado);
        //Ej9(teclado);
        Ej10(teclado);

    }

    public static void CalcularSueldo(Scanner teclado)
    {
        int horasLaburadas;
        float CostoHoras;
        float Sueldo;
         System.out.println("Ingresar el costo por hora ");
        CostoHoras = teclado.nextFloat();

        System.out.println("Ingrese la cantidad de horas laburadas ");
        horasLaburadas = teclado.nextInt();

        Sueldo = CostoHoras * horasLaburadas;
        System.out.println("Tu sueldo es de: $" + Sueldo + " boludito");


    }

    public static void ClasificacionDeSexo (Scanner teclado)
    {
        char sexo;
        String nombre;

        System.out.println("Ingresar el nombre del empleado: ");
        nombre = teclado.next();

        System.out.println("Ingrsar el sexo del empleado f: femenino o m: masculino: ");
        sexo = teclado.next().charAt(0);

        if (sexo == 'm') {
            System.out.println("El nombre del empleado es: " + nombre + " y el sexo del" +
                    " empleado es Masculino.");
        }
        else {
            System.out.println("El nombre del empleado es: " + nombre + " y el sexo del" +
                    " empleado es Femenino");
        }

    }

    public static void Ej1 (Scanner Teclado)
    {
        int N;
        double A;
        char C;

        System.out.println("Ingrese un valor para N: ");
        N = Teclado.nextInt();
        System.out.println("Ingrese un valor para A");
        A = Teclado.nextDouble();
        System.out.println("Ingrese un valor para C");
        C = Teclado.next().charAt(0);

        System.out.println("El valor de N es: " + N);
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de C es: " + (int)C);

        System.out.println("La suma de N + A es: " + (N + (int)A));
        System.out.println("La Diferencia de N - A es: " + (N - (int)A));

    }

    public static void Ej2(Scanner sc) {
        int X;
        int Y;
        double N;
        double M;

        System.out.println("Ingrese un valor para X: ");
        X = sc.nextInt();

        System.out.println("Ingrese un valor para Y: ");
        Y = sc.nextInt();

        System.out.println("Ingrese un valor para N: ");
        N = sc.nextDouble();

        System.out.println("Ingrese un valor para M: ");
        M = sc.nextDouble();

        System.out.println("X: " + X + "\nY: " + Y + "\nN: " + N + "\nM: " + M);
        System.out.println("X + Y: " + (X + Y));
        System.out.println("N - M: " + (N - M));
    }

    public static void EJ3(Scanner Teclao)
    {
        int N;

        System.out.println("Ingrese un valor para N ");
        N = Teclao.nextInt();

        N = N+77;

        while (N != 3)
        {
            N = N-1;
        }

        N = N*2;

        System.out.println("El valor de N es: " + N);


    }

    public static void EJ4(Scanner sc) {
        int a, b, c, d, x;

        System.out.println("Ingrese un valor para A: ");
        a = sc.nextInt();
        System.out.println("Ingrese un valor para B: ");
        b = sc.nextInt();
        System.out.println("Ingrese un valor para C: ");
        c = sc.nextInt();
        System.out.println("Ingrese un valor para D: ");
        d = sc.nextInt();

        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d );

        x = b;
        b = c;
        c = a;
        a = d;
        d = x;

        System.out.println("Valores cambiados: ");
        System.out.println("A: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d );

    }

    public static void EJ5 (Scanner sc)
    {
        int A;

        System.out.println("Ingrese un valor entero para A");
        A = sc.nextInt();
        if(A %2 == 0)
        {
            System.out.println("A es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }

    public static void Ej6(Scanner sc) {
        int b;
        System.out.println("Ingrese un valor a continuación para saber si es positivo o " +
                "negativo:");
        b = sc.nextInt();

        if(b >= 0) {
            System.out.println(b + " es un número positivo.");
        }
        else {
            System.out.println(b + " es un número negativo.");
        }
    }

    public static  void EJ7(Scanner sc)
    {
        int C;

        System.out.println("Ingrese un valor para C");
        C = sc.nextInt();

        if(C >0)
            System.out.println("C es positivo");
        else
        {
            System.out.println("C es negativo");
        }

        if(C %2 == 0)
        {
            System.out.println("C es par");
        }
        else
        {
            System.out.println("C es impar");
        }

        if(C % 5 == 0)
        {
            System.out.println("C es Multiplo de 5");
        }
        else
        {
            System.out.println("C NO es Multiplo de 5");
        }
        if(C % 10 == 0)
        {
            System.out.println("C es Multiplo de 10");
        }
        else
        {
            System.out.println("C NO es Multiplo de 10");
        }
    }
    public static void Ej8(Scanner sc)
    {
        String nombre;
        System.out.println("Ingrese un nombre: ");
        nombre = sc.next();
        System.out.println("Buenos días, " + nombre);
    }

    public static void Ej9(Scanner sc)
    {
        int Num;
        System.out.println("ingrese un valor entero");
        Num = sc.nextInt();

        System.out.println("El valor que eligio es:" + Num);
        System.out.println("El doble de: " +Num + " es " + (Num*2));
        System.out.println("El Triple de: " +Num + " es " + (Num*3));
    }

    public static void Ej10(Scanner sc) {
        double grados;
        double centigrados;
        System.out.println("Ingrese la cantidad de grados Farenheit que hacen: ");
        grados = sc.nextDouble();

        centigrados = (grados - 32) * 0.5556;

        System.out.println("Convertido a centígrados son: º" + centigrados);
    }


}

