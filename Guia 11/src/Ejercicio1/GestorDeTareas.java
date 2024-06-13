package Ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas implements Serializable {

    private List <Tarea> tareas;


    public GestorDeTareas ()
    {
        tareas = new ArrayList<Tarea>();
    }


    public void agregarTarea(Tarea tarea)
    {
        tareas.add(tarea);
    }

    public void mostrarTareas()
    {
        for (int i = 0; i < tareas.size();i++)
        {
            System.out.println(tareas.get(i));
        }
    }

    public void guardarEnArchivo()
    {
        File archivo = new File("archivo.txt");

        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(archivo));

            for(Tarea tarea : tareas)
            {
                obj.writeObject(tarea);
            }
           obj.close();
        }catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo" + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }

    }

    public void cargarTareasDelArchivo ()
    {
        File archivo = new File("archivo.txt");

        try{

            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(archivo));

            Object aux = obj.readObject();

            while(aux != null)
            {
                if(aux instanceof Tarea)
                {
                    tareas.add((Tarea)aux);
                    aux = obj.readObject();
                }
            }

            obj.close();

        }catch (FileNotFoundException e)
        {
            System.out.println("no existe el archivo" + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Error al leer el archivo ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

