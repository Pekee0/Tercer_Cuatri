package Clases.EJ3;

import java.util.ArrayList;

public class Electrodomestico {
    ///ATRIBUTOS--------------------------------------------------------------------------------------------------
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    ///CONSTANTES--------------------------------------------------------------------------------------------------
    private static final double PRECIO_BASE = 100;
    private static final String COLOR = "Blanco";
    private static final char CONSUMO_ENERGETICO = 'F';
    private static final double PESO = 5;

    ///CONSTRUCTORES-----------------------------------------------------------------------------------------------
    public Electrodomestico() {
        precioBase = PRECIO_BASE;
        color = COLOR;
        consumoEnergetico = CONSUMO_ENERGETICO;
        peso = PESO;

        precioFinal();
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        color = COLOR;
        consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = peso;

        precioFinal();
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;

        if(comprobarColor(color)) {
            this.color = color;
        }
        else {
            this.color = COLOR;
        }

        if(comprobarConsumoEnergia(consumoEnergetico)) {
            this.consumoEnergetico = consumoEnergetico;
        }
        else {
            this.consumoEnergetico = CONSUMO_ENERGETICO;
        }

        this.peso = peso;

        precioFinal();
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    ///GETTER'S----------------------------------------------------------------------------------------------------
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }

    ///METODOS-PROPIOS---------------------------------------------------------------------------------------------
    public boolean comprobarConsumoEnergia(char letra) {
        boolean letraConsumoDisponible = false;
        String letrasDisponibles = "ABCDE";
        for(int i = 0; i < letrasDisponibles.length(); i++) {
                if(letra == letrasDisponibles.charAt(i)) {
                    letraConsumoDisponible = true;
                }
        }
        return letraConsumoDisponible;
    }

    public boolean comprobarColor(String color) {
        boolean colorComprobar = false;
        ArrayList<String> coloresDisponibles= new ArrayList<String>();
        coloresDisponibles.add("Negro");coloresDisponibles.add("Rojo");coloresDisponibles.add("Azul");
        coloresDisponibles.add("Gris");
        for(int i = 0; i < coloresDisponibles.size(); i++) {
            if(this.color == color) {
                colorComprobar = true;
            }
        }
        return colorComprobar;
    }

    public void precioFinal() {
        switch(consumoEnergetico) {
            case 'A':
                precioBase += 100;
                break;
            case 'B':
                precioBase += 80;
                break;
            case 'C':
                precioBase += 60;
                break;
            case 'D':
                precioBase += 50;
                break;
            case 'E':
                precioBase += 30;
                break;
            case 'F':
                precioBase += 10;
                break;
        }

        switch (devolverAumentoDePeso(peso)) {
            case 1:
                precioBase += 10;
                break;
            case 2:
                precioBase += 50;
                break;
            case 3:
                precioBase += 80;
                break;
            case 4:
                precioBase += 100;
                break;
        }
    }

    public int devolverAumentoDePeso(double peso) {
        int aux = 0;
        if(peso > -1 && peso < 20) {
            aux = 1;
        }
        else if(peso > 19 && peso < 50) {
            aux = 2;
        }
        else if(peso > 49 && peso < 80) {
            aux = 3;
        }
        else if(peso > 79) {
            aux = 4;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
