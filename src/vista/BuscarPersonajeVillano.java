/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import archivo.LeerArchivoVillano;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Heroe;
import logica.Villano;

/**
 *
 * @author Sebastian Burgos
 */
public class BuscarPersonajeVillano extends javax.swing.JFrame {
    private ArrayList<Villano> listVillanos;

    /**
     * Creates new form AgregarPersonaje
     */
    public BuscarPersonajeVillano() {
        //Evita que se pueda maximizar la pestaña
        this.setResizable(false);
        llenarDatosVillanos();
        initComponents();
    }
    
    private void llenarDatosVillanos(){
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
        txtNombreVillano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdentidadSecreta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSueldoEpisodio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarNombreVillano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarVillano = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionVillano = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 198, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Villano");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 60));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBackground(new java.awt.Color(187, 198, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del Villano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreVillano.setEditable(false);
        txtNombreVillano.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombreVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVillanoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 60));

        txtIdentidadSecreta.setEditable(false);
        txtIdentidadSecreta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtIdentidadSecreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 410, 30));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identidad secreta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 430, 60));

        txtSueldoEpisodio.setEditable(false);
        txtSueldoEpisodio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSueldoEpisodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoEpisodioActionPerformed(evt);
            }
        });
        jPanel2.add(txtSueldoEpisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 30));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sueldo por episodio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 480, 220));

        txtBuscarNombreVillano.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(txtBuscarNombreVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 370, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Villano a buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 390, 60));

        btnBuscarVillano.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarVillano.setText("Buscar");
        btnBuscarVillano.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVillanoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarVillano, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 150, 30));

        txtDescripcionVillano.setEditable(false);
        txtDescripcionVillano.setColumns(20);
        txtDescripcionVillano.setLineWrap(true);
        txtDescripcionVillano.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionVillano);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 560, 180));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion del Villano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 580, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVillanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVillanoActionPerformed

    private void txtSueldoEpisodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoEpisodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoEpisodioActionPerformed

    private void btnBuscarVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVillanoActionPerformed
        String textBuscar = this.txtBuscarNombreVillano.getText();
        boolean encontrado = false;
        if(!textBuscar.equals("")){
            for(Villano villano: listVillanos){
                if(villano.getNombre().toLowerCase().contains(textBuscar.toLowerCase())){
                    this.txtNombreVillano.setText(villano.getNombre());
                    this.txtIdentidadSecreta.setText(villano.getIdSecreta());
                    this.txtSueldoEpisodio.setText(String.valueOf(villano.calcularSueldo()));
                    this.txtDescripcionVillano.setText(villano.toString());
                    encontrado = true;
                }
            }
            if(!encontrado){
            JOptionPane.showMessageDialog(null, "Personaje no encontre en heroes","No esta :sad:",JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Digite el nombre","No texto",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarVillanoActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPersonajeVillano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPersonajeVillano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPersonajeVillano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPersonajeVillano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPersonajeVillano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVillano;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarNombreVillano;
    private javax.swing.JTextArea txtDescripcionVillano;
    private javax.swing.JTextField txtIdentidadSecreta;
    private javax.swing.JTextField txtNombreVillano;
    private javax.swing.JTextField txtSueldoEpisodio;
    // End of variables declaration//GEN-END:variables
}