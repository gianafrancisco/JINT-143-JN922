package biblioteca.items;

import biblioteca.cats.Categoria;
import biblioteca.list.ListaCategoria;
import biblioteca.interfaces.Exportable;
import java.io.Serializable;

public abstract class Item implements Serializable, Exportable {

    private String titulo;
    private ListaCategoria lc;

    //TODO Ver si se puede implementar alguna redefinicion de metodos como equals en las clases heredadas
    public abstract boolean buscar(String buscar);

    protected Item(String titulo) {
        this.titulo = titulo;
        lc = new ListaCategoria();
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return " { titulo=" + titulo + " } ";
    }

    public boolean agregarCategoria(Categoria categoria) {
        lc.add(categoria);
        categoria.add(this);
        return true;
    }

    public boolean borrarCategoria(Categoria categoria) {
        lc.remove(categoria);
        categoria.remove(this);
        return true;
    }
    
    protected String exportarCategorias() {
        String strExportar = "";
        for (Categoria c : lc) {
            strExportar += "," + c;
        }
        return strExportar;
    }

    public ListaCategoria getCategorias() {
        ListaCategoria lcc = new ListaCategoria();
        for(Categoria l: lc){
            lcc.add(l);
            
        }
        return lcc;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
