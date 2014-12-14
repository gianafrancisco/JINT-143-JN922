package biblioteca.items;

import biblioteca.list.ListaCapitulos;

public class Libro extends Item {

    private ListaCapitulos capitulos;
    private String editorial;
    private String autor;

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public boolean buscar(String buscar) {
        String buscarLower = buscar.toLowerCase();
        boolean res = editorial.toLowerCase().contains(buscarLower) |  autor.toLowerCase().contains(buscarLower) | getTitulo().toLowerCase().contains(buscarLower);
        for (Capitulo c : capitulos) {
            res |= c.equals(buscar);
        }
        return res;
    }

    public Libro(String titulo, String autor, String editorial) {
        super(titulo);
        this.autor = autor;
        this.editorial = editorial;
        this.capitulos = new ListaCapitulos();
    }
    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public ListaCapitulos getCapitulos() {
        return capitulos;
    }

    public String toString() {
        return " { titulo=" + super.getTitulo() + ", autor=" + autor + ", editorial=" + editorial + " } ";
    }

    public void borrarCapitulo(Capitulo capitulo) {
        capitulos.remove(capitulo);
    }

    @Override
    public String exportar() {
        String strExportar = "LIBRO," + getTitulo() + "," + autor + "," + editorial + System.getProperty("line.separator");
        for (Capitulo c : capitulos) {
            strExportar+=c.exportar();
        }
        return strExportar;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
