package vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Burgos
 */
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;

public class ImagenFondo extends JPanel{
    
    public ImagenFondo(){
        
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/Batman.jpeg"));
        g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g); 
    }
    
    public static void main(String [] args){
        JFrame ventana = new JFrame("Imagen de Fondo");
        ImagenFondo fondo = new ImagenFondo();
        ventana.setContentPane(fondo);
        ventana.setSize(600,600);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
