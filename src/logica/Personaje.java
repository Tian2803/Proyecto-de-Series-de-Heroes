/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public abstract class Personaje implements Serializable {
    private String nombre;
    private String idSecreta;   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }
    
    public abstract double calcularSueldo(); 

    public Personaje(String nombre, String idSecreta) {
        this.nombre = nombre;
        this.idSecreta = idSecreta;
    }  
    
    public Personaje(){        
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", idSecreta=" + idSecreta + '}';
    }
}
