/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Control_OrdenCLibro;
import Controlador.Control_OrdenDeCompra;
import Modelo.Libros;
import Modelo.OrdenC_Libros;
import Modelo.OrdenCompra;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mark-
 */
public class FRM_OrdenLibros extends javax.swing.JInternalFrame {
    Control_OrdenCLibro cro=new Control_OrdenCLibro();
    DefaultTableModel tabla =new DefaultTableModel();
    
    //llenar tabla de ordenes de compra
    public void LlenarTablaOL(String dato){
    tabla.setColumnCount(0);
        tabla.addColumn("Titulo de Libro");
        tabla.addColumn("Folio de Orden de Compra");
        tabla.addColumn("Precio");
        List<OrdenC_Libros> lista=cro.ListarOrdenClibro(dato);
        tabla.setNumRows(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            tabla.setValueAt(lista.get(i).getTitulo_libro(), i, 0);
            tabla.setValueAt(lista.get(i).getFolio_orden(), i, 1);
            tabla.setValueAt(lista.get(i).getPrecio(), i, 2);
        }
        TablarOL.setModel(tabla);//el jtable recibe lo que es la tabla. con los nombres de sus columans.
        
    }
    
    private void ComboOrdenCompra(){
       DefaultComboBoxModel combo = new DefaultComboBoxModel();
        Control_OrdenDeCompra croc=new Control_OrdenDeCompra();
        List<OrdenCompra> lista=croc.ComboBoxOrdenes();
        for(OrdenCompra O:lista){
            O = new OrdenCompra(O.getCod_orden(), O.getFolio_orden());
            combo.addElement(O);
        }
        ComboOrden.setModel(combo);
    }
    
    private void ComboLibro(){
       DefaultComboBoxModel combo = new DefaultComboBoxModel();
        Control_OrdenCLibro coli=new Control_OrdenCLibro();
        List<Libros> lista=coli.ComboBoxLibros();
        for(Libros L:lista){
            L = new Libros(L.getCod_libro(), L.getIsbn_libro(), L.getTitulo_libro());
            combo.addElement(L);
        }
        ComboLibro.setModel(combo);
    }
    public FRM_OrdenLibros() {
        initComponents();
        LlenarTablaOL("");
        ComboOrdenCompra();
        ComboLibro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelOL = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar12 = new javax.swing.JToolBar();
        Registros = new javax.swing.JLabel();
        jToolBar10 = new javax.swing.JToolBar();
        AgregarOL = new javax.swing.JButton();
        jSeparator36 = new javax.swing.JToolBar.Separator();
        jSeparator37 = new javax.swing.JToolBar.Separator();
        jLabel40 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JToolBar.Separator();
        jSeparator41 = new javax.swing.JToolBar.Separator();
        Buscador = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JToolBar.Separator();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablarOL = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        ComboLibro = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        ComboOrden = new javax.swing.JComboBox();
        GuardarIdiomaLibro1 = new javax.swing.JButton();

        PanelOL.setBackground(new java.awt.Color(153, 153, 153));
        PanelOL.setForeground(new java.awt.Color(0, 0, 0));
        PanelOL.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        PanelOL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar12.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar12.setFloatable(false);
        jToolBar12.setForeground(new java.awt.Color(204, 204, 204));
        jToolBar12.setRollover(true);

        Registros.setForeground(new java.awt.Color(0, 0, 0));
        Registros.setText("jLabel5");
        jToolBar12.add(Registros);

        jPanel1.add(jToolBar12, java.awt.BorderLayout.PAGE_START);

        jToolBar10.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar10.setFloatable(false);
        jToolBar10.setRollover(true);

        AgregarOL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/matematicas.png"))); // NOI18N
        AgregarOL.setFocusable(false);
        AgregarOL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AgregarOL.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AgregarOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarOLActionPerformed(evt);
            }
        });
        jToolBar10.add(AgregarOL);
        jToolBar10.add(jSeparator36);
        jToolBar10.add(jSeparator37);

        jLabel40.setText("                                            ");
        jToolBar10.add(jLabel40);
        jToolBar10.add(jSeparator38);
        jToolBar10.add(jSeparator41);

        Buscador.setBackground(new java.awt.Color(70, 110, 196));
        Buscador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Buscador.setForeground(new java.awt.Color(0, 0, 0));
        Buscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Buscador.setText("Buscador");
        Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscadorMouseClicked(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscadorKeyTyped(evt);
            }
        });
        jToolBar10.add(Buscador);
        jToolBar10.add(jSeparator42);

        jPanel1.add(jToolBar10, java.awt.BorderLayout.PAGE_END);

        TablarOL.setBackground(new java.awt.Color(204, 204, 204));
        TablarOL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TablarOL.setForeground(new java.awt.Color(0, 0, 0));
        TablarOL.setModel(new javax.swing.table.DefaultTableModel(
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
        TablarOL.setRowHeight(25);
        jScrollPane5.setViewportView(TablarOL);

        jPanel1.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        PanelOL.addTab("Libros en Ordenes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Titulo de Libro:");

        ComboLibro.setBackground(new java.awt.Color(70, 110, 196));
        ComboLibro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ComboLibro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Orden de Compra:");

        ComboOrden.setBackground(new java.awt.Color(70, 110, 196));
        ComboOrden.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ComboOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        GuardarIdiomaLibro1.setBackground(new java.awt.Color(204, 204, 204));
        GuardarIdiomaLibro1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GuardarIdiomaLibro1.setText("Guardar");
        GuardarIdiomaLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarIdiomaLibro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(GuardarIdiomaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(GuardarIdiomaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        PanelOL.addTab("Gestion", jPanel2);

        getContentPane().add(PanelOL, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarOLActionPerformed

        PanelOL.setSelectedIndex(1);
    }//GEN-LAST:event_AgregarOLActionPerformed

    private void BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMouseClicked
        Buscador.setText("");
    }//GEN-LAST:event_BuscadorMouseClicked

    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped
        LlenarTablaOL(Buscador.getText());
    }//GEN-LAST:event_BuscadorKeyTyped

    private void GuardarIdiomaLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarIdiomaLibro1ActionPerformed
        Libros lib=(Libros)ComboLibro.getSelectedItem();
        OrdenCompra oc=(OrdenCompra)ComboOrden.getSelectedItem();
        cro.InsertarOrdenLibro(lib.getCod_libro(), oc.getCod_orden());
        PanelOL.setSelectedIndex(0);
        LlenarTablaOL("");
        ComboLibro();
        JOptionPane.showMessageDialog(this, "OPERACION REALIZADA", "LA BIBLIOTECA",JOptionPane.OK_OPTION+JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_GuardarIdiomaLibro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarOL;
    private javax.swing.JTextField Buscador;
    private javax.swing.JComboBox ComboLibro;
    private javax.swing.JComboBox ComboOrden;
    private javax.swing.JButton GuardarIdiomaLibro1;
    private javax.swing.JTabbedPane PanelOL;
    private javax.swing.JLabel Registros;
    private javax.swing.JTable TablarOL;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar.Separator jSeparator36;
    private javax.swing.JToolBar.Separator jSeparator37;
    private javax.swing.JToolBar.Separator jSeparator38;
    private javax.swing.JToolBar.Separator jSeparator41;
    private javax.swing.JToolBar.Separator jSeparator42;
    private javax.swing.JToolBar jToolBar10;
    private javax.swing.JToolBar jToolBar12;
    // End of variables declaration//GEN-END:variables
}