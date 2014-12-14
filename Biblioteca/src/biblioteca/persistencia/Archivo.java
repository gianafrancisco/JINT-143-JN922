package biblioteca.persistencia;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Archivo {

    private static Datos mDatos = null;

    public static Datos getDatos() {
        if (mDatos == null) {
            cargar();
        }
        return mDatos;
    }

    public static void cargar() {
        File f = new File("data/biblioteca.dat");
        if (f.exists()) {
            try {
                FileInputStream fi = new FileInputStream(f);
                ObjectInputStream oi = new ObjectInputStream(fi);
                mDatos = (Datos) oi.readObject();
                oi.close();
                fi.close();
            } catch (IOException iOException) {
                //f.delete();
                importar();
                //iOException.printStackTrace();
                //System.exit(1);
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
                System.exit(2);
            }
        } else {
            mDatos = new Datos();
        }
    }

    public static void guardar() {
        File f = new File("data/biblioteca.dat");

        try {
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(mDatos);
            oo.close();
            fo.close();
        } catch (IOException iOException) {
            System.out.println("No se pudo Guardar...");
        }

    }

    private static void importar() {

        int n = JOptionPane.showConfirmDialog(null, "Se encontro una incompatibilidad con la version de la base de datos"
                + "\nQuiere importar un backup de su base de datos?", "", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            JFileChooser filechooser = new JFileChooser();
            int returnVal = filechooser.showOpenDialog(null);
            File file = filechooser.getSelectedFile();
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                mDatos = new Datos();
                new Importar(file.getAbsoluteFile().toString());
                Archivo.guardar();
            }
        } else {
            mDatos = new Datos();
            Archivo.guardar();
        }
    }

}
