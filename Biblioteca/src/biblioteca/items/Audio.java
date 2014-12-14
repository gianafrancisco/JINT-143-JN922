package biblioteca.items;

import biblioteca.list.ListaPistas;
import biblioteca.enums.TipoDisco;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audio extends Disco {

    private String interprete;
    private String discografica;
    private Date fechaLanzamiento;
    private ListaPistas pistas;

    public ListaPistas getPistas() {
        return pistas;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setPistas(ListaPistas pistas) {
        this.pistas = pistas;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) throws ParseException {
        this.fechaLanzamiento = DateFormat.getDateInstance(DateFormat.SHORT).parse(fechaLanzamiento);
    }

    //TODO Ver la exception generada por el metodo parse()
    public Audio(String titulo, String interprete, String discografica, String fechaLanzamiento) throws ParseException {
        this(titulo, interprete, discografica, fechaLanzamiento, TipoDisco.CD);
    }

    public Audio(String titulo, String interprete, String discografica, String fechaLanzamiento, TipoDisco tipo) throws ParseException {
        super(titulo, tipo);
        this.interprete = interprete;
        this.discografica = discografica;
        this.fechaLanzamiento = DateFormat.getDateInstance(DateFormat.SHORT).parse(fechaLanzamiento);
        this.pistas = new ListaPistas();
    }

    public void agregarPista(Pista pista) {
        //TODO Ver accion a realizar cuando agregamos un nuevo item.
        pistas.add(pista);
    }

    public void borrarPista(Pista pista) {
        pistas.remove(pista);
    }

    public String getInterprete() {
        return interprete;
    }

    public String getDiscografica() {
        return discografica;
    }

    @Override
    public boolean buscar(String bus) {
        //TODO Agregar fecha de lanzamiento en la funcion buscar
        String buscar = bus.toLowerCase();
        boolean res = interprete.toLowerCase().contains(buscar) | discografica.toLowerCase().contains(buscar) | getTitulo().toLowerCase().contains(buscar);
        for (Pista p : pistas) {
            res |= p.equals(buscar);
        }
        return res;
    }

    public String toString() {
        return " { titulo=" + super.getTitulo() + ", interprete=" + interprete + ", discografica=" + discografica + ", fechaLanzamiento=" + getFechaLanzamiento() + " } ";
    }

    @Override
    public String exportar() {
        String strExportar = "AUDIO," + getTitulo() + "," + interprete + "," + discografica + "," + getFechaLanzamiento() + "," + getTipoDisco() + System.getProperty("line.separator");
        for(Pista p: pistas){
            strExportar+=p.exportar();
        }
        return strExportar;
    }

    public String getFechaLanzamiento() {
        return new SimpleDateFormat("yyyy/MM/dd").format(fechaLanzamiento);
    }

}
