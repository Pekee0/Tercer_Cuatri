package Clases;

import java.time.LocalDate;
import java.util.UUID;
public class Factura {

    private UUID id;
    private  double total;
    private LocalDate fecha; /// se usa el momento de creacion del objeto
    private Cliente cliente;

    public Factura (double total, Cliente cl1)
    {
        this.cliente = cl1;
        fecha = LocalDate.of(2024,4,5);
        id = cl1.getId();
        this.total = aplicarDescuento(total,cl1.getDescuento());


    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public double  aplicarDescuento(double total, double descuento)
    {
        descuento = (descuento /100);

        total = total * descuento;

        return  total;
    }

    @Override
    public String   toString() {
        return "Factura{" +
                "id=" + id +
                ", total=" + total +
                ", fecha=" + fecha +
                '}';
    }
}
