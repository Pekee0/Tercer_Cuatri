package Clases;


import java.util.UUID;

public class CuentaBank {

   private UUID id;

    private  double balance;

    private String nombreDueño;

    private ClienteBank usuario;

    public CuentaBank(double balance,ClienteBank usuario, String nombreDueño)
    {
        this.usuario= usuario;
        this.balance = balance;
        id = usuario.getId();
       this.nombreDueño = usuario.getNombre();

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public ClienteBank getUsuario() {
        return usuario;
    }

    public void setUsuario(ClienteBank usuario) {
        this.usuario = usuario;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public double extraer(double cantidad)
    {
        if(balance > cantidad)
        {
            balance = balance - cantidad;
        }
        else
        {
            System.out.println("Saldo insuficiente perrito.");
        }

        return balance;
    }

    public double depositar (double cantidad)
    {
        balance = balance + cantidad;

        return balance;
    }

    public void mostrarSaldo()
    {
        System.out.println("Su saldo actual" + balance);
    }


}


