/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Control_Libros;
import Modelo.Libros;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mark-
 */
public class FRM_Libros extends javax.swing.JInternalFrame {
    int filaLibros=-1;    
    private int codLibro;
    Control_Libros crl=new Control_Libros();
    DefaultTableModel tabla=new DefaultTableModel();
    
    public void LlenarTabla(String dato){
    tabla.setColumnCount(0);
        tabla.addColumn("Codigo");
        tabla.addColumn("ISBN");
        tabla.addColumn("Titulo");
        tabla.addColumn("N° paginas");
        List<Libros> lista=crl.llenarTablaL(dato);
        tabla.setNumRows(lista.size());
        registros.setText("CANTIDAD DE LIBROS EN ARRIENDO= "+lista.size());
        for (int i = 0; i < lista.size(); i++) {
            tabla.setValueAt(lista.get(i).getCod_libro(), i, 0);
            tabla.setValueAt(lista.get(i).getIsbn_libro(), i, 1);
            tabla.setValueAt(lista.get(i).getTitulo_libro(), i, 2);
            tabla.setValueAt(lista.get(i).getPag_libro(), i, 3);
        }
        TablaLibros.setModel(tabla);
        
        TablaLibros.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaLibros.getColumnModel().getColumn(0).setMinWidth(0);
        TablaLibros.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    
    
    public FRM_Libros() {
        initComponents();
        Agregar_A_Stock.setToolTipText("Cambiar a Stock");
        LlenarTabla("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        registros = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        Agregar_A_Stock = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);

        jToolBar2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.setBorder(null);
        jToolBar2.setFloatable(false);
        jToolBar2.setForeground(new java.awt.Color(102, 102, 102));
        jToolBar2.setRollover(true);

        registros.setBackground(new java.awt.Color(0, 0, 0));
        registros.setForeground(new java.awt.Color(0, 0, 0));
        registros.setText("jLabel1");
        jToolBar2.add(registros);

        getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        Agregar_A_Stock.setText("Stock");
        Agregar_A_Stock.setFocusable(false);
        Agregar_A_Stock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Agregar_A_Stock.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Agregar_A_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_A_StockActionPerformed(evt);
            }
        });
        jToolBar1.add(Agregar_A_Stock);
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator2);

        jLabel1.setText("                                               ");
        jToolBar1.add(jLabel1);

        Buscador.setBackground(new java.awt.Color(70, 110, 196));
        Buscador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Buscador.setForeground(new java.awt.Color(0, 0, 0));
        Buscador.setText("Buscador");
        Buscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jToolBar1.add(Buscador);
        jToolBar1.add(jSeparator3);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_END);

        TablaLibros.setBackground(new java.awt.Color(204, 204, 204));
        TablaLibros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TablaLibros.setForeground(new java.awt.Color(0, 0, 0));
        TablaLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaLibros.setRowHeight(25);
        TablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaLibros);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMouseClicked
        Buscador.setText("");
    }//GEN-LAST:event_BuscadorMouseClicked

    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped
        LlenarTabla(Buscador.getText());
    }//GEN-LAST:event_BuscadorKeyTyped

    private void TablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaLibrosMouseClicked
        filaLibros=TablaLibros.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TablaLibrosMouseClicked

    private void Agregar_A_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_A_StockActionPerformed
        if (filaLibros>-1) {
            codLibro=Integer.parseInt(String.valueOf(TablaLibros.getValueAt(filaLibros, 0)));
            crl.CambiarAStock(codLibro);
        } else {
           JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UNA FILA","ADVERTENCIA",JOptionPane.OK_OPTION+JOptionPane.WARNING_MESSAGE);
        }
        LlenarTabla("");
    }//GEN-LAST:event_Agregar_A_StockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_A_Stock;
    private javax.swing.JTextField Buscador;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel registros;
    // End of variables declaration//GEN-END:variables
}
