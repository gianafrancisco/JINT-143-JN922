package biblioteca.items;

import biblioteca.enums.TipoDisco;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pelicula extends Disco {

    public int duracion;
    private Date fechaEstreno;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFechaEstreno() {
        return new SimpleDateFormat("yyyy/MM/dd").format(fechaEstreno);
    }

    public void setFechaEstreno(String fechaEstreno) throws ParseException {
        this.fechaEstreno = DateFormat.getDateInstance(DateFormat.SHORT).parse(fechaEstreno);
    }

    @Override
    public boolean buscar(String buscar) {
        //TODO Agregar fecha de lanzamiento en la funcion buscar
        return getTitulo().toLowerCase().contains(buscar) | getFechaEstreno().toLowerCase().contains(buscar);
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
        return " { titulo="+super.getTitulo()+", duracion="+duracion+", fechaEstreno="+getFechaEstreno()+" } ";
    }

    @Override
    public String exportar() {
        return "PELICULA,"+getTitulo()+","+duracion+","+getFechaEstreno()+","+getTipoDisco()+System.getProperty("line.separator");
    }

}