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
public class Serie implements Serializable{
    private ArrayList<Personaje> personajes;
    private String nombreSerie;
    private int yearCreacion;
    private ArrayList<Episodio> episodios;

    public Serie(ArrayList<Personaje> personajes, String nombreSerie, int yearCreacion, ArrayList<Episodio> episodios) {
        this.personajes = personajes;
        this.nombreSerie = nombreSerie;
        this.yearCreacion = yearCreacion;
        this.episodios = episodios;
    }
    
    public Serie(String nombreSerie, int yearCreacion) {
        this.personajes = new ArrayList<>();
        this.nombreSerie = nombreSerie;
        this.yearCreacion = yearCreacion;
        this.episodios = new ArrayList<>();
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public int getYearCreacion() {
        return yearCreacion;
    }

    public void setYearCreacion(int yearCreacion) {
        this.yearCreacion = yearCreacion;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = new ArrayList<>();
        this.episodios = episodios;
    }
    
    public void agregarEpisodio(Episodio episodioEntrada){
        this.episodios.add(episodioEntrada);
    }
    
    public double getTotal(){
        double totalSerie=0.0;
        for(Episodio episodio: episodios){
            totalSerie+= episodio.sueldoEpisodioPersonajes();
        }       
        return totalSerie;
    }
    
    @Override
    public String toString(){
        StringBuilder textoSalidad = new StringBuilder();
        textoSalidad.append(this.nombreSerie).append(" es una serie que tiene un total de ").append(this.episodios.size()).append(" episodios, y un costo de ").append(this.getTotal());
        return textoSalidad.toString();
    }
    
}
