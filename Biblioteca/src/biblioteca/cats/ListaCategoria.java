package biblioteca.cats;

import java.io.Serializable;
import java.util.LinkedList;

public class ListaCategoria extends LinkedList<Categoria> implements Serializable {

        public ListaCategoria filtrar(String filtro){
        ListaCategoria llc=new ListaCategoria();
        for (Categoria i: this){
            if(i.equals(filtro)){
                llc.add(i);
            }
        }
        return llc;
    }
    
}