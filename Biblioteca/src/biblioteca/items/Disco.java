package biblioteca.items;

import biblioteca.enums.TipoDisco;

public abstract class Disco extends Item {

    private TipoDisco tipo;

    public Disco(String titulo,TipoDisco tipo) {
        super(titulo);
        this.tipo=tipo;
    }

    public String getTipoDisco(){
        switch (tipo){
            case DVD:
                return "DVD";
            case CD:
                return "CD";
            case BLURAY:
                return "BLURAY";
            case VINILO:
                return "VINILO";
            default:
                return "Unknow";
        }
    }

}