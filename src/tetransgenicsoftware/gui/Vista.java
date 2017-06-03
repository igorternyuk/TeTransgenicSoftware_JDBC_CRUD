package tetransgenicsoftware.gui;

import exeptions.CouldNotReadConfigFileException;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import tetransgenicsoftware.gui.renderer.Renderer;
import tetransgenicsoftware.model.Brand;
import tetransgenicsoftware.model.Data;
import tetransgenicsoftware.model.Food;
import tetransgenicsoftware.model.TMFood;
import tetransgenicsoftware.model.TMTransFood;
public class Vista extends javax.swing.JFrame {

    private Data data;

    public Vista() {
        try {
            initComponents();
            centrarLaVentana();
            data = new Data();
            cargarMarcasAlComboBox();
            refrescar(); 
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "The problem during database connecting has encountered :" + ex.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);
        } catch (CouldNotReadConfigFileException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    private void centrarLaVentana(){
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnListadoCompleto = new javax.swing.JButton();
        pnlAlimento = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox();
        btnRegistrar = new javax.swing.JToggleButton();
        chkbxTrans = new javax.swing.JCheckBox();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTransgenicos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBuscedas = new javax.swing.JTable();
        pnlEstadistica = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNoTrans = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTodos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        pnlTransONo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TeTransgenicSoftware");
        setLocation(new java.awt.Point(350, 50));
        setPreferredSize(new java.awt.Dimension(978, 512));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 30));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 280, 30));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.setName(""); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 280, -1));

        btnListadoCompleto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListadoCompleto.setText("Cargar listado completo");
        btnListadoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListadoCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 280, -1));

        pnlAlimento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alimento"));
        pnlAlimento.setForeground(new java.awt.Color(0, 0, 0));
        pnlAlimento.setToolTipText("1111");
        pnlAlimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pnlAlimento.setName("title"); // NOI18N
        pnlAlimento.setOpaque(false);
        pnlAlimento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ID:");
        pnlAlimento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblID.setText("x");
        pnlAlimento.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 10));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        pnlAlimento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlAlimento.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 30));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlAlimento.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Marca:");
        pnlAlimento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pnlAlimento.add(cbxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 29));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlAlimento.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 30));

        chkbxTrans.setText("Transgenico");
        chkbxTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxTransActionPerformed(evt);
            }
        });
        pnlAlimento.add(chkbxTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlAlimento.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 100, 30));

        getContentPane().add(pnlAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 360, 180));

        tablaTransgenicos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaTransgenicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaTransgenicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaTransgenicosMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTransgenicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTransgenicos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 360, 260));

        tablaBuscedas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaBuscedas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaBuscedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaBuscedasMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaBuscedas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 590, 260));

        pnlEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estadística"));
        pnlEstadistica.setLayout(new java.awt.GridLayout(3, 2));

        jLabel4.setText("Transgenicos: ");
        pnlEstadistica.add(jLabel4);

        lblTrans.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTrans.setText(" ");
        pnlEstadistica.add(lblTrans);

        jLabel5.setText("No transgenicos:");
        pnlEstadistica.add(jLabel5);

        lblNoTrans.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoTrans.setText(" ");
        pnlEstadistica.add(lblNoTrans);

        jLabel6.setText("Todos");
        pnlEstadistica.add(jLabel6);

        lblTodos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTodos.setText(" ");
        pnlEstadistica.add(lblTodos);

        getContentPane().add(pnlEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 280, 100));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 153));

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(255, 255, 153));
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane3.setViewportView(txtArea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 300, 110));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Descripcíon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        pnlTransONo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlTransONoLayout = new javax.swing.GroupLayout(pnlTransONo);
        pnlTransONo.setLayout(pnlTransONoLayout);
        pnlTransONoLayout.setHorizontalGroup(
            pnlTransONoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        pnlTransONoLayout.setVerticalGroup(
            pnlTransONoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        getContentPane().add(pnlTransONo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Los alimentos transgenicos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void chkbxTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxTransActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarFormulario();
        cargarDataTablas();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnListadoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoCompletoActionPerformed
        cargarDataTablas();
        txtBuscar.setText(null);
    }//GEN-LAST:event_btnListadoCompletoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            data.addFood(rescatarDatos(true));
            limpiarFormulario();
            statisticsUpdate();
            refrescar();
            btnActualizar.setEnabled(false);
            btnRegistrar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "El registro nuevo fué metido al base de datos",
                    "Informacíon", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String text = txtBuscar.getText();
            ArrayList<Food> lista = data.searchFood(text);
            TMFood model = new TMFood(lista, data);
            int numResults = lista.size();
            if(numResults == 0){
                JOptionPane.showMessageDialog(null, "Los alimentos no se encontraron",
                    "Informacíon", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Tenemos " + numResults + " resultados",
                    "Informacíon", JOptionPane.INFORMATION_MESSAGE);
            }
            tablaBuscedas.setModel(model);
            limpiarFormulario();
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaBuscedasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscedasMouseReleased
        int row = evt.getY() / tablaBuscedas.getRowHeight();
        int col = tablaBuscedas.getColumnModel().getColumnIndexAtX(evt.getX());        
        if(evt.getClickCount() == 1){
            TMFood model = (TMFood)tablaBuscedas.getModel();
            Food f = model.getFood(row);
            lblID.setText(String.valueOf(f.getId()));
            txtNombre.setText(f.getName());
            chkbxTrans.setSelected(f.isTransgenic());
            cbxMarca.setSelectedItem(cbxMarca.getItemAt(f.getBrand() - 1));
            btnActualizar.setEnabled(true);
            btnRegistrar.setEnabled(false);
            btnEliminar.setEnabled(true);
            if(row >= 0 && row < tablaBuscedas.getRowCount() && col < tablaBuscedas.getColumnCount()){
                Object value = tablaBuscedas.getValueAt(row, col);
                txtArea.setText("");
                pnlTransONo.setBackground(Color.WHITE);
                if(value instanceof JButton){
                    JButton btn = (JButton)value;
                    if(btn.getName().equalsIgnoreCase("visualizar")){
                        txtArea.setText("");
                        txtArea.append("ID: " + f.getId() + "\n");
                        txtArea.append("Nombre: " + f.getName() + "\n");
                        txtArea.append("Marca :" + f.getBrand() + "\n");
                        if(f.isTransgenic()){
                            txtArea.append("éste alimento es transgenic\n");
                            pnlTransONo.setBackground(Color.RED);
                        } else {
                            txtArea.append("éste alimento no es transgenic\n");
                            pnlTransONo.setBackground(Color.GREEN);
                        }
                    }
                } else if(value instanceof Boolean){
                    chkbxTrans.setSelected((Boolean)value);
                    btnActualizar.doClick();
                }
            }
        } 
    }//GEN-LAST:event_tablaBuscedasMouseReleased

    private void tablaTransgenicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTransgenicosMouseClicked

    }//GEN-LAST:event_tablaTransgenicosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            data.updateFood(rescatarDatos(false));
            limpiarFormulario();
            statisticsUpdate();
            btnActualizar.setEnabled(false);
            btnRegistrar.setEnabled(true);
            refrescar();
            JOptionPane.showMessageDialog(null, "El registro elegido fué modificado",
                    "Informacíon", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            data.deleteFood(Integer.parseInt(lblID.getText()));
            refrescar();
            btnEliminar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "El registro elegido fué eliminado",
                    "Informacíon", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaTransgenicosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTransgenicosMouseReleased
        if (evt.getClickCount() == 1) {
            int fila = tablaTransgenicos.getSelectedRow();
            TMTransFood modelo = (TMTransFood) tablaTransgenicos.getModel();
            Food comida = modelo.getFood(fila);
            lblID.setText(String.valueOf(comida.getId()));
            txtNombre.setText(comida.getName());
            chkbxTrans.setSelected(comida.isTransgenic());
            cbxMarca.setSelectedItem(comida.getBrand());
            pnlTransONo.setBackground(Color.RED);
            btnActualizar.setEnabled(true);
            btnRegistrar.setEnabled(false);
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_tablaTransgenicosMouseReleased

    private void limpiarFormulario(){
        lblID.setText(null);
        txtNombre.setText(null);
        txtNombre.requestFocus();
        txtBuscar.setText(null);
        cbxMarca.setSelectedIndex(0);
        chkbxTrans.setSelected(false);
        txtArea.setText("");
        pnlTransONo.setBackground(Color.WHITE);
        btnActualizar.setEnabled(false);
        btnRegistrar.setEnabled(true); 
        btnEliminar.setEnabled(false);
    }
    
    private Food rescatarDatos(boolean isNewRegister){
        String name = txtNombre.getText();
        int brand = ((Brand)cbxMarca.getSelectedItem()).getId();
        boolean transgenic = chkbxTrans.isSelected();
        Food newFood;
        if(isNewRegister)
        {
            newFood = new Food(name, brand, transgenic);
        } else {
            int id = Integer.valueOf(lblID.getText());
            newFood = new Food(id, name, brand, transgenic); 
        }
        return newFood;
    }
    
    private void statisticsUpdate(){
        try {
            int total = data.getFoodCount();
            int numTrans = data.getFoodCount(Food.TRANSGENIC);
            int numNoTrans = data.getFoodCount(!Food.TRANSGENIC);
            lblTrans.setText(String.valueOf(numTrans));
            lblNoTrans.setText(String.valueOf(numNoTrans));
            lblTodos.setText(String.valueOf(total));
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarDataTablas(){
        try {
            //La tabla que muestra listado de alimentos completo y por la cual 
            //podemos buscar alimento por su nombre o marca 
            tablaBuscedas.setDefaultRenderer(Object.class, new Renderer());
            ArrayList<Brand> brands = data.getBrandList();
            ArrayList<Food> lista = data.getFoodList();
            TMFood model = new TMFood(lista, data);
            tablaBuscedas.setModel(model);
            //La table que contiene solo los productos transgenicos
            ArrayList<Food> listaTrans = data.getFoodList(true);
            TMTransFood modelTrans = new TMTransFood(listaTrans, data);
            tablaTransgenicos.setModel(modelTrans);
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarMarcasAlComboBox() throws SQLException{
            if(cbxMarca.getItemCount() > 0){
                cbxMarca.removeAllItems();
            }
            ArrayList<Brand> brands = data.getBrandList();
            for(Brand b: brands){
                cbxMarca.addItem(b);
            }
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
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    
    private void refrescar(){
        try {
            cargarDataTablas();
            cargarMarcasAlComboBox();
            statisticsUpdate();
            limpiarFormulario();
        } catch (SQLException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListadoCompleto;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JComboBox cbxMarca;
    private javax.swing.JCheckBox chkbxTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNoTrans;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JPanel pnlAlimento;
    private javax.swing.JPanel pnlEstadistica;
    private javax.swing.JPanel pnlTransONo;
    private javax.swing.JTable tablaBuscedas;
    private javax.swing.JTable tablaTransgenicos;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
