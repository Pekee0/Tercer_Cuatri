package colecciones.EJ1;

import clases.EJ1.Producto;

import java.util.ArrayList;

public class Tienda {
    ArrayList<Producto> productos;

    public Tienda()
    {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }

    public String buscarPorNombre(String nombre) {
        Producto aux = new Producto();
        for(int i = 0; i < productos.size();i++)
        {
            if (nombre.equals(productos.get(i).getNombre())) {
                aux = productos.get(i);
                i = productos.size();
            }
        }
        return aux.toString();
    }

    public String mostrarInventario()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < productos.size();i++)
        {
            sb.append(productos.get(i).toString()+"\n");
        }
        return sb.toString();
    }

    public void actualizarCantidad(int cantidad, String nombre)
    {
        for (int i = 0; i< productos.size(); i++)
        {
           if (nombre.equals(productos.get(i).getNombre()))
           {
               productos.get(i).setCantidadDisponible(cantidad);
               i = productos.size();
           }
        }
    }

    public int calcularCantidad()
    {
        int sumatoria = 0;

        for (int i = 0; i < productos.size(); i++)
        {
            sumatoria+=productos.get(i).getCantidadDisponible();
        }

        return sumatoria;
    }



}
