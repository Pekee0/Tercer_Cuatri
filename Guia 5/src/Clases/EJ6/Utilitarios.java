package Clases.EJ6;

public class Utilitarios extends Vehiculo{

    private  String tipoDeCarga;

    public Utilitarios(String tipoDeCarga, String patente, String marca, String modelo, int año, int kilometraje, int precioAlquiler, String estado)
    {

        super(patente, marca, modelo, año, kilometraje,precioAlquiler,estado);
        this.tipoDeCarga = tipoDeCarga;
    }


}
