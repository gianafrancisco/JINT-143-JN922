package biblioteca.builder;

import biblioteca.items.Capitulo;


/**
 * Created by francisco on 15/11/14.
 */
public class CapituloBuilder {
    public static Capitulo getCapituloFromString(String capitulo){
        Capitulo cat=null;
        String str[] = capitulo.split(",");
        if(str.length == 2)
            return new Capitulo(str[1]);
        else
            return null;
    }
}
