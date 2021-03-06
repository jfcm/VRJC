
package UIPackage;

import LogicPackage.Empresa;
import LogicPackage.Producto;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author João Piedade
 */
public class Cliente_Compras extends javax.swing.JFrame {
    
    Empresa empresa;
    DefaultListModel<String> model;
    int id;
    
    /**
     * Creates new form Cliente_Compras
     */
    public Cliente_Compras() {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Cliente");
    }
    
    public Cliente_Compras(Empresa empresa, int id) {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Cliente");
        this.empresa = empresa;
        this.id = id;
        llenarProductos();        
    }
    
    private void llenarProductos(){
        model = new DefaultListModel<>();
        
        for (Producto p : empresa.getFranquicias().get(id).getCompras()) {     
            
                model.addElement(p.getDescription());    
                
        }
        Lprodutos.setModel(model);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TAprodutos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lprodutos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        Bborrar = new javax.swing.JButton();
        BComprarMas = new javax.swing.JButton();
        Bver = new javax.swing.JButton();
        BfinalizarCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TAprodutos.setColumns(20);
        TAprodutos.setRows(5);
        jScrollPane1.setViewportView(TAprodutos);

        jScrollPane2.setViewportView(Lprodutos);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Compras");

        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        BComprarMas.setText("Comprar Más");
        BComprarMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComprarMasActionPerformed(evt);
            }
        });

        Bver.setText("Ver");
        Bver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BverActionPerformed(evt);
            }
        });

        BfinalizarCompras.setText("Finalizar Compras");
        BfinalizarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfinalizarComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Bborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BComprarMas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Bver, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BfinalizarCompras)
                        .addGap(10, 10, 10)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bborrar)
                    .addComponent(BComprarMas)
                    .addComponent(Bver)
                    .addComponent(BfinalizarCompras))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BComprarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComprarMasActionPerformed
        Cliente_ConsultarCatalogo s = new Cliente_ConsultarCatalogo(empresa, id);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BComprarMasActionPerformed

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
        int m = Lprodutos.getSelectedIndex();
        
        if(Lprodutos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que elegir un producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        empresa.getFranquicias().get(id).getCompras().remove(m);
        
        model = new DefaultListModel<>();
       
        for (Producto p : empresa.getFranquicias().get(id).getCompras()) {     
            
                model.addElement(p.getNombre());    
                
        }
        Lprodutos.setModel(model);
        
    }//GEN-LAST:event_BborrarActionPerformed

    private void BverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BverActionPerformed
        int m = Lprodutos.getSelectedIndex();
        
        if(Lprodutos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que elegir un producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String precioVenta = String.valueOf(empresa.getFranquicias().get(id).getCompras().get(m).getPrecioVenta());
        String alto = String.valueOf(empresa.getFranquicias().get(id).getCompras().get(m).getAlto());
        String ancho = String.valueOf(empresa.getFranquicias().get(id).getCompras().get(m).getAncho());
        
        TAprodutos.setText("Producto: " + empresa.getFranquicias().get(id).getCompras().get(m).getNombre() + 
                                 "\n\nDrescription: " + empresa.getFranquicias().get(id).getCompras().get(m).getDescription() + 
                                 "\n\nPrecio: " + precioVenta + 
                                 "\n\nAlto: " + alto +
                                 "\n\nAncho: " + ancho);
        
        TAprodutos.setEditable(false);
    }//GEN-LAST:event_BverActionPerformed

    private void BfinalizarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfinalizarComprasActionPerformed
        Trabajador_LoginMenu l = new Trabajador_LoginMenu(empresa, id, 1);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BfinalizarComprasActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BComprarMas;
    private javax.swing.JButton Bborrar;
    private javax.swing.JButton BfinalizarCompras;
    private javax.swing.JButton Bver;
    private javax.swing.JList<String> Lprodutos;
    private javax.swing.JTextArea TAprodutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
