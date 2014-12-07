package biblioteca.persistencia;

import java.io.*;

public class Archivo
{
    private static Datos mDatos = null;

    public static Datos getDatos()
    {
        if (mDatos == null)
            cargar();
        return mDatos;
    }

    public static void cargar()
    {
        File f = new File("Biblioteca.jdb");
        if (f.exists())
        {
            try
            {
                FileInputStream fi = new FileInputStream(f);
                ObjectInputStream oi = new ObjectInputStream(fi);
                mDatos = (Datos) oi.readObject();
                oi.close();
                fi.close();
            }
            catch (IOException iOException)
            {
                iOException.printStackTrace();
                System.exit(1);
            }
            catch (ClassNotFoundException classNotFoundException)
            {
                classNotFoundException.printStackTrace();
                System.exit(2);
            }
        }
        else
            mDatos = new Datos();
    }

    public static void guardar()
    {
        File f = new File("Biblioteca.jdb");

        try
        {
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(mDatos);
            oo.close();
            fo.close();
        }
        catch (IOException iOException)
        {
            System.out.println("No se pudo Guardar...");
        }

    }

}
