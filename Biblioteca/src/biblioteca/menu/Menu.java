package biblioteca.menu;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Menu
{
    private ArrayList<MenuItem> items;
    
    public Menu(){
        items = new ArrayList<MenuItem>();
    }
    
    public boolean addItem(MenuItem item){
        if(item != null){
            items.add(item);
            return true;
        }
        return false;
    }
    public void showMenu(){
        int i;
        int op;
        for(i=0;i<items.size();i++){
            System.out.println(items.get(i).toString());
        }
        System.out.println("Ingrese la su opcion: ");
        op=Consola.readInt();
        for(i=0;i<items.size() && items.get(i).getId() != op;i++);
        if(i==items.size()){
            System.out.println("La opcion ingresada no existe.");
            pause();
            this.showMenu();
        }else{
            if(items.get(i).show())
                this.showMenu();
        }
        
    }
    private void pause(){
        System.out.println("Presione cualquie tecla para continuar....");
        Consola.readLine();
    }
}
