/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Episodio  implements Serializable {
    private String nombreEpisodio;
    private ArrayList <Personaje> personajes;

    public Episodio(String nombreEpisodio,ArrayList<Personaje> personajesbby) {
        this.personajes = personajesbby;
    }
    
    public Episodio(String nombreEpisodio) {
        this.nombreEpisodio = nombreEpisodio;
        this.personajes = null;
    }

    public ArrayList<Personaje> getPersonajesbby() {
        if(this.personajes!=null){return personajes;}
        else{ return (new ArrayList<Personaje>());}
    }

    public void setPersonajes(ArrayList<Personaje> personajesbby) {
        this.personajes = personajesbby;
    }    

    public String getNombreEpisodio() {
        return nombreEpisodio;
    }

    public void setNombreEpisodio(String nombreEpisodio) {
        this.nombreEpisodio = nombreEpisodio;
    } 
    
    public double sueldoEpisodioPersonajes(){
        double totalEpisodio=0.0;
        if(personajes!=null){
            for(Personaje personaje: personajes){            
                totalEpisodio += personaje.calcularSueldo();
            }
        }
        return totalEpisodio;
    }
}
