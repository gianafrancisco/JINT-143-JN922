package biblioteca.menu;

/**
 * Write a description of class MenuItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MenuItem
{
    private int id;
    private String text;
    
    public MenuItem(int id, String text){
        this.id = id;
        this.text=text;
    }
    
    public int getId(){
        return id;
    }
    
    public String toString(){
        return id+". "+text;
    }
    
    public abstract boolean show();
    
    
}
