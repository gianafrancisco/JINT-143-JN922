package ui;

import biblioteca.persistencia.Archivo;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ui.forms.MainWindows;

public class Programa {

    public static void main(String[] args) {

        Archivo.cargar();

        try {            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }

        MainWindows form = new MainWindows();
        form.setVisible(true);


    }
}
