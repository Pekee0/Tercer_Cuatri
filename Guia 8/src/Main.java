import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EJ1();
        EJ2();

    }

    public static void EJ1 ()
    {
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese texto: ");
        String texto = sc.nextLine();

        String[] palabras = texto.toLowerCase().split(" ");

        for (int i = 0; i < palabras.length; i++)
        {
            set.add(palabras[i]);
        }

        System.out.println(set);
    }

   public static void EJ2 ()
   {
       LinkedHashSet linkedHashSet = new LinkedHashSet<>();

       Scanner sc = new Scanner(System.in);

       String busqueda;
       char mander = 's';
       do {
           System.out.print("Ingrese su busqueda: ");
           busqueda = sc.nextLine();

           linkedHashSet.add(busqueda);

           System.out.println("¿Desea buscar algo más? s/n");
           mander = sc.nextLine().charAt(0);
       } while (mander == 's');

       LinkedList <String> muestra = new LinkedList<>(linkedHashSet);

       System.out.println(muestra.toString());
   }

   public static void ejercicio3() {
        TreeSet treeSet = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
   }
}