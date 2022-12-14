/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.*;
import archivo.*;
/**
 *
 * @author Sebastian Burgos
 */
public class AgregarPersonaje extends javax.swing.JFrame {

    private ArrayList<Villano> listVillanos;
    private ArrayList<Heroe> listSuperHeroes;
    /**
     * Creates new form AgregarPersonaje
     */
    public AgregarPersonaje() {
        llenarVectores();
        //Evita que se pueda maximizar la pestaña
        this.setResizable(false);
        initComponents();
        deshabilitarPanel(this.pnlDatosSuperheroe);
        deshabilitarPanel(this.pnlDatosVillano);
            
    }
    
    private void llenarVectores(){
    
        this.listVillanos = new ArrayList<>();
        LeerArchivoVillano lector = new LeerArchivoVillano();
        try{
            if (lector.abrirArchivo()) {
                //Se lee el objeto y se asigna al atributo de la clase VentanaPrincipal.
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
                //Se lee el objeto y se asigna al atributo de la clase VentanaPrincipal.
                listSuperHeroes = (ArrayList<Heroe>)lector2.leerArchivo();
                //Se cierra la conexión.
                lector2.cerrarArchivo();
            }
        }
        catch(Exception e){ 
            System.err.println("Error en leer archivo Heroe");
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
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdentidadSecreta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnSuperheroe = new javax.swing.JRadioButton();
        rbtnVillano = new javax.swing.JRadioButton();
        pnlDatosSuperheroe = new javax.swing.JPanel();
        txtPoderes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDebilidades = new javax.swing.JTextField();
        lblDebilidades = new javax.swing.JLabel();
        rbtnPertenecioLiga = new javax.swing.JRadioButton();
        pnlDatosVillano = new javax.swing.JPanel();
        txtFormasAtaque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbtnUsaArmasDefuego = new javax.swing.JRadioButton();
        btnRegistrarPersonaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 198, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar personaje");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 60));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBackground(new java.awt.Color(187, 198, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diligenciar los datos del personaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 60));

        txtIdentidadSecreta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtIdentidadSecreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 30));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identidad secreta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 430, 60));

        rbtnSuperheroe.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        rbtnSuperheroe.setText("Superheroe");
        rbtnSuperheroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSuperheroeActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnSuperheroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, 30));

        rbtnVillano.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        rbtnVillano.setText("Villano");
        rbtnVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVillanoActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 470, 210));

        pnlDatosSuperheroe.setBackground(new java.awt.Color(187, 198, 220));
        pnlDatosSuperheroe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Superheroe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosSuperheroe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPoderes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPoderes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoderesActionPerformed(evt);
            }
        });
        pnlDatosSuperheroe.add(txtPoderes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 30));
        txtPoderes.getAccessibleContext().setAccessibleName("");

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Poderes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosSuperheroe.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 60));

        txtDebilidades.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDatosSuperheroe.add(txtDebilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 30));

        lblDebilidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Debilidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosSuperheroe.add(lblDebilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 300, 60));

        rbtnPertenecioLiga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnPertenecioLiga.setText("Pertenecio a la Liga de la Justicia");
        pnlDatosSuperheroe.add(rbtnPertenecioLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, -1));

        jPanel1.add(pnlDatosSuperheroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 320, 200));

        pnlDatosVillano.setBackground(new java.awt.Color(187, 198, 220));
        pnlDatosVillano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Villano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosVillano.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlDatosVillano.add(txtFormasAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 280, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formas de ataque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        pnlDatosVillano.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 60));

        rbtnUsaArmasDefuego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnUsaArmasDefuego.setText("Usa armas de fuego");
        pnlDatosVillano.add(rbtnUsaArmasDefuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 30));

        jPanel1.add(pnlDatosVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 320, 140));

        btnRegistrarPersonaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarPersonaje.setText("REGISTRAR PERSONAJE");
        btnRegistrarPersonaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 220, 40));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPoderesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoderesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoderesActionPerformed

    private void btnRegistrarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonajeActionPerformed
        String nombre = this.txtNombre.getText();
        String idSecreta = this.txtIdentidadSecreta.getText();
        if(rbtnSuperheroe.isSelected()){
            if(!"".equals(nombre) && !"".equals(idSecreta)){
                String debilidades = this.txtDebilidades.getText();
                String poderes = this.txtPoderes.getText();
                Boolean pertenecioLigaJusticia = this.rbtnPertenecioLiga.isSelected();
                if(!"".equals(debilidades) && !"".equals(poderes)){
                    try {
                        if(validarPersonaje(nombre,idSecreta)){
                            Heroe heroe = new Heroe(poderes,debilidades,pertenecioLigaJusticia,nombre,idSecreta);
                            //Se crea un objeto EscribirProCanal con la ruta relativa y el nombre del archivo por defecto
                            listSuperHeroes.add(heroe);
                            escribirArchivoHeroes();
                            JOptionPane.showMessageDialog(null, "Heroe guardado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Ya existe un personaje con estos datos","",JOptionPane.INFORMATION_MESSAGE);
                        }
                        vaciarPrincipal();
                        VaciarHeroe();
                    } catch (Exception e) {
                        this.lanzarPaneExcepcion(e);
                    }
                }
            }
        }
        else{
            if(rbtnVillano.isSelected()){
                if(!"".equals(nombre) && !"".equals(idSecreta)){
                    String formasAtaque = this.txtFormasAtaque.getText();
                    Boolean usaArmas = this.rbtnUsaArmasDefuego.isSelected();
                    if(!"".equals(formasAtaque)){
                        try {
                            if(validarPersonaje(nombre,idSecreta)){
                                Villano villano = new Villano(formasAtaque,usaArmas,
                                    nombre,idSecreta);                            
                                listVillanos.add(villano);
                                escribirArchivoVillanos();
                                JOptionPane.showMessageDialog(this, "Villano Registrado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Ya existe un personaje con estos datos","",JOptionPane.WARNING_MESSAGE);
                            }
                            vaciarPrincipal();
                            VaciarVillano();
                        } catch (Exception e) {
                            this.lanzarPaneExcepcion(e);
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Los primeros campos son obligatorios","Error opcion",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegistrarPersonajeActionPerformed

    private void rbtnSuperheroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSuperheroeActionPerformed
        if(rbtnSuperheroe.isSelected()){
            VaciarVillano();
            this.rbtnVillano.setEnabled(false);
            habilitarPanel(this.pnlDatosSuperheroe);
            deshabilitarPanel(this.pnlDatosVillano);   
        }
        else{
            this.rbtnVillano.setEnabled(true); 
            deshabilitarPanel(this.pnlDatosSuperheroe);   
        }
    }//GEN-LAST:event_rbtnSuperheroeActionPerformed

    private void rbtnVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVillanoActionPerformed
        if(rbtnVillano.isSelected()){
            VaciarHeroe();
            this.rbtnSuperheroe.setEnabled(false);
            habilitarPanel(this.pnlDatosVillano);
            deshabilitarPanel(this.pnlDatosSuperheroe);   
        }
        else{
            this.rbtnSuperheroe.setEnabled(true); 
            deshabilitarPanel(this.pnlDatosVillano);   
        }
    }//GEN-LAST:event_rbtnVillanoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarPersonaje;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDebilidades;
    private javax.swing.JPanel pnlDatosSuperheroe;
    private javax.swing.JPanel pnlDatosVillano;
    private javax.swing.JRadioButton rbtnPertenecioLiga;
    private javax.swing.JRadioButton rbtnSuperheroe;
    private javax.swing.JRadioButton rbtnUsaArmasDefuego;
    private javax.swing.JRadioButton rbtnVillano;
    private javax.swing.JTextField txtDebilidades;
    private javax.swing.JTextField txtFormasAtaque;
    private javax.swing.JTextField txtIdentidadSecreta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoderes;
    // End of variables declaration//GEN-END:variables

    private void habilitarPanel(JPanel panel){        
        for (Component component : panel.getComponents()) {
            component.setEnabled(true);
        }
    }
    
    private void deshabilitarPanel(JPanel panel){        
        for (Component component : panel.getComponents()) {
            component.setEnabled(false);
        }
    }
    
    private void vaciarPrincipal(){
        this.txtNombre.setText("");
        this.txtIdentidadSecreta.setText("");
        deshabilitarPanel(this.pnlDatosSuperheroe);
        deshabilitarPanel(this.pnlDatosVillano);
        this.rbtnSuperheroe.setSelected(false);
        this.rbtnVillano.setSelected(false);
    }
    
    private void VaciarHeroe(){
        this.rbtnVillano.setEnabled(true);
        this.txtDebilidades.setText("");
        this.txtPoderes.setText("");
        this.rbtnPertenecioLiga.setSelected(false);
    }
    
    private void VaciarVillano(){
        this.rbtnSuperheroe.setEnabled(true);
        this.txtFormasAtaque.setText("");
        this.rbtnUsaArmasDefuego.setSelected(false);
    }
    
    private void lanzarPaneExcepcion(Exception msgError){
        JOptionPane.showMessageDialog(this, "Hubo un error: " + msgError, "Error", JOptionPane.ERROR_MESSAGE);
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
    
    private Boolean validarPersonaje(String nombre,String idSecreta){
        for(Heroe heroe:listSuperHeroes){
            if(heroe.getNombre().equalsIgnoreCase(nombre) && heroe.getIdSecreta().equalsIgnoreCase(idSecreta)){
                return false;
            }               
        }
        for(Villano villano: listVillanos){
            if(villano.getNombre().equalsIgnoreCase(nombre) && villano.getIdSecreta().equalsIgnoreCase(idSecreta)){
                return false;
            }               
        }
        return true;
    }
}
