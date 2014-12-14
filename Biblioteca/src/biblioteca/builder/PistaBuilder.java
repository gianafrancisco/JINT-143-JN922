package biblioteca.builder;

import biblioteca.cats.Categoria;
import biblioteca.items.Pista;

/**
 * Created by francisco on 15/11/14.
 */
public class PistaBuilder {
    public static Pista getPistaFromString(String categoria){
        Pista cat=null;
        String str[] = categoria.split(",");
        if(str.length == 2)
            return new Pista(str[1]);
        else
            return null;
    }
}
