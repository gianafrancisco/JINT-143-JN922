/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.forms;

import biblioteca.cats.Categoria;
import biblioteca.persistencia.Archivo;
import ui.models.ListaModeloCategorias;
import ui.models.ModeloItem;

/**
 *
 * @author francisco
 */
public class MainWindows extends javax.swing.JFrame {

    /**
     * Creates new form MainWindows
     */
    public MainWindows() {
        initComponents();
        
        Archivo.cargar();
        cargarCategorias();
        actualizar();
        
    }

    private void actualizar() {
        Categoria categoriaSeleccionada=(Categoria)lstCategorias.getSelectedValue();
        if(categoriaSeleccionada == null){
            tblItems.setModel(new ModeloItem(Archivo.getDatos().getItems().filtrar(txtBuscar.getText())));
        }else{
            tblItems.setModel(new ModeloItem(categoriaSeleccionada.filtrar(txtBuscar.getText())));
        }
    }

    private void cargarCategorias() {
        lstCategorias.setModel(new ListaModeloCategorias());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtAgregarCategoria = new javax.swing.JTextField();
        btnAgregarCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCategorias = new javax.swing.JList();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelLibro = new javax.swing.JPanel();
        jPanelRevista = new javax.swing.JPanel();
        jPanelAudio = new javax.swing.JPanel();
        jPanelDVD = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        lblBuscar.setText("Buscar:  ");
        jPanel4.add(lblBuscar);

        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel4.add(txtBuscar);

        jToolBar1.add(jPanel4);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        jSplitPane1.setResizeWeight(1.0);

        txtAgregarCategoria.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarCategoriaActionPerformed(evt);
            }
        });

        btnAgregarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/img/new_category.png"))); // NOI18N
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/img/delete.png"))); // NOI18N
        btnEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtAgregarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCategoria)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAgregarCategoria)
            .addComponent(btnEliminarCategoria)
        );

        lstCategorias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCategorias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCategoriasValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstCategorias);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblItems);

        jSplitPane2.setTopComponent(jScrollPane2);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanelLibro.setPreferredSize(new java.awt.Dimension(892, 150));

        javax.swing.GroupLayout jPanelLibroLayout = new javax.swing.GroupLayout(jPanelLibro);
        jPanelLibro.setLayout(jPanelLibroLayout);
        jPanelLibroLayout.setHorizontalGroup(
            jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanelLibroLayout.setVerticalGroup(
            jPanelLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Libro", jPanelLibro);

        jPanelRevista.setPreferredSize(new java.awt.Dimension(892, 150));

        javax.swing.GroupLayout jPanelRevistaLayout = new javax.swing.GroupLayout(jPanelRevista);
        jPanelRevista.setLayout(jPanelRevistaLayout);
        jPanelRevistaLayout.setHorizontalGroup(
            jPanelRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanelRevistaLayout.setVerticalGroup(
            jPanelRevistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Revista", jPanelRevista);

        jPanelAudio.setPreferredSize(new java.awt.Dimension(892, 150));

        javax.swing.GroupLayout jPanelAudioLayout = new javax.swing.GroupLayout(jPanelAudio);
        jPanelAudio.setLayout(jPanelAudioLayout);
        jPanelAudioLayout.setHorizontalGroup(
            jPanelAudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanelAudioLayout.setVerticalGroup(
            jPanelAudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Audio", jPanelAudio);

        jPanelDVD.setPreferredSize(new java.awt.Dimension(892, 150));

        javax.swing.GroupLayout jPanelDVDLayout = new javax.swing.GroupLayout(jPanelDVD);
        jPanelDVD.setLayout(jPanelDVDLayout);
        jPanelDVDLayout.setHorizontalGroup(
            jPanelDVDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanelDVDLayout.setVerticalGroup(
            jPanelDVDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("DVD", jPanelDVD);

        jPanel1.add(jTabbedPane1);

        jSplitPane2.setBottomComponent(jPanel1);

        jSplitPane1.setRightComponent(jSplitPane2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void lstCategoriasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCategoriasValueChanged
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_lstCategoriasValueChanged

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        // TODO add your handling code here:
        Categoria catEliminar = (Categoria)lstCategorias.getSelectedValue();
        if(catEliminar != null){
            Archivo.getDatos().getCategorias().remove(catEliminar);
            Archivo.guardar();
            cargarCategorias();
        }
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        // TODO add your handling code here:
        if(!txtAgregarCategoria.getText().equals("") && Archivo.getDatos().getCategorias().filtrar(txtAgregarCategoria.getText()).size() == 0){
            Archivo.getDatos().getCategorias().add(new Categoria(txtAgregarCategoria.getText()));
            cargarCategorias();
            Archivo.guardar();
        }
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void txtAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAudio;
    private javax.swing.JPanel jPanelDVD;
    private javax.swing.JPanel jPanelLibro;
    private javax.swing.JPanel jPanelRevista;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JList lstCategorias;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtAgregarCategoria;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}