package biblioteca.items;

public class Capitulo {

    private String nombre;

    public Capitulo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof String){
            String buscar = (String)obj;
            return nombre.toLowerCase().contains(buscar.toLowerCase());
        }else {
            return super.equals(obj);
        }
    }

    public String toString(){
        return " { nombre="+nombre+" } ";
    }
}