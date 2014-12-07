package biblioteca.main;

import biblioteca.cats.Categoria;
import biblioteca.cats.ListaCategoria;

import java.io.Console;
import java.text.ParseException;

/**
 * Created by francisco on 01/11/14.
 */
public class ProgramaMenuCli {
    public static void main (String[] argv) throws ParseException {

        Biblioteca b = new Biblioteca();
        b.showMenu();

    }
}
