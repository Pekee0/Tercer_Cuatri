package colecciones.EJ2;

import java.util.LinkedList;

public class ListaDeNodos {
    private LinkedList<Object> objetos;

    public ListaDeNodos() {
        objetos = new LinkedList<>();
    }

    public void agregar(Object obj) {
        objetos.add(obj);
    }

    public Object eliminarYretornarNuevoPrimero() {
        Object aux = new Object();
        int i = 0;
        aux = objetos.get(i);
        objetos.remove(i);
        return aux;
    }

    public String mostrarInventario()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < objetos.size();i++)
        {
            sb.append(objetos.get(i).toString()+"\n");
        }
        return sb.toString();
    }

    public int peek()
    {
       int i =(int) objetos.get(0); /// UNA MIERDA
       return i;
    }

    public boolean estaVacioVesNoHayObjectsAqui() {
        return objetos.isEmpty();
    }

    public int devolverCantidad() {
        return objetos.size();
    }

}
