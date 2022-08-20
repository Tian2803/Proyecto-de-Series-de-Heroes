/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import logica.ManipulaSerie;

/**
 *
 * @author Sebastian Burgos
 */
public class EscribirManipulaPro {

    private ObjectOutputStream entrada;
    private String nombreArchivo;

    public EscribirManipulaPro() {
        nombreArchivo = "datosSeries.bin";
    }

    public EscribirManipulaPro(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void abrirArchivo() {
        try {
            entrada = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
        } catch (IOException excepcion) {
            System.err.println("ERROR... No se puede cargar el archivo.");
        }
    }

    public void escribirObjeto(ManipulaSerie administrador) {
        try {
            entrada.writeObject(administrador);
        } catch (IOException excepcion) {
            System.err.println("Error... No se pudo escribir en el archivo.");
        }
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        }catch(IOException excepcion){
            System.err.println("Error... No se puede cerrar el archivo.");
        }
    }
}
