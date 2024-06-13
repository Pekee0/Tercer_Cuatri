package Ejercicio2;

import Ejercicio1.Tarea;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDeTarasJson {

    private List<Tarea> tareas;


    public GestorDeTarasJson ()
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

    public void escribirTareasEnGson()
    {
        File file = new File("tareas.json");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            Gson gson = new Gson();
            gson.toJson(tareas, bw);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void cargarTareasDeGson()
    {
        File file = new File("tareas.json");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson = new Gson();
             tareas = gson.fromJson(br, new TypeToken<List<Tarea>>() {}.getType());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
