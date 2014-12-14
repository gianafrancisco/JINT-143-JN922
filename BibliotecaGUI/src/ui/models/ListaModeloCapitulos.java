package ui.models;

import biblioteca.cats.Categoria;
import biblioteca.list.ListaCapitulos;
import biblioteca.items.Capitulo;
import biblioteca.persistencia.Archivo;
import java.util.LinkedList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class ListaModeloCapitulos implements ListModel {

    ListaCapitulos lista = null;

    public ListaModeloCapitulos(ListaCapitulos lista) {
        this.lista = lista;
    }
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

}
