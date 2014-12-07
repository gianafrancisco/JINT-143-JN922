package biblioteca.items;

import biblioteca.enums.TipoDisco;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Audio extends Disco {

    private String interprete;

    private String discografica;
    private Date fechaLanzamiento;
    // TODO Agregar listado de temas del album

    //TODO Ver la exception generada por el metodo parse()
    public Audio(String titulo,String interprete,String discografica,String fechaLanzamiento) throws ParseException {
        this(titulo,interprete,discografica,fechaLanzamiento, TipoDisco.CD);
    }
    public Audio(String titulo,String interprete,String discografica,String fechaLanzamiento,TipoDisco tipo) throws ParseException {
        super(titulo, tipo);
        this.interprete=interprete;
        this.discografica=discografica;
        this.fechaLanzamiento = DateFormat.getDateInstance(DateFormat.SHORT).parse(fechaLanzamiento);
    }
    public void agregar( Tema tema) {
        //TODO Ver accion a realizar cuando agregamos un nuevo item.
    }

    public String getInterprete() {
        return interprete;
    }

    public String getDiscografica() {
        return discografica;
    }

    @Override
    public boolean buscar(String buscar) {
        //TODO Agregar fecha de lanzamiento en la funcion buscar
        return interprete.contains(buscar) |discografica.contains(buscar) | getTitulo().contains(buscar);
    }

    public String toString(){
        return " { titulo="+super.getTitulo()+", interprete="+interprete+", discografica="+discografica+", fechaLanzamiento="+fechaLanzamiento.toString()+" } ";
    }

    @Override
    public String exportar() {
        return "AUDIO,"+getTitulo()+","+interprete+","+discografica+","+fechaLanzamiento+","+getTipoDisco();
    }

}