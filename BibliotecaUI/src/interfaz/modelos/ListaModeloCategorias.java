package interfaz.modelos;

import biblioteca.cats.Categoria;
import biblioteca.persistencia.Archivo;
import java.util.LinkedList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class ListaModeloCategorias implements ListModel {

    LinkedList<Categoria> lista = Archivo.getDatos().getCategorias();

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
