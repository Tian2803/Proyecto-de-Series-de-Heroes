/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Villano;

/**
 *
 * @author USUARIO
 */
public class EscribirArchivoVillanos {
    private ObjectOutputStream salida;
    private String nombreArchivo;
    
    public EscribirArchivoVillanos(){
        nombreArchivo = "villanos.bin";
    }
    
    public EscribirArchivoVillanos(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public void abrirArchivo(){
        try{
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al conectar con el archivo de villanos", "",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void escribirObjeto(ArrayList<Villano> listVillanos){
        try {
            salida.flush();
            salida.writeObject(listVillanos);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, ("No se pudo agregar al archivo de villanos" + e), "",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cerrarArchivo(){
        try{
            if(salida != null){
                salida.close();
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al cerrar el archivo", "",JOptionPane.ERROR_MESSAGE);
        }
    }
}