
import java.awt.Color;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Stock extends javax.swing.JFrame {


    public Stock() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_recortado.png"))); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(122, 99, 255));
        jProgressBar1.setForeground(new java.awt.Color(122, 99, 255));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR STOCK");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANTIDAD");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE PRODUCTO");

        txtProducto.setBackground(new java.awt.Color(30, 30, 30));
        txtProducto.setForeground(new java.awt.Color(102, 102, 102));
        txtProducto.setText("Ingrese el nombre del producto");
        txtProducto.setBorder(null);
        txtProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProductoMousePressed(evt);
            }
        });
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(30, 30, 30));
        txtCantidad.setForeground(new java.awt.Color(102, 102, 102));
        txtCantidad.setText("Ej: 1, 2, 3");
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(255, 255, 255));
        btnVer.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnVer.setForeground(new java.awt.Color(0, 0, 0));
        btnVer.setText("VER STOCK");
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("EDITAR STOCK");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR STOCK");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPedido.setBackground(new java.awt.Color(255, 255, 255));
        btnPedido.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnPedido.setText("REALIZAR PEDIDO");
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(txtCantidad)
                                .addComponent(jSeparator2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnCancelar)
                                .addGap(54, 54, 54)
                                .addComponent(btnIngresar)
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPedido)
                                    .addComponent(btnVer))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnEditar))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCancelar)
                                    .addComponent(btnIngresar))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVer)
                                    .addComponent(btnEditar))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnPedido))
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoMousePressed

        if (txtProducto.getText().equals("Ingrese el nombre del producto")) {
            txtProducto.setText("");
            txtProducto.setForeground(Color.WHITE);
        }

        if (txtCantidad.getText().isEmpty()) {
            txtCantidad.setText("Ej: 1, 2, 3");
            txtCantidad.setForeground(Color.GRAY);

        }

    }//GEN-LAST:event_txtProductoMousePressed
    Hashtable<Integer, Platinum> productos = new Hashtable<Integer, Platinum>();
    int contador=1;
    String texto = "";
    String texto_inicial = "Los elementos de laboratorio son: \n\n";
    
    
    
    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        productos.put(contador, new Platinum(contador, txtProducto.getText(), Integer.parseInt(txtCantidad.getText())));       
        contador++;
        
        
        txtProducto.setText("Ingrese el nombre del producto");
        txtProducto.setForeground(Color.GRAY);
        
        txtCantidad.setText("Ej: 1, 2, 3");
        txtCantidad.setForeground(Color.GRAY);
        JOptionPane.showMessageDialog(null, "Producto Ingresado con éxito ");

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    txtProducto.setText("Ingrese el nombre del producto");
    txtProducto.setForeground(Color.GRAY);

    txtCantidad.setText("Ej: 1, 2, 3");
    txtCantidad.setForeground(Color.GRAY);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if (txtCantidad.getText().equals("Ej: 1, 2, 3")) {
            txtCantidad.setText("");
            txtCantidad.setForeground(Color.WHITE);
        }

        if (txtProducto.getText().isEmpty()) {
            txtProducto.setText("Ingrese el nombre del producto");
            txtProducto.setForeground(Color.GRAY);

        }

    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- " + tempElementosLab.getObjeto() + ":  x" + tempElementosLab.getCantidad() + "\n";

            }
            JOptionPane.showMessageDialog(null, texto_inicial + texto + "\n");
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- ID: " + tempElementosLab.getKey()+ "\n- Objeto: " + tempElementosLab.getObjeto() + "  x" + tempElementosLab.getCantidad() + "\n\n";

            }

            int id_actualizar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Digite el ID del elemento que desea Actualizar:"));
            if (productos.containsKey(id_actualizar)) {

                Platinum tempElementosLab = (Platinum) productos.get(id_actualizar);

                try {

                    tempElementosLab.ActualizarObjeto();

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser un Número Entero, vuelve a intentar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- ID: " + tempElementosLab.getKey()+ "\n- Objeto: " + tempElementosLab.getObjeto() + "\n\n";

            }

            int id_eliminar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Ingrese el ID del elemento que desea Eliminar:"));
            if (productos.containsKey(id_eliminar)) {

                productos.remove(id_eliminar);
                JOptionPane.showMessageDialog(null, "Objeto eliminado con éxito.");

            } else {
                JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        if (!productos.isEmpty()) {

            Enumeration e = productos.keys();
            texto = "";

            while (e.hasMoreElements()) {

                Platinum tempElementosLab = (Platinum) productos.get(e.nextElement());
                texto += "- ID: " + tempElementosLab.getKey()+ "\n- Objeto: " + tempElementosLab.getObjeto() + "  x" + tempElementosLab.getCantidad() + "\n\n";

            }

            int id_actualizar = Integer.parseInt(JOptionPane.showInputDialog(texto_inicial + texto + "Digite el ID del elemento que desea pedir:"));
            if (productos.containsKey(id_actualizar)) {

                Platinum tempElementosLab = (Platinum) productos.get(id_actualizar);

                try {

                    tempElementosLab.PedirObjeto();

                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe de ser un Número Entero, vuelve a intentar.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID in-existente o incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos registrados en el Laboratorio.");
        }
    }//GEN-LAST:event_btnPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
