package ui.models;


import biblioteca.list.ListaPistas;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class ListaModeloPistas implements ListModel {

    ListaPistas lista = null;

    public ListaModeloPistas(ListaPistas lista) {
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
