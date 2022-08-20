/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;
import logica.ManipulaSerie;

/**
 *
 * @author Sebastian Burgos
 */
public class LeerManipulaPro {
    private ObjectInputStream lectura;
    private String nombreArchivo;
    
    public LeerManipulaPro(){
        nombreArchivo = "datosSeries.bin";
    }
    
    public LeerManipulaPro(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    public boolean abrirArchivo(){
        try{
            File archivo = new File(nombreArchivo);
            if(archivo.exists()){
                lectura = new ObjectInputStream(new FileInputStream(nombreArchivo));
                return true;
            }
        }
        catch(IOException e){
            System.err.println("Error... no se hay contacto con el archivo");
        }
        
        return false;
    }
    
    public ManipulaSerie leerArchivo(){
        ManipulaSerie manipulador = new ManipulaSerie();
        
        try{
            //se tiene en cuenta que solo se está guardando un objeto.
            manipulador = (ManipulaSerie) lectura.readObject();            
        }
        catch(EOFException excepcion){
            //Solamente indica que se llegó al final del archivo.
        }
        catch(ClassNotFoundException excepcion){
            System.err.println("ERROR... No se localizo la clase: " + excepcion.getMessage());
        }
        catch(IOException e){
            System.err.println("ERROR... No se logro leer el archivo.");
        }
        finally{
            return manipulador;
        }
    }
    
    public void cerrarArchivo(){
        try {
            if(lectura != null){
                lectura.close();
            }
        } catch (IOException excepcion) {
            System.err.println("ERROR... No se logro cerrar el archivo");
        }
    }
}
