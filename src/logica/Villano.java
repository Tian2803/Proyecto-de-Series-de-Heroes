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
public class Villano extends Personaje implements Serializable{
    
    private String formasAtaque;
    private Boolean usaArmasDeFuego;
    private Personaje Heroe;

    public Villano() {
        this.Heroe = null;
    }    
    
    public Villano(String formasAtaque, Boolean usaArmasDeFuego, String nombre, String idSecreta) {
        super(nombre, idSecreta);
        this.formasAtaque = formasAtaque;
        this.usaArmasDeFuego = usaArmasDeFuego;
        this.Heroe = null;
    }
    
    public Villano(String formasAtaque, Boolean usaArmasDeFuego, Personaje Heroe, String nombre, String idSecreta) {
        super(nombre, idSecreta);
        this.formasAtaque = formasAtaque;
        this.usaArmasDeFuego = usaArmasDeFuego;
        this.Heroe = Heroe;
    }

    public String getFormasAtaque() {
        return formasAtaque;
    }

    public void setFormasAtaque(String formasAtaque) {
        this.formasAtaque = formasAtaque;
    }

    public Boolean getUsaArmasDeFuego() {
        return usaArmasDeFuego;
    }

    public void setUsaArmasDeFuego(Boolean usaArmasDeFuego) {
        this.usaArmasDeFuego = usaArmasDeFuego;
    }

    public Personaje getHeroe() {
        return Heroe;
    }

    public void setHeroe(Personaje HeroeEntrada) {
        this.Heroe = HeroeEntrada;
    } 
    
    @Override
    public double calcularSueldo(){
        double sueldo;
        sueldo = usaArmasDeFuego ? 300000 : 250000;
        return sueldo;
    }

    @Override
    public String toString() {
        StringBuilder retornar = new StringBuilder();
        retornar.append(this.getNombre()).append(" es el apodo del villano ").append(this.getIdSecreta())
                .append(" quien ataca usando ").append(this.getFormasAtaque());
        if(!this.usaArmasDeFuego){retornar.append("NO");}
        retornar.append(" usa armas de fuego y su principal enemigo es ");
        if(this.Heroe!=null){
            retornar.append(this.Heroe.getNombre());
        }
        else{
            retornar.append(" no especificado ");
        }
        return retornar.toString();
    }
    
}
