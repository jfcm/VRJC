
package UIPackage;

import LogicPackage.Empresa;
import LogicPackage.Producto;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Cliente_BuscarProducto extends javax.swing.JFrame {
    
    Empresa empresa;
    DefaultListModel<String> model;
    ArrayList<Producto> p1;
    int id;
    
    /**
     * Creates new form Cliente_BuscarProducto
     */
    public Cliente_BuscarProducto() {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Cliente");
    }
     
    public Cliente_BuscarProducto(Empresa empresa, int id){
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Cliente");
        this.empresa = empresa;
        this.id = id;
    }
    
    private void pesquisarPorNombre(String nombre){
        
        p1 = new ArrayList<>();        
        model = new DefaultListModel<>();

        for (Producto p : empresa.getFranquicias().get(id).getCatalogo().getListaProductos()) {
            if(p.getNombre().equals(nombre))
            {
                model.addElement(p.getDescription());
                p1.add(p);
            }
        }
        ListProductos.setModel(model);
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
        LBuscarProducto = new javax.swing.JLabel();
        TFnombreProducto = new javax.swing.JTextField();
        LNombreProducto = new javax.swing.JLabel();
        BNombreProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListProductos = new javax.swing.JList<>();
        bComprar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        bModificarMedidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBuscarProducto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LBuscarProducto.setText("Buscar Producto");

        TFnombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreProductoActionPerformed(evt);
            }
        });

        LNombreProducto.setText("Nombre Producto:");

        BNombreProducto.setText("Ok");
        BNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNombreProductoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListProductos);

        bComprar.setText("Comprar");
        bComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprarActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        bModificarMedidas.setText("Modificar Medidas");
        bModificarMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarMedidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bComprar)
                        .addGap(18, 18, 18)
                        .addComponent(bModificarMedidas)
                        .addGap(18, 18, 18)
                        .addComponent(bVolver)
                        .addGap(60, 60, 60))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LNombreProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFnombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BNombreProducto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(LBuscarProducto)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFnombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNombreProducto)
                    .addComponent(BNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bComprar)
                    .addComponent(bVolver)
                    .addComponent(bModificarMedidas))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNombreProductoActionPerformed
        String nombre =  TFnombreProducto.getText();
        pesquisarPorNombre(nombre);
    }//GEN-LAST:event_BNombreProductoActionPerformed

    private void TFnombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnombreProductoActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        Cliente_Menu m = new Cliente_Menu(empresa, id);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void bComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprarActionPerformed
        int m = ListProductos.getSelectedIndex();
        
        //empresa.getFranquicias().get(id).getCompras().add(p1.get(m));
        
        Trabajador_DesejaInstalacion c = new Trabajador_DesejaInstalacion(empresa, id, p1.get(m));
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bComprarActionPerformed

    private void bModificarMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarMedidasActionPerformed
        int m = ListProductos.getSelectedIndex();
        
        Cliente_ModificarProducto d = new Cliente_ModificarProducto(empresa, p1.get(m), id);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bModificarMedidasActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente_BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_BuscarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNombreProducto;
    private javax.swing.JLabel LBuscarProducto;
    private javax.swing.JLabel LNombreProducto;
    private javax.swing.JList<String> ListProductos;
    private javax.swing.JTextField TFnombreProducto;
    private javax.swing.JButton bComprar;
    private javax.swing.JButton bModificarMedidas;
    private javax.swing.JButton bVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
