package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import modelo.Dashboard;

public class ArchivoInfo implements Serializable {

    ObjectInputStream ois;
    File archivo;
    ObjectOutputStream oos;
    Dashboard estructura = null;

    //InputStream = Entrada de datos
    //OutputStream = Salida de datos
    public void guardarArchivoInfo(Dashboard estructura, String nombreArchivo) {

        archivo = new File(nombreArchivo);
        try {
            oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(estructura);
            oos.close();
        } catch (IOException e) {
        }

    }

    public Dashboard leerArchivoInfo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        try {
            ois = new ObjectInputStream(new FileInputStream(archivo));
            estructura = (Dashboard) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return estructura;

    }

}
