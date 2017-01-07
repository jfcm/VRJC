/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import LogicPackage.Empresa;
import LogicPackage.Producto;
import LogicPackage.Trabajador;
import javax.swing.DefaultListModel;

/**
 *
 * @author joaom
 */
public class Trabajador_F_Compras extends javax.swing.JFrame {

    /**
     * Creates new form Trabajador_F_Compras
     */
    DefaultListModel<String> model;
    Empresa e;
    int id;
    
    public Trabajador_F_Compras() {
        setTitle("Ventanas y Rejas José Cándido - Trabajador");
        initComponents();
    }
    
    public Trabajador_F_Compras(Empresa e, int id) {
        setTitle("Ventanas y Rejas José Cándido - Trabajador");
        this.e = e;
        this.id = id;
        initComponents();
        
        model = new DefaultListModel<>();
        
        for (Producto p : e.getFranquicias().get(id).getCompras()) {     
            
                model.addElement(p.getDescription());    
                
        }
        ListCompras.setModel(model);
    }
    
    public void DarBaja()
    {
        double preco_total_ventas = 0, preco_total_compras = 0, beneficio, saldo_total = 0;
        
        for(Producto p1 : e.getFranquicias().get(id).getCompras())
        {
            preco_total_ventas = preco_total_ventas + p1.getPrecioVenta();
            preco_total_compras = preco_total_compras + p1.getPrecioCompra();
        }
        
        e.getFranquicias().get(id).setTotal_ventas(e.getFranquicias().get(id).getTotal_ventas() + preco_total_ventas);
        
        e.getFranquicias().get(id).setNumTotalPvendidos(e.getFranquicias().get(id).getNumTotalPvendidos() + e.getFranquicias().get(id).getCompras().size());
        
        for(Trabajador t : e.getFranquicias().get(id).getListTrabajadores())
        {
            saldo_total = saldo_total + t.getSueldo();
        }
        
        beneficio = preco_total_ventas - preco_total_compras - saldo_total;
        
        e.getFranquicias().get(id).setBeneficio(e.getFranquicias().get(id).getBeneficio() + beneficio);
        
        for(int i = 0; i < e.getFranquicias().get(id).getCompras().size(); i++)
        {
            for(int j = 0; j < e.getFranquicias().get(id).getCatalogo().getListaProductos().size(); j++)
            {
                if(e.getFranquicias().get(id).getCompras().get(i).equals(e.getFranquicias().get(id).getCatalogo().getListaProductos().get(j)))
                {
                    e.getFranquicias().get(id).getCatalogo().getListaProductos().remove(j);
                    break;
                }
            }
            e.getFranquicias().get(id).getCompras().remove(i);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListCompras = new javax.swing.JList<>();
        bDarBaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Trabajador");

        jScrollPane1.setViewportView(ListCompras);

        bDarBaja.setText("Dar Baja Productos");
        bDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bDarBaja)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bDarBaja)
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void bDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarBajaActionPerformed
        DarBaja();
        MainMenu m = new MainMenu(e);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bDarBajaActionPerformed

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
            java.util.logging.Logger.getLogger(Trabajador_F_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajador_F_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajador_F_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajador_F_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabajador_F_Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListCompras;
    private javax.swing.JButton bDarBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
