/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.persistencia;

import biblioteca.builder.CategoriaBuilder;
import biblioteca.builder.ItemBuilder;
import biblioteca.cats.Categoria;
import biblioteca.cats.ListaCategoria;
import biblioteca.cats.ListaItem;
import biblioteca.items.Item;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author francisco
 */
public class Importar {

    ListaCategoria mCategorias;
    ListaItem mItems;
    String filename;

    public Importar(String filename) {
        this.mCategorias = Archivo.getDatos().getCategorias();
        this.mItems = Archivo.getDatos().getItems();
        this.filename = filename;
        importar();
    }

    private void importar() {
        String line = null;
        File fi = new File(filename);
        FileReader fr = null;
        BufferedReader fbr = null;
        String newline = System.getProperty("line.separator");
        Item item = null;
        try {
            fr = new FileReader(fi);
            fbr = new BufferedReader(fr);
            line = fbr.readLine();
            while (line != null) {
                if (line.contains("CATEGORIA")) {
                    Categoria c = CategoriaBuilder.getCategoriaFromString(line);
                    if (!mCategorias.contains(c)) {
                        mCategorias.add(c);
                    } else {
                        c = mCategorias.get(mCategorias.indexOf(c));
                    }
                    item.agregarCategoria(c);
                } else if (line.contains("LIBRO")) {
                    item = ItemBuilder.getLibroFromString(line);
                } else if (line.contains("REVISTA")) {
                    item = ItemBuilder.getRevistaFromString(line);
                } else if (line.contains("PELICULA")) {
                    item = ItemBuilder.getPeliculaFromString(line);
                } else if (line.contains("AUDIO")) {
                    item = ItemBuilder.getAudioFromString(line);
                }
                if (item != null && !line.contains("CATEGORIA")) {
                    mItems.add(item);
                }
                line = fbr.readLine();
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                fr.close();
                fbr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
