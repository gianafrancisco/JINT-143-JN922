package biblioteca.items;

public class Revista extends Item {

    private String editorial;

    private String notaAutor;

    public Revista(String titulo,String editorial) {
        super(titulo);
        this.editorial = editorial;
        this.notaAutor="";
    }

    public String getNotaAutor(){
        return this.notaAutor;
    }
    public void setNotaAutor(String notaAutor){
        this.notaAutor=notaAutor;
    }

    public void agregar( Seccion seccion) {

    }

    @Override
    public boolean buscar(String buscar) {
        return editorial.contains(buscar) |notaAutor.contains(buscar) | getTitulo().contains(buscar);
    }

    public String toString(){
        return " { titulo="+super.getTitulo()+", editorial="+editorial+" } ";
    }

    @Override
    public String exportar() {
        return "REVISTA,"+getTitulo()+","+editorial+","+notaAutor;
    }
}