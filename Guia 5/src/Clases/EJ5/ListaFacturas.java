package Clases.EJ5;

import java.util.ArrayList;

public class ListaFacturas {
    private ArrayList<Factura> facturas;

    public ListaFacturas() {
        facturas = new ArrayList<Factura>();
    }

    public void agregar(Factura factura) {
        facturas.add(factura);
    }

    public String mostrarFacturas() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < facturas.size(); i++) {
            sb.append(facturas.get(i).toString()+"\n");
        }
        return sb.toString();
    }
}
