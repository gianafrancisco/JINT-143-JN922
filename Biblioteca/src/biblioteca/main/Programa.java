package biblioteca.main;

import biblioteca.items.Item;
import biblioteca.items.Libro;
import biblioteca.items.Audio;
import biblioteca.items.Capitulo;
import biblioteca.items.Revista;
import biblioteca.items.Pelicula;
import biblioteca.cats.Categoria;
import biblioteca.list.ListaCategoria;
import biblioteca.list.ListaItem;

import java.text.ParseException;

/**
 * Created by francisco on 01/11/14.
 */
public class Programa {
    public static void main (String[] argv) throws ParseException {

        ListaCategoria lc = new ListaCategoria();

        ListaItem items = new ListaItem();

        Categoria catDefault = new Categoria("Default");
        Categoria catAudio = new Categoria("Audio");


        Item l = new Libro("Codigo Davinci","Dan Brown","AAA");
        Capitulo c=new Capitulo("Dia 1");
        ((Libro)l).agregarCapitulo(c);
        l.agregarCategoria(catDefault);
        //items.add(l);
        l = new Libro("Angeles y demonios","Dan Brown","AAA");
        l.agregarCategoria(catDefault);
        //items.add(l);
        l = new Libro("El Secreto","Dan Brown","AAA");
        l.agregarCategoria(catDefault);
        //items.add(l);
        l = new Libro("Infierno","Dan Brown","AAA");
        l.agregarCategoria(catDefault);
        //items.add(l);
        l = new Revista("Caza y pesca",2014,1,"EZ");
        l.agregarCategoria(catDefault);
        //items.add(l);
        l = new Revista("Animal Planet",2013,2,"Discovery Magazzine");
        l.agregarCategoria(catDefault);
        //items.add(l);
        l= new Audio("El Sensei","Las pastillas del abuelo","Perro Records","01/09/2010");
        l.agregarCategoria(catDefault);
        l.agregarCategoria(catAudio);
        //items.add(l);
        l= new Audio("Mala musica","No te va gustar","Perro Records","01/09/2012");
        l.agregarCategoria(catDefault);
        l.agregarCategoria(catAudio);
        //items.add(l);
        l=new Pelicula("Encantada",120,"01/09/2012");
        l.agregarCategoria(catDefault);
        //items.add(l);
        System.out.println("Categoria Default");
        for (Item e: catDefault){
            System.out.println(e);
        }
        System.out.println("Categoria Audio");
        for (Item e: catAudio){
            System.out.println(e);
        }

        System.out.println("Filtro Dan Brown");

        ListaItem lli=catDefault.filtrar("DAN BROWN");

        for (Item e: lli){
            System.out.println(e);
        }

        System.out.println("Filtro Dia 1");

        lli=catDefault.filtrar("dia 1");

        for (Item e: lli){
            System.out.println(e);
        }



        System.out.println("Filtro Perror Records");

        lli=catDefault.filtrar("Perro Records");

        for (Item e: lli){
            System.out.println(e);
        }


    }
}
