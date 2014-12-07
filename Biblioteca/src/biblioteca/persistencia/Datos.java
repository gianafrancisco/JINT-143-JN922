/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.persistencia;

import biblioteca.cats.Categoria;
import biblioteca.cats.ListaCategoria;
import biblioteca.cats.ListaItem;
import java.io.Serializable;

public class Datos implements Serializable {

    private ListaCategoria mCategorias;
    private ListaItem mItems;

    protected Datos() {
        mCategorias = new ListaCategoria();
        Categoria categoria = new Categoria("Default");
        mCategorias.add(categoria);
        mItems = new ListaItem();
    }

    public ListaCategoria getCategorias() {
        return mCategorias;
    }

    public ListaItem getItems() {
        return mItems;
    }

}
