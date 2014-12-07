package biblioteca.menu;

/**
 * Write a description of class MenuItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class MenuItem2 extends MenuItem
{
    private CodigoItem codigo;
    
    public MenuItem2(int id, String text,CodigoItem codigo){
        super(id,text);
        this.codigo=codigo;
    }
    
    public boolean show(){
        return codigo.run();
    }
    
    
}

