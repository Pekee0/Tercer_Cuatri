package Clases.EJ4;

public class Cuenta {
    private int id;
    private String nombre;
    private  double balance;

    public int getId()
    {
        return id;
    }

        public String getNombre()
        {
            return nombre;
        }
        public double getBalance()
        {
            return balance;
        }
        public void setId(int id)
        {this.id=id;
        }
        public void setNombre(String nombre)
        {
            this.nombre=nombre;
        }
        public void setBalance(double balance)
        {
            this.balance=balance;
        }

        ///CONSTRUCTORES-->mayUSCULA

    public Cuenta(int id, String nombre, double balance){

        this.id= id;
        this.nombre=nombre;
        this.balance=balance;

    }

        public double credito(double ingreso)
        {
            balance= balance+ingreso;

           return balance;
        }

        public  double debito(double sustraccion)
        {
            if(sustraccion>balance)
            {
                System.out.println("El dinero en cuenta no es suficiente para realizar la operacion");
            } else
            {
                balance= balance-sustraccion;

            }
            return  balance;
        }

    @Override
    public String toString() {
        return "Clases.EJ4.Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}

