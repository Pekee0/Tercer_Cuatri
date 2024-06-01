package Ejercicio4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class GestorDeInventario {

    HashMap<String,Item> inventario;

    public GestorDeInventario()
    {
        inventario = new HashMap<>();
    }

    public void agregarItem(Item item)
    {
        inventario.put(item.getNombre(),item);
    }

    public void actualizarPrecio(double precioNuevo,String key)
    {
        Item aux = inventario.get(key);
        aux.setPrecio(precioNuevo);
        inventario.put(key,aux);
    }

    public void actualizarStock(int nuevoStock,String key)
        {
            Item aux = inventario.get(key);
            aux.setStock(nuevoStock);
            inventario.put(key,aux);
        }

        public void eliminarItem(String key)
        {
            inventario.remove(key);
        }

        public void mostrarItemOrdenados()
        {
            TreeMap<String,Item>muestra = new TreeMap<>(inventario);

            for (Map.Entry<String,Item> entry : muestra.entrySet())
                    {
                        System.out.println(entry.getKey() + ":" +  entry.getValue());
                    }
        }
}
