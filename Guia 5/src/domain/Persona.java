package domain;

import java.security.SecureRandom;
import java.util.Random;

public class Persona {

    private static char SEXO = 'H';
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        SEXO = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        dni = generaDNI();
        SEXO = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    public double calcularMC(double peso, double altura) {
        double respuesta = 0;

        respuesta = peso / (Math.pow(altura, 2));

        if (respuesta < 20) {
            respuesta = -1;
        } else if (respuesta >= 20 && respuesta <= 25) {
            respuesta = 0;
        } else if (respuesta > 25) {
            respuesta = 1;

        }

        return respuesta;

    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad > 17) {
            mayor = true;
        }
        return mayor;
    }

    public String generaDNI() {
        Random generar = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            sb.append(generar.nextInt(10));
        }

        return sb.toString();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void setSEXO(char SEXO) {
        Persona.SEXO = SEXO;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "EjercicioUno.Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static class Password {
        private static int LONGITUD = 8;
        private String contraseña;
        private String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
}
