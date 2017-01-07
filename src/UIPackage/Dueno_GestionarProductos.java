
package UIPackage;

import LogicPackage.Empresa;
import LogicPackage.Pieza;
import LogicPackage.Producto;
import LogicPackage.RejaPreconfigurada;
import LogicPackage.VentanaPreconfigurada;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Dueno_GestionarProductos extends javax.swing.JFrame {

    Empresa empresa;
    int id;
    private ArrayList<Producto> productos;
    DefaultListModel<String> model;
    
    /**
     * Creates new form Dueno_GestionarProductos
     */
    public Dueno_GestionarProductos() {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Dueño");
    }
    
    public Dueno_GestionarProductos(Empresa empresa, int id) {
        initComponents();
        setTitle("Ventanas y Rejas José Cándido - Dueño");
        this.empresa = empresa;
        this.id = id;
        productos = empresa.getFranquicias().get(id).getCatalogo().getListaProductos();
        llenarListaProductos();
    }
    
    private void llenarListaProductos(){
        model = new DefaultListModel<>();

        for (Producto t : productos) {
            model.addElement(t.getDescription());
        }

        listaProductos.setModel(model);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        bDarBaja = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        bDarAlta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDescription = new javax.swing.JTextField();
        tfPrecioVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPrecioCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfAlto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfAncho = new javax.swing.JTextField();
        rbReja = new javax.swing.JRadioButton();
        rbVentana = new javax.swing.JRadioButton();
        rbPieza = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tfPrecioInstlacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaProductos);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Gestionar Productos");

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bDarBaja.setText("Dar Baja");
        bDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarBajaActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        bDarAlta.setText("Dar Alta");
        bDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarAltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Description:");

        jLabel4.setText("Precio Compra:");

        jLabel5.setText("Precio Venta:");

        jLabel6.setText("Alto:");

        jLabel7.setText("Ancho:");

        group.add(rbReja);
        rbReja.setText("Reja");

        group.add(rbVentana);
        rbVentana.setText("Ventana");

        group.add(rbPieza);
        rbPieza.setText("Pieza");

        jLabel8.setText("Precio Instalacion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(52, 52, 52))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4))
                                                .addGap(39, 39, 39)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(58, 58, 58)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(88, 88, 88)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAncho, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfAlto, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tfPrecioInstlacion)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(rbReja)
                                .addGap(18, 18, 18)
                                .addComponent(rbVentana)
                                .addGap(18, 18, 18)
                                .addComponent(rbPieza))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(bDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bDarAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfPrecioInstlacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbReja)
                            .addComponent(rbVentana)
                            .addComponent(rbPieza)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVolver)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bDarAlta)
                        .addComponent(bModificar))
                    .addComponent(bDarBaja))
                .addGap(39, 39, 39))
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

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        Dueno_Menu g = new Dueno_Menu(empresa, id);
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        
        int aux = listaProductos.getSelectedIndex();
        int flag = 0;
        
        if(listaProductos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que elegir un Producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }  
        
        String nombre = tfNombre.getText();
        String description = tfDescription.getText();
        String precioVenta_aux = tfPrecioVenta.getText();
        String precioCompra_aux = tfPrecioCompra.getText();
        String alto_aux = tfAlto.getText();
        String ancho_aux = tfAncho.getText();
        String precioInstalacion_aux = tfPrecioInstlacion.getText();
                
        if(nombre.isEmpty() || description.isEmpty() || precioVenta_aux.isEmpty() || precioCompra_aux.isEmpty() || alto_aux.isEmpty() || ancho_aux.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que insertar los campos!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
        int precio_v = 0, precio_c = 0, precio_i = 0, alto = 0, ancho = 0;

        try {
            precio_v = Integer.parseInt(tfPrecioVenta.getText());
            precio_c = Integer.parseInt(tfPrecioCompra.getText());
            precio_i = Integer.parseInt(tfPrecioInstlacion.getText());
            alto = Integer.parseInt(tfAlto.getText());
            ancho = Integer.parseInt(tfAncho.getText());
            
            if (precio_v <= 0 && precio_v >= 90000000 || precio_c <= 0 && precio_c >= 90000000 || precio_i <= 0 && precio_i >= 90000000 || alto <= 0 && alto >= 90000000 || ancho <= 0 && ancho >= 90000000) {
                JOptionPane.showMessageDialog(null, "Numero invalido!", "Warning",
                JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido!", "Warning",
            JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        double precioVenta = Double.parseDouble(precioVenta_aux);
        double precioCompra = Double.parseDouble(precioCompra_aux);
        double alto1 = Double.parseDouble(alto_aux);
        double ancho1 = Double.parseDouble(ancho_aux);
        double precioInstalacion = Double.parseDouble(precioInstalacion_aux);
        
        if(!rbPieza.isSelected() && !rbVentana.isSelected() && !rbReja.isSelected()){
            JOptionPane.showMessageDialog(null, "Tiene que elegir un tipo de producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if(rbPieza.isSelected()){
            if(precioInstalacion_aux.isEmpty())
            {
                Producto p = new Pieza(nombre, description, precioVenta, precioCompra, alto1, ancho1);
                productos.set(aux, p);
                empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
                flag = 1;
            }
            
        }
        
        if(rbVentana.isSelected()){
            if(!precioInstalacion_aux.isEmpty())
            {
               Producto p = new VentanaPreconfigurada(nombre, description, precioVenta, precioCompra, alto1, ancho1, precioInstalacion);
                productos.set(aux, p);
                empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
                flag = 1; 
            }
            
        }
        
        if(rbReja.isSelected()){
            if(!precioInstalacion_aux.isEmpty())
            {
                Producto p = new RejaPreconfigurada(nombre, description, precioVenta, precioCompra, alto1, ancho1, precioInstalacion);
                productos.set(aux, p);
                empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
                flag = 1;
            }
        }
        
        if(flag == 1){
            tfNombre.setText(null);
            tfDescription.setText(null);
            tfPrecioVenta.setText(null);
            tfPrecioCompra.setText(null);
            tfAlto.setText(null);
            tfAncho.setText(null);
            tfPrecioInstlacion.setText(null);
            llenarListaProductos();
        }
        
    }//GEN-LAST:event_bModificarActionPerformed

    private void bDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarAltaActionPerformed
        
        int flag = 0;
        
        String nombre = tfNombre.getText();
        String description = tfDescription.getText();
        String precioVenta_aux = tfPrecioVenta.getText();
        String precioCompra_aux = tfPrecioCompra.getText();
        String alto_aux = tfAlto.getText();
        String ancho_aux = tfAncho.getText();
        String precioInstalacion_aux = tfPrecioInstlacion.getText();
                
        if(nombre.isEmpty() || description.isEmpty() || precioVenta_aux.isEmpty() || precioCompra_aux.isEmpty() || alto_aux.isEmpty() || ancho_aux.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que insertar los campos!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } 
        
        int precio_v = 0, precio_c = 0, precio_i = 0, alto = 0, ancho = 0;

        try {
            precio_v = Integer.parseInt(tfPrecioVenta.getText());
            precio_c = Integer.parseInt(tfPrecioCompra.getText());
            precio_i = Integer.parseInt(tfPrecioInstlacion.getText());
            alto = Integer.parseInt(tfAlto.getText());
            ancho = Integer.parseInt(tfAncho.getText());
            
            if (precio_v <= 0 && precio_v >= 90000000 || precio_c <= 0 && precio_c >= 90000000 || precio_i <= 0 && precio_i >= 90000000 || alto <= 0 && alto >= 90000000 || ancho <= 0 && ancho >= 90000000) {
                JOptionPane.showMessageDialog(null, "Numero invalido!", "Warning",
                JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido!", "Warning",
            JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        double precioVenta = Double.parseDouble(precioVenta_aux);
        double precioCompra = Double.parseDouble(precioCompra_aux);
        double alto1 = Double.parseDouble(alto_aux);
        double ancho2 = Double.parseDouble(ancho_aux);
        double precioInstalacion;
        
        if(rbPieza.isSelected()){
            if(precioInstalacion_aux.isEmpty())
            {
                Producto p = new Pieza(nombre, description, precioVenta, precioCompra, alto1, ancho2);
                productos.add(p);
                empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
                flag = 1;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Tiene que elegir un tipo de producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(rbVentana.isSelected()){
            if(!precioInstalacion_aux.isEmpty())
            {
                precioInstalacion = Double.parseDouble(precioInstalacion_aux);
                Producto p = new VentanaPreconfigurada(nombre, description, precioVenta, precioCompra, alto1, ancho2, precioInstalacion);
                productos.add(p);
                empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
                flag = 1;
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Tiene que elegir un tipo de producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(rbReja.isSelected()){
            if(!precioInstalacion_aux.isEmpty())
            {
                precioInstalacion = Double.parseDouble(precioInstalacion_aux);
                Producto p = new RejaPreconfigurada(nombre, description, precioVenta, precioCompra, alto1, ancho2, precioInstalacion);
                productos.add(p);
                empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
                flag = 1;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Tiene que elegir un tipo de producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(flag == 1){
            tfNombre.setText(null);
            tfDescription.setText(null);
            tfPrecioVenta.setText(null);
            tfPrecioCompra.setText(null);
            tfAlto.setText(null);
            tfAncho.setText(null);
            llenarListaProductos();
        }
        
    }//GEN-LAST:event_bDarAltaActionPerformed

    private void bDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarBajaActionPerformed
        
        int aux = listaProductos.getSelectedIndex();
        
        if(listaProductos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Tiene que elegir un Producto!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }  
        
        Producto p = productos.get(aux);
        productos.remove(p);
        empresa.getFranquicias().get(id).getCatalogo().setListaProductos(productos);
        llenarListaProductos();
        
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
            java.util.logging.Logger.getLogger(Dueno_GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dueno_GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dueno_GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dueno_GestionarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dueno_GestionarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDarAlta;
    private javax.swing.JButton bDarBaja;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaProductos;
    private javax.swing.JRadioButton rbPieza;
    private javax.swing.JRadioButton rbReja;
    private javax.swing.JRadioButton rbVentana;
    private javax.swing.JTextField tfAlto;
    private javax.swing.JTextField tfAncho;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecioCompra;
    private javax.swing.JTextField tfPrecioInstlacion;
    private javax.swing.JTextField tfPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
