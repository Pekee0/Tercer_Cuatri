package Clases.EJ5;

import java.util.Scanner;
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;



    public void setHora(int hora) {
        if(hora<0 || hora>24)
        {
            System.out.println("??? que flashas?");
        }
        else
        {
            this.hora = hora;
        }
    }


    public void setMinuto(int minuto) {
        if(minuto<0 || minuto>60)
        {
            System.out.println("??? que flashas?");
        }
        else
        {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if(segundo<0 || segundo>60)
        {
            System.out.println("??? que flashas?");
        }
        else
        {
            this.segundo = segundo;
        }
    }


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public Hora(int hora, int minuto, int segundo){

        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    /// metodos
    public void mostrarHora()
    {
        String.format("%02 : %02 : %02", getHora(), getMinuto(), getSegundo());
    }
}
