/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.persistencia;

import biblioteca.cats.Categoria;
import biblioteca.list.ListaCategoria;
import biblioteca.items.Item;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author francisco
 */
public class Exportar {

    ListaCategoria mCategorias;
    String filename;

    public Exportar(String filename) {
        this.mCategorias = Archivo.getDatos().getCategorias();
        this.filename = filename;
        exportar();
    }

    private void exportar() {

        File fo = new File(filename);
        FileWriter fw = null;
        PrintWriter out = null;
        String newline = System.getProperty("line.separator");
        try {
            fw = new FileWriter(fo);
            out = new PrintWriter(new BufferedWriter(fw));
            for (Item i : Archivo.getDatos().getItems()) {
                fw.write(i.exportar());
                for (Categoria c : i.getCategorias()) {
                    fw.write(c.exportar() + newline);
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                fw.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
