package logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bigbbadbear
 */
public class ManipulaSerie implements Serializable{
    
    private ArrayList<Serie> series;

    public ManipulaSerie() {
        series = new ArrayList();
    }
    
    /**
     *
     * @param titulo
     * @param episodio
     * @return true/false
     * Agrega un episodio a una serie buscada por su nombre y retorna true si se hace efectivo, retorna false si no se hace efectivo
     */
    public boolean agregarEpisodio(String titulo, Episodio episodio){     
          
        for(Serie serie: series){
            if(serie.getNombreSerie().equalsIgnoreCase(titulo)){
                for(Episodio episodioExiste: serie.getEpisodios()){
                    if(episodioExiste.getNombreEpisodio().equalsIgnoreCase(episodio.getNombreEpisodio())){
                        return false;
                    }
                }                
                serie.agregarEpisodio(episodio);
                return true;   
            }
        }
        return false; 
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }
    
    /**
     *
     * @param serieEntrada
     * @return false/true
     * Agrega una serie a un listado de series validando por el @nombre, retorna true si se hace efectivo, retorna false si no se hace efectivo
     */
    public boolean agregarSerie(Serie serieEntrada){
        
        for(Serie serie: series){
            if(serie.getNombreSerie().equalsIgnoreCase(serieEntrada.getNombreSerie())){
                return false;
            }
        }
        return this.series.add(serieEntrada);

    }
    
    
}

