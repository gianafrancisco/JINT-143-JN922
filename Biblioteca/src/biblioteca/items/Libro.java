package biblioteca.items;

import biblioteca.cats.Categoria;

import java.util.LinkedList;

public class Libro extends Item {

    private LinkedList<Capitulo> capitulos;

    private String editorial;

    private String prologo;

    private String autor;

    public void agregarCapitulo( Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public boolean buscar( String buscar) {
        String buscarLower=buscar.toLowerCase();
        boolean res=editorial.toLowerCase().contains(buscarLower) | prologo.toLowerCase().contains(buscarLower) | autor.toLowerCase().contains(buscarLower) | getTitulo().toLowerCase().contains(buscarLower);
        for(Capitulo c: capitulos){
            res|=c.equals(buscar);
        }
        return res;
    }

    public Libro(String titulo, String autor, String editorial) {
        super(titulo);
        this.autor = autor;
        this.editorial = editorial;
        this.prologo="";
        this.capitulos= new LinkedList<Capitulo>();
    }

    public String getPrologo() {
        return prologo;
    }

    public void setPrologo(String prologo) {
        this.prologo = prologo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LinkedList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public String toString(){
        return " { titulo="+super.getTitulo()+", autor="+autor+", editorial="+editorial+" } ";
    }

    @Override
    public String exportar() {
        String strExportar="";
        return "LIBRO,"+getTitulo()+","+autor+","+editorial+","+prologo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}