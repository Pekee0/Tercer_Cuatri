import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Arbolito {
    TreeSet<Evento> set = new TreeSet<>();

    public Arbolito() {

    }

    public String mostrarOrdenado() {
        StringBuilder sb = new StringBuilder();
        List<Evento> list = new ArrayList<>(set);
        return sb.toString();
    }
}
