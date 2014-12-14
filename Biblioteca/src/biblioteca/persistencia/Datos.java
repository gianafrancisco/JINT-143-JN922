/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.persistencia;

import biblioteca.cats.Categoria;
import biblioteca.list.ListaCategoria;
import biblioteca.list.ListaItem;
import biblioteca.list.ListaCapitulos;
import biblioteca.list.ListaPistas;
import java.io.Serializable;

public class Datos implements Serializable {

    private ListaCategoria mCategorias;
    private ListaItem mItems;
//    private ListaCapitulos mCapitulos;
//    private ListaPistas mPistas;
//
//    public ListaPistas getPistas() {
//        return mPistas;
//    }
    
    protected Datos() {
        mCategorias = new ListaCategoria();
        Categoria categoria = new Categoria("Default");
        mCategorias.add(categoria);
        mItems = new ListaItem();
//        mCapitulos = new ListaCapitulos();
//        mPistas = new ListaPistas();
    }

    public ListaCategoria getCategorias() {
        return mCategorias;
    }

    public ListaItem getItems() {
        return mItems;
    }
//    
//    public ListaCapitulos getCapitulos() {
//        return mCapitulos;
//    }
}
