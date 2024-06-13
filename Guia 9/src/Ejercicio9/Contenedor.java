package Ejercicio9;

public class Contenedor <T, U extends T> {

        private T elementoT;
        private U elementoU;


        public Contenedor()
        {

        }


    public void   concatenar (T elemento1, U elemento2)
    {
        System.out.println(elemento1.toString() + elemento2.toString());
    }
}
