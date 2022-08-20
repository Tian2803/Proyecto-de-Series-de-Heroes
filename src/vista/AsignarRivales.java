/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.*;
import archivo.*;
/**
 *
 * @author Sebastian Burgos
 */
public class AsignarRivales extends javax.swing.JFrame {

    private ArrayList<Villano> listVillanos;
    private ArrayList<Heroe> listSuperHeroes;
    /**
     * Creates new form AgregarPersonaje
     */
    public AsignarRivales() {
        llenarVectores();
        //Evita que se pueda maximizar la pestaña
        this.setResizable(false);
        initComponents();
        llenarBoxHeroe();
        llenarBoxVillano();
    }
    
    private void llenarVectores(){    
        this.listVillanos = new ArrayList<>();
        LeerArchivoVillano lector = new LeerArchivoVillano();
        try{
            if (lector.abrirArchivo()) {
                //Leyendo los villanos.
                listVillanos = (ArrayList<Villano>)lector.leerArchivo();
                //Se cierra la conexión.
                lector.cerrarArchivo();
            }
        }
        catch(Exception e){ 
            System.err.println("Error en leer archivo Villano");
        }  
        
        this.listSuperHeroes = new ArrayList<>();
        LeerArchivoHeroe lector2 = new LeerArchivoHeroe();
        try{
            if (lector2.abrirArchivo()) {
                //Leyendo Heroes.
                listSuperHeroes = (ArrayList<Heroe>)lector2.leerArchivo();
                //Se cierra la conexión.
                lector2.cerrarArchivo();
            }
        }
        catch(Exception e){ 
            System.err.println("Error en leer archivo Heroe");
        }
    }

    private void llenarBoxVillano(){
        this.cboxVillanos.removeAllItems();
        this.cboxVillanos.addItem("Seleccionar");
        try{
            for(Villano villano: listVillanos){
                if(villano!=null){
                    if(villano.getHeroe()==null){
                        this.cboxVillanos.addItem(villano.getNombre());
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error: " +e,"Error opcion",JOptionPane.ERROR_MESSAGE);
        }            
    }
    
    private void llenarBoxHeroe(){
        this.cboxHeroes.removeAllItems();
        this.cboxHeroes.addItem("Seleccionar");
        try{
            for(Heroe heroe: listSuperHeroes){
                if(heroe!=null){
                    this.cboxHeroes.addItem(heroe.getNombre());
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error: " +e,"Error opcion",JOptionPane.ERROR_MESSAGE);
        }            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlDatosSuperheroe = new javax.swing.JPanel();
        cboxHeroes = new javax.swing.JComboBox<>();
        pnlDatosVillano = new javax.swing.JPanel();
        cboxVillanos = new javax.swing.JComboBox<>();
        btnRegistrarRivales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 198, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asignar Rivales");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 60));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pnlDatosSuperheroe.setBackground(new java.awt.Color(187, 198, 220));
        pnlDatosSuperheroe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Superheroe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosSuperheroe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxHeroes.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cboxHeroes.setMaximumRowCount(6);
        cboxHeroes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cboxHeroes.setToolTipText("");
        cboxHeroes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxHeroesActionPerformed(evt);
            }
        });
        pnlDatosSuperheroe.add(cboxHeroes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 30));

        jPanel1.add(pnlDatosSuperheroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 80));

        pnlDatosVillano.setBackground(new java.awt.Color(187, 198, 220));
        pnlDatosVillano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Villano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosVillano.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxVillanos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cboxVillanos.setMaximumRowCount(6);
        cboxVillanos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        pnlDatosVillano.add(cboxVillanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 30));

        jPanel1.add(pnlDatosVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 320, 80));

        btnRegistrarRivales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarRivales.setText("REGISTRAR RIVALIDAD");
        btnRegistrarRivales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarRivales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRivalesActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarRivales, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRivalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRivalesActionPerformed
        int posicionHeroe = this.cboxHeroes.getSelectedIndex()-1;
        int posicionVillano = buscarVillano();
        if(posicionHeroe>=0 && posicionVillano>=0){
            listSuperHeroes.get(posicionHeroe).agregarVillano(listVillanos.get(posicionVillano));
            listVillanos.get(posicionVillano).setHeroe(listSuperHeroes.get(posicionHeroe));    
            escribirArchivoHeroes();
            escribirArchivoVillanos();
            llenarBoxHeroe();
            llenarBoxVillano();
            resetFrame();
            JOptionPane.showMessageDialog(null,"Se ha asignado la rivalidad","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe haber 1 heroe y 1 villano","Faltan datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarRivalesActionPerformed

    private void cboxHeroesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxHeroesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxHeroesActionPerformed
    
    private int buscarVillano(){
        String nombre = this.cboxVillanos.getSelectedItem().toString();
        for(Villano villano: listVillanos){
            if(villano.getNombre().equalsIgnoreCase(nombre)){
                return listVillanos.indexOf(villano);
            }
        }
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AsignarRivales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarRivales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarRivales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarRivales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarRivales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarRivales;
    private javax.swing.JComboBox<String> cboxHeroes;
    private javax.swing.JComboBox<String> cboxVillanos;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlDatosSuperheroe;
    private javax.swing.JPanel pnlDatosVillano;
    // End of variables declaration//GEN-END:variables
    private void resetFrame(){
        this.cboxHeroes.setSelectedIndex(0);
        this.cboxVillanos.setSelectedIndex(0);
    }
    
    private void escribirArchivoHeroes(){        
        EscribirArchivoHeroes escritura = new EscribirArchivoHeroes();
        escritura.abrirArchivo();
        escritura.escribirObjeto(listSuperHeroes);
        escritura.cerrarArchivo();
    }
    
    private void escribirArchivoVillanos(){        
        EscribirArchivoVillanos escritura2 = new EscribirArchivoVillanos();
        escritura2.abrirArchivo();
        escritura2.escribirObjeto(listVillanos);
        escritura2.cerrarArchivo();
    }
}