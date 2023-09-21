/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Televisao;
import com.mycompany.modelo.VideoGame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthur.7923
 */
public class Listagem extends javax.swing.JFrame {

    /**
     * Creates new form Listagem
     */
    public Listagem() {
        initComponents();
        
        listarTodos();
    }

    public void listarTodos(){
        
        
      if(!ControleSistema.produtos.isEmpty()){

        DefaultTableModel defaultTableModel = new DefaultTableModel();
        
        defaultTableModel.addColumn("Informações");
        defaultTableModel.addColumn("Categoria");
        
        tableListagem.setModel(defaultTableModel);
        
        defaultTableModel.setRowCount(0);
        for(int i = 0; i< ControleSistema.produtos.size(); i++) {
            Object[] linha = new Object[defaultTableModel.getColumnCount()];
            defaultTableModel.addRow(linha);
            
            if(ControleSistema.produtos.get(i)instanceof Computador){
                tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).toString(), i, 0);
                tableListagem.setValueAt("Computador", i, 1);
                
            } else if(ControleSistema.produtos.get(i) instanceof VideoGame) {
                tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).toString(), i, 0);
                tableListagem.setValueAt("Video-game", i, 1);
                
            } else if(ControleSistema.produtos.get(i) instanceof Televisao) {
                tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).toString(), i, 0);
                tableListagem.setValueAt("Televisao", i, 1);
            }
        }    
      }
    }
    
    public void listarComputador(){
        if(!ControleSistema.produtos.isEmpty()) {
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Memória Ram: ");
            defaultTableModel.addColumn("Processador: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            
            for(int i = 0; i< ControleSistema.produtos.size(); i++) {
                if(ControleSistema.produtos.get(i) instanceof Computador) {
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    
                    
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getMemoriaRam(), linhaCont, 2);
                    tableListagem.setValueAt(((Computador)ControleSistema.produtos.get(i)).getProcessador(), linhaCont, 3);
                    
                    linhaCont++;
                }
            }
        }
    }
    
    public void listarVideoGame(){
        if(!ControleSistema.produtos.isEmpty()) {
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Plataforma: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            
            for(int i = 0; i< ControleSistema.produtos.size(); i++) {
                if(ControleSistema.produtos.get(i) instanceof VideoGame) {
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((VideoGame)ControleSistema.produtos.get(i)).getPlataforma(), linhaCont, 2);
                    
                    linhaCont++;
                }
            }
        }
    }
    
    public void listarTelevisao(){
        if(!ControleSistema.produtos.isEmpty()) {
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            
            defaultTableModel.addColumn("Nome: ");
            defaultTableModel.addColumn("Preço: ");
            defaultTableModel.addColumn("Polegadas: ");
            defaultTableModel.addColumn("Resolução: ");
            
            tableListagem.setModel(defaultTableModel);
            
            defaultTableModel.setRowCount(0);
            int linhaCont = 0;
            
            for(int i = 0; i< ControleSistema.produtos.size(); i++) {
                if(ControleSistema.produtos.get(i) instanceof Televisao) {
                    Object[] linha = new Object[defaultTableModel.getRowCount()];
                    defaultTableModel.addRow(linha);
                    
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getNome(), linhaCont, 0);
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getPreco(), linhaCont, 1);
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getPolegadas(), linhaCont, 2);
                    tableListagem.setValueAt(((Televisao)ControleSistema.produtos.get(i)).getResolucao(), linhaCont, 3);
                    
                    linhaCont++;
                }
            }
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

        cbCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListagem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem de Produtos");

        cbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Computador", "Video-game", "Televisao" }));
        cbCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriasItemStateChanged(evt);
            }
        });

        tableListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Memoria Ram", "Processador"
            }
        ));
        jScrollPane1.setViewportView(tableListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriasItemStateChanged
        switch(cbCategorias.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarComputador();
                break;
            case 2:
                listarVideoGame();
                break;
            case 3:
                listarTelevisao();
                break;
        }
    }//GEN-LAST:event_cbCategoriasItemStateChanged

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
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListagem;
    // End of variables declaration//GEN-END:variables
}
