package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Archivo implements Serializable{
    ObjectInputStream ois; 
    File archivo;
    ObjectOutputStream oos;    
    ArrayList estructura = null;

public void guardarArchivo(ArrayList estructura,String nombreArchivo){    
     archivo=new File(nombreArchivo);   
     
     //GUARDAR DATOS EN EL ARCHIVO
     try{
       oos=new ObjectOutputStream(new FileOutputStream(archivo));
       oos.writeObject(estructura);
       oos.close();
     }catch(IOException e){         
     }
}

public ArrayList leerArchivo(String nombreArchivo){
File archivo=new File(nombreArchivo);
 //EXTRAER DATOS DESDE EL ARCHIVO
     try{
        ois=new ObjectInputStream(new FileInputStream(archivo)); 
        estructura=(ArrayList)ois.readObject();        
         }catch(IOException | ClassNotFoundException e){             
         }    
     return estructura;
}    
}