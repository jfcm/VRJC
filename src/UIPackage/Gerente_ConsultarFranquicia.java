
package UIPackage;

import LogicPackage.Dueno;
import LogicPackage.Empresa;
import LogicPackage.Franquicia;
import LogicPackage.Producto;
import LogicPackage.Trabajador;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class Gerente_ConsultarFranquicia extends javax.swing.JFrame {

    Empresa empresa;
    ArrayList<Franquicia> franquicias;
    ArrayList<Trabajador> trabajadores;
    Dueno dueno;
    int id;
    DefaultListModel<String> model;

    /**
     * Creates new form Gerente_ConsultarFranquicia
     */
    public Gerente_ConsultarFranquicia() {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Gerente");
    }
    
    public Gerente_ConsultarFranquicia(Empresa empresa, int id) {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Gerente");
        this.empresa = empresa;
        this.id = id;
        franquicias = empresa.getFranquicias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbDueno = new javax.swing.JRadioButton();
        rbTrabajador = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDatos = new javax.swing.JList<>();
        bConsultarDatos = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        group.add(rbDueno);
        rbDueno.setText("Dueño");
        rbDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDuenoActionPerformed(evt);
            }
        });

        group.add(rbTrabajador);
        rbTrabajador.setText("Trabajador");
        rbTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrabajadorActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listDatos);

        bConsultarDatos.setText("Consultar Datos");
        bConsultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarDatosActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        taDatos.setColumns(20);
        taDatos.setRows(5);
        jScrollPane2.setViewportView(taDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTrabajador)
                    .addComponent(rbDueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(bConsultarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDueno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTrabajador)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConsultarDatos)
                    .addComponent(bVolver))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDuenoActionPerformed
        Franquicia f = franquicias.get(id);
        
        model = new DefaultListModel<>();
        
        model.addElement(f.getDueno().getNombre());
        
        dueno = f.getDueno();
   
        listDatos.setModel(model);       
    }//GEN-LAST:event_rbDuenoActionPerformed

    private void rbTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrabajadorActionPerformed
        Franquicia f = franquicias.get(id);
        
        model = new DefaultListModel<>();

        trabajadores = f.getListTrabajadores();

        for (Trabajador t : trabajadores) {
            model.addElement(t.getNombre());
        }

        listDatos.setModel(model);
    }//GEN-LAST:event_rbTrabajadorActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        Gerente_Menu g = new Gerente_Menu(empresa);
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void bConsultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarDatosActionPerformed
            
        int aux = listDatos.getSelectedIndex();
              
        if (rbDueno.isSelected() == true){
            taDatos.setText("Nombre: " + dueno.getNombre() + 
                            "\n\nApelidos: " + dueno.getApelido() + 
                            "\n\nUsuario: " + dueno.getUsername() + 
                            "\n\nPassword: " + dueno.getPassword());
        }
        if(rbTrabajador.isSelected() == true){
            String Sueldo = String.valueOf(trabajadores.get(aux).getSueldo());
            
            taDatos.setText("Nombre: " + trabajadores.get(aux).getNombre() + 
                            "\n\nApelidos: " + trabajadores.get(aux).getApelido() + 
                            "\n\nUsuario: " + trabajadores.get(aux).getUsername() + 
                            "\n\nPassword: " + trabajadores.get(aux).getPassword() +
                            "\n\nSueldo: " + Sueldo);
        }
        
    }//GEN-LAST:event_bConsultarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(Gerente_ConsultarFranquicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente_ConsultarFranquicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente_ConsultarFranquicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente_ConsultarFranquicia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerente_ConsultarFranquicia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultarDatos;
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup group;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listDatos;
    private javax.swing.JRadioButton rbDueno;
    private javax.swing.JRadioButton rbTrabajador;
    private javax.swing.JTextArea taDatos;
    // End of variables declaration//GEN-END:variables
}