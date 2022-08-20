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
public class Heroe extends Personaje implements Serializable{
    
    private String poderes;
    private String debilidades; 
    private ArrayList <Villano> villanos;
    private Boolean pertenecioLJ;
    
    public Heroe(String poderes,String debilidades, Boolean pertenecioLJ, String nombre, String idSecreta) {
        super(nombre, idSecreta);
        villanos = new ArrayList<>();
        this.poderes = poderes;
        this.debilidades = debilidades;
        this.pertenecioLJ = pertenecioLJ;
    } 

    public Heroe(String poderes,ArrayList<Villano> villanos,String debilidades, Boolean pertenecioLJ, String nombre, String idSecreta) {
        super(nombre, idSecreta);
        this.poderes = poderes;
        this.villanos = villanos;
        this.debilidades = debilidades;
        this.pertenecioLJ = pertenecioLJ;
    }   

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public String getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String debilidades) {
        this.debilidades = debilidades;
    }

    public ArrayList<Villano> getVillanos() {
        return villanos;
    }

    public void setVillanos(ArrayList<Villano> villanos) {
        if(this.villanos==null){
            this.villanos = new ArrayList<>();
        }
        this.villanos = villanos;
    }

    public Boolean getPertenecioLJ() {
        return pertenecioLJ;
    }

    public void setPertenecioLJ(Boolean pertenecioLJ) {
        this.pertenecioLJ = pertenecioLJ;
    }
    
    public void agregarVillano(Villano villano){
        if(this.villanos==null){
            this.villanos = new ArrayList<>();
        }
        this.villanos.add(villano);
    }
    
    @Override
    public double calcularSueldo(){
        double sueldo;
        if(villanos!=null){
            sueldo = villanos.size()*200000;
        }
        else{
            sueldo = 0.0;
        }
            
        return sueldo;
    };

    @Override
    public String toString() {
        StringBuilder informacion = new StringBuilder();
        informacion.append(this.getNombre()).append(" ,quien en secreo es ").append(this.getIdSecreta())
                .append(" ,combate el crimen con sus poderes ").append(this.poderes).append(" ,su debilidad es ")
                .append(this.debilidades);
        if(!this.pertenecioLJ){informacion.append(" no ");}
        informacion.append(" pertenecio a la liga de la justicia.").append("\nRivales:");
        if(this.getVillanos()!=null){
            for(Villano villano:this.getVillanos()){
                informacion.append("\n->").append(villano.getNombre());
            }
        }else{
            informacion.append("No especificados");
        }       
        
        return informacion.toString();
    }
    
    
}
