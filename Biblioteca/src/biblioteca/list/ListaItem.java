package biblioteca.list;

import biblioteca.items.Item;
import java.io.Serializable;
import java.util.LinkedList;

public class ListaItem extends LinkedList<Item> implements Serializable {

    public ListaItem filtrar(String filtro){
        ListaItem lli=new ListaItem();
        for (Item i: this){
            if(i.buscar(filtro)){
                lli.add(i);
            }
        }
        return lli;
    }

}