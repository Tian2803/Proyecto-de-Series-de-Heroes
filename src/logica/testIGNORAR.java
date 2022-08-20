/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import archivo.*;
import logica.*;
import archivo.*;
/**
 *
 * @author USUARIO
 */
public class testIGNORAR{
    public static void test(){ 
        /*
        LeerArchivoVillano lector = new LeerArchivoVillano();
        ArrayList<Villano> miVillano = null;
        if (lector.abrirArchivo()) {
            //Se lee el objeto y se asigna al atributo de la clase VentanaPrincipal.
            miVillano = (ArrayList<Villano>)lector.leerArchivo();
            //Se cierra la conexión.
            lector.cerrarArchivo();
        }
        for (Villano imprimemeEsta: miVillano){
         System.out.println(imprimemeEsta.toString());
        }
        */
        LeerArchivoHeroe lector = new LeerArchivoHeroe();
        ArrayList<Heroe> miHeroe = null;
        if (lector.abrirArchivo()) {
            //Se lee el objeto y se asigna al atributo de la clase VentanaPrincipal.
            miHeroe = (ArrayList<Heroe>)lector.leerArchivo();
            //Se cierra la conexión.
            lector.cerrarArchivo();
        }
        for (Heroe imprimemeEsta: miHeroe){
         System.out.println(imprimemeEsta.toString());
        }
    }
    
    
    public static void main(String [] args){
        test();
    } 
}//una tabla con villanos y super heroes y ellos ya deben existir
//tener un archivo con todos los heroes y villanos.

