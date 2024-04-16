package domain;

import java.util.ArrayList;

public class ListaElectrodomesticos {
    private ArrayList<Electrodomestico> electrodomesticos;

    public ListaElectrodomesticos() {
        electrodomesticos = new ArrayList<Electrodomestico>();
    }

    public void agregar(Electrodomestico electrodomestico) {
        electrodomesticos.add(electrodomestico);
    }

    public double devolverSumaPrecioElectrodomesticos() {
        double sumaTotal = 0;
        for(int i = 0; i < electrodomesticos.size(); i++) {
            sumaTotal += electrodomesticos.get(i).getPrecioBase();
        }
        return sumaTotal;
    }

    public String mostrarClasesLavadoras() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < electrodomesticos.size(); i++) {
            if(electrodomesticos.get(i) instanceof Lavadora) {
                sb.append(electrodomesticos.get(i).toString());
            }
        }
        return sb.toString();
    }

    public String mostrarClasesTelevisores() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < electrodomesticos.size(); i++) {
            if(electrodomesticos.get(i) instanceof Television) {
                sb.append(electrodomesticos.get(i).toString());
            }
        }
        return sb.toString();
    }

    public String mostrarTodo() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < electrodomesticos.size(); i++) {
            sb.append(electrodomesticos.get(i).toString());
        }
        return sb.toString();
    }
}
