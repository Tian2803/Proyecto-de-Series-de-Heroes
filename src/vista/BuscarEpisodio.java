/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import archivo.LeerArchivoHeroe;
import archivo.LeerManipulaPro;
import java.util.ArrayList;
import logica.*;

/**
 *
 * @author Sebastian Burgos
 */
public class BuscarEpisodio extends javax.swing.JFrame {

    private ManipulaSerie manipulador;
    /**
     * Creates new form AgregarEpisodio
     */
    public BuscarEpisodio() {
        //Evita que se pueda maximizar la pestaña
        this.setResizable(false);
        initComponents();
        this.cboxEpisodios.setEnabled(false);
        leerSeries();
    }
    
    private void leerSeries(){
        manipulador = new ManipulaSerie();
        LeerManipulaPro lector = new LeerManipulaPro();
        try{
            if (lector.abrirArchivo()) {
                //Se lee el objeto y se asigna al atributo de la clase VentanaPrincipal.
                manipulador = (ManipulaSerie)lector.leerArchivo();
                //Se cierra la conexión.
                lector.cerrarArchivo();
            }
        }
        catch(Exception e){ 
            System.err.println("Error en leer archivo series");
        }  
        
        for(Serie serie: manipulador.getSeries()){
            if(serie!=null){
                this.cboxSeries.addItem(serie.getNombreSerie());
            }
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
        cboxEpisodios = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarEpisodio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNombreEpisodio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCostoEpisodio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPersonajes = new javax.swing.JTextArea();
        cboxSeries = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 198, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 310));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Episodio");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 50));

        cboxEpisodios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(cboxEpisodios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 250, 30));

        jLabel4.setLabelFor(cboxSeries);
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Seleccione serie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 60));

        jLabel5.setLabelFor(cboxEpisodios);
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Episodio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 60));

        btnBuscarEpisodio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarEpisodio.setText("Buscar");
        btnBuscarEpisodio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarEpisodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEpisodioActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarEpisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 90, 30));

        jPanel2.setBackground(new java.awt.Color(187, 198, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del episodio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreEpisodio.setEditable(false);
        txtNombreEpisodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEpisodioActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreEpisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 30));

        jLabel3.setLabelFor(txtNombreEpisodio);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del episodio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 320, 60));

        txtCostoEpisodio.setEditable(false);
        txtCostoEpisodio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtCostoEpisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 300, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo del episodio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 320, 60));

        jLabel6.setLabelFor(txtPersonajes);
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personajes que actuan en el episodio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 290, 200));

        jScrollPane2.setEnabled(false);

        txtPersonajes.setEditable(false);
        txtPersonajes.setColumns(20);
        txtPersonajes.setRows(5);
        jScrollPane2.setViewportView(txtPersonajes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 270, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 650, 230));

        cboxSeries.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cboxSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSeriesActionPerformed(evt);
            }
        });
        jPanel1.add(cboxSeries, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEpisodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEpisodioActionPerformed
        
    }//GEN-LAST:event_txtNombreEpisodioActionPerformed

    private void btnBuscarEpisodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEpisodioActionPerformed
        int posicion = this.cboxSeries.getSelectedIndex();
        for(Episodio episodio: manipulador.getSeries().get(posicion-1).getEpisodios()){
            StringBuilder seleccionado = new StringBuilder();
            seleccionado.append(this.cboxEpisodios.getSelectedItem());
            if(episodio.getNombreEpisodio().equalsIgnoreCase(seleccionado.toString())){
                this.txtNombreEpisodio.setText(episodio.getNombreEpisodio());
                this.txtCostoEpisodio.setText(episodio.sueldoEpisodioPersonajes()+"");
                if(episodio.getPersonajesbby()!=null){
                    StringBuilder personajesString = new StringBuilder();
                    for(Personaje persona:episodio.getPersonajesbby()){
                        personajesString.append("->").append(persona.getNombre()).append("\n");
                    }
                    this.txtPersonajes.setText(personajesString.toString());
                }
                else{
                    this.txtPersonajes.setText("No especificado");
                }                
            }
        }
                
    }//GEN-LAST:event_btnBuscarEpisodioActionPerformed

    private void cboxSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSeriesActionPerformed
        int posicion = this.cboxSeries.getSelectedIndex();
        if(posicion!=0){            
            Serie serieSeleccionada = manipulador.getSeries().get(posicion-1);
            this.cboxEpisodios.removeAllItems();
            this.cboxEpisodios.addItem("Seleccionar");
            this.cboxEpisodios.setSelectedIndex(0);
            for(Episodio episodio:serieSeleccionada.getEpisodios()){
               if(episodio!=null){
                   this.cboxEpisodios.addItem(episodio.getNombreEpisodio());
               }
            }
            this.cboxEpisodios.setEnabled(true);
        }
    }//GEN-LAST:event_cboxSeriesActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarEpisodio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEpisodio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEpisodio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEpisodio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEpisodio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEpisodio;
    private javax.swing.JComboBox<String> cboxEpisodios;
    private javax.swing.JComboBox<String> cboxSeries;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCostoEpisodio;
    private javax.swing.JTextField txtNombreEpisodio;
    private javax.swing.JTextArea txtPersonajes;
    // End of variables declaration//GEN-END:variables
}
