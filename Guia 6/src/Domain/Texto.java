package Domain;

public abstract class Texto {
    private int codigo;
    private String titulo;
    private String añoDePublicaciones;

    public Texto(int codigo, String titulo, String añoDePublicaciones) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoDePublicaciones = añoDePublicaciones;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoDePublicaciones='" + añoDePublicaciones + '\'' +
                '}';
    }
}
