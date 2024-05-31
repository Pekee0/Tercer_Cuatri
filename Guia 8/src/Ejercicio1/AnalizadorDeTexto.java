package Ejercicio1;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class AnalizadorDeTexto {

    HashSet<String> TextoSinRepetidos;

    public AnalizadorDeTexto() {this.TextoSinRepetidos = new HashSet<String>();}

    public void recibirTexto(String texto)
    {
        String[] palabras = texto.toLowerCase().split(" ");
        ArrayList <String> palabras2 = new ArrayList<>(Arrays.asList(palabras));

        for (String palabra : palabras2) {

            TextoSinRepetidos.add(palabra);
        }
    }

    public void mostrarSet ()
    {
        for (String palabra : TextoSinRepetidos)
        {
            System.out.println("palabra: " + palabra);
        }
    }

    public void OrdenarAlfabeticamente ()
    {
        TreeSet <String> Treeordenado = new TreeSet<>();
        Treeordenado.addAll(TextoSinRepetidos);

        for (String palabra : Treeordenado)
        {
            System.out.println(palabra);
        }
    }


}
