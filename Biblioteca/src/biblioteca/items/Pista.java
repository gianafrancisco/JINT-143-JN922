package biblioteca.items;

import biblioteca.interfaces.Exportable;
import java.io.Serializable;

public class Pista implements Serializable, Exportable {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Pista(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            String buscar = (String) obj;
            return nombre.toLowerCase().contains(buscar.toLowerCase());
        } else {
            return super.equals(obj);
        }
    }

    @Override
    public String exportar() {
        return "PISTA," + nombre + System.getProperty("line.separator");
    }

}
