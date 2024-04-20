package Domain.EJ2;

public class Alumno extends Persona {

    private int añoDeIngreso;
    private double cuotaMensual;
    private String carrera;

    public Alumno()
    {

    }

    public Alumno(String dni, String nombre, String apellido, String mail, String direccion,int añoDeIngreso, double cuotaMensual, String carrera)
    {
        super();
        this.añoDeIngreso = añoDeIngreso;
        this.carrera = carrera;
        this.cuotaMensual = cuotaMensual;
    }


    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +"Alumno{" +
                "añoDeIngreso=" + añoDeIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
