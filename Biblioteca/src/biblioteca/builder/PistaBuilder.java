package biblioteca.builder;

import biblioteca.cats.Categoria;

/**
 * Created by francisco on 15/11/14.
 */
public class CategoriaBuilder {
    public static Categoria getCategoriaFromString(String categoria){
        Categoria cat=null;
        String str[] = categoria.split(",");
        if(str.length == 2)
            return new Categoria(str[1]);
        else
            return null;
    }
}
