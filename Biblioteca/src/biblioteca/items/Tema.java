package biblioteca.items;

public class Tema {

    private String nombre;

    private int duracion;

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public Tema(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
}