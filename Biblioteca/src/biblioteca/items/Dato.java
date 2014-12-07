package biblioteca.items;

import biblioteca.enums.TipoDisco;

public class Dato extends Disco {
    // TODO Agregar lista de archivos
    public Dato(String titulo) {
        this(titulo,TipoDisco.DVD);
    }
    public Dato(String titulo, TipoDisco tipo){
      super(titulo, tipo);
    }
    @Override
    public String exportar() {
        return null;
    }

    @Override
    public boolean buscar(String buscar) {
        return getTitulo().contains(buscar);
    }
}