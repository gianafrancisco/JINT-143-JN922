package biblioteca.items;

import biblioteca.enums.TipoDisco;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Pelicula extends Disco {

    public int duracion;

    private Date fechaEstreno;
    //TODO Definir lista de actores

    @Override
    public boolean buscar(String buscar) {
        //TODO Agregar fecha de lanzamiento en la funcion buscar
        return getTitulo().contains(buscar);
    }
    //TODO Ver la exception generada por el metodo parse()
    public Pelicula(String titulo,int duracion,String fechaEstreno,TipoDisco tipo) throws ParseException {
        super(titulo, tipo);
        this.duracion=duracion;
        this.fechaEstreno = DateFormat.getDateInstance(DateFormat.SHORT).parse(fechaEstreno);
    }
    public Pelicula(String titulo,int duracion,String fechaEstreno) throws ParseException{
        this(titulo,duracion,fechaEstreno,TipoDisco.DVD);
    }
    public String toString(){
        return " { titulo="+super.getTitulo()+", duracion="+duracion+", fechaEstreno="+fechaEstreno.toString()+" } ";
    }

    @Override
    public String exportar() {
        return "PELICULA,"+getTitulo()+","+duracion+","+fechaEstreno+","+getTipoDisco();
    }

}