/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import biblioteca.persistencia.Archivo;
import interfaz.gui.FrmPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Philip
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Archivo.cargar();

        try {
            // Set cross-platform Java L&F (also called "Metal")
            
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

        FrmPrincipal form = new FrmPrincipal();
        form.setVisible(true);


    }
}
