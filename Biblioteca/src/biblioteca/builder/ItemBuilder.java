package biblioteca.builder;

import biblioteca.items.Libro;
import biblioteca.items.Audio;
import biblioteca.items.Revista;
import biblioteca.items.Pelicula;

import java.text.ParseException;

/**
 * Created by francisco on 15/11/14.
 */
public class ItemBuilder {
    public static Libro getLibroFromString(String line){
        String s[] = line.split(",");
        Libro l= new Libro(s[1],s[2],s[3]);
        return l;
    }
    public static Revista getRevistaFromString(String line){
        Revista r=null;
        String s[] = line.split(",");
        r=new Revista(s[4], new Integer(s[2]),new Integer(s[3]), s[1]);
        return r;
    }

    public static Pelicula getPeliculaFromString(String line) {
        Pelicula p=null;
        String s[] = line.split(",");
        try {
            p=new Pelicula(s[1],Integer.parseInt(s[2]),s[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return p;
    }

    public static Audio getAudioFromString(String line) {
        Audio a=null;
        String s[] = line.split(",");
        try {
            a=new Audio(s[1],s[2],s[3],s[4]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return a;

    }
}
