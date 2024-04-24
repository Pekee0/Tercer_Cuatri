package Clases.EJ1;

import java.util.Random;

public class Persona {

    private char sexo;
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
       this.sexo = 'H';
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        dni = generaDNI();
        this.sexo = 'H';
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

    public void comprobarSexo (char sexo)
    {
        if (sexo == 'M')
        {
            System.out.println("es minita");
        } else if (sexo == 'H') {
            System.out.println("es pibe");
        } else {

            System.out.println("no binario?");
        }
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

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public char getSexo() {
        return sexo;
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
}
