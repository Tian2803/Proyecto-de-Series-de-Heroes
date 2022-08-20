/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import logica.Heroe;
/**
 *
 * @author USUARIO
 */
public class LeerArchivoHeroe {
    private ObjectInputStream lectura;
    private String nombreArchivo;
    
    public LeerArchivoHeroe(){
        nombreArchivo = "heroes.bin";
    }
    
    public LeerArchivoHeroe(String nombreArchivo){
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
            System.err.println("Hubo un error estableciendo contacto con el archivo heroes");
        }
        
        return false;
    }
    
    public ArrayList<Heroe> leerArchivo(){
        ArrayList<Heroe> listHeroes = null;        
        try{
            listHeroes = (ArrayList<Heroe>) lectura.readObject(); 
        }
        catch(EOFException e){            
        }
        catch(ClassNotFoundException e){
            System.err.println("No se pudo localizar la clase: " + e.getMessage());
        }
        catch(IOException e){
            System.err.println("Hubo un error al leer el archivo heroes");
        }
        finally{
            return listHeroes;
        }
    }
    
    public void cerrarArchivo(){
        try {
            if(lectura != null){
                lectura.close();
            }
        } catch (IOException e) {
            System.err.println("Hubo un error cerrando el archivo");
        }
    }
}