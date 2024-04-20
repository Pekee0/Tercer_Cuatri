package Domain.EJ2;

public class Staff extends Persona {

    private double sueldo;

    private char turno; // M (mañana) / N (noche)


    public Staff()
    {

    }

    public Staff(String dni, String nombre, String apellido, String mail, String direccion,double sueldo, char turno)
    {
        super();
        this.sueldo = sueldo;
        this.turno = turno;
    }



    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }


    public double calcularSueldoMensual(double sueldo)
    {
        return sueldo * 12;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sueldo=" + sueldo +
                ", turno=" + turno +
                '}';
    }
}
