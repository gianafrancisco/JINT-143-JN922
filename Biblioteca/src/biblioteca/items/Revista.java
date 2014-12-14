package biblioteca.items;

public class Revista extends Item {

    private String editorial;
    private int ano;
    private int numero;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Revista(String editorial, int ano, int numero, String titulo) {
        super(titulo);
        this.editorial = editorial;
        this.ano = ano;
        this.numero = numero;
    }

    public void agregar(Seccion seccion) {
        //TODO completar metodo para agregar las secciones
    }

    @Override
    public boolean buscar(String bus) {
        String buscar = bus.toLowerCase();
        return editorial.toLowerCase().contains(buscar) | getTitulo().toLowerCase().contains(buscar) | Integer.toString(ano).toLowerCase().contains(buscar) | Integer.toString(numero).toLowerCase().contains(buscar);
    }

    public String toString() {
        return " { titulo=" + super.getTitulo() + ", editorial=" + editorial + " } ";
    }

    @Override
    public String exportar() {
        return "REVISTA," + getTitulo() + "," + ano + "," + numero + "," + editorial + System.getProperty("line.separator");
    }
}
