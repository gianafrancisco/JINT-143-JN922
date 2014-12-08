package biblioteca.cats;

import java.io.Serializable;
import java.util.ArrayList;

public class Categoria extends ListaItem implements Serializable {

    private String nombre;
    //ListaItem items;

    /*
    public Categoria(String nombre,ListaItem items) {
        this.items = items;
        this.nombre = nombre;
    }
    */
    public Categoria(String nombre){
        this.nombre=nombre;
    }
    public String toString(){
        return nombre;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof String){
            return nombre.toLowerCase().contains(((String) o).toLowerCase());
        }else if(o instanceof Categoria){
            return nombre.toLowerCase().contains(((Categoria) o).nombre.toLowerCase());
        }else
            return super.equals(o);
    }
    public String exportar(){
        return "CATEGORIA,"+nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}