/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Controller;
import Model.Tarifas;
import Model.Usuario;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoseM
 */
public class HistoricoAlteracoes extends javax.swing.JFrame {

    /**
     * Creates new form HistoricoAlteracoes
     */
    public HistoricoAlteracoes() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(800, 280));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 280));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alimentacao", "Alojamento", "Automovel", "Basculante", "Bus", "Combustivel", "Estivador", "Aberto/Kg", "Fechado/Kg", "Frigorifico/Kg", "Preco/KMl", "P/Motorista", "PortaContentor", "Data de Alteração"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HistoricoAlteracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoAlteracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoAlteracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoAlteracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoAlteracoes().setVisible(true);
            }
        });
    }
    
    public void preencherTabela(){
        dtm=(DefaultTableModel)jTable1.getModel();
        this.limparTabela();
        controller=new Controller<Tarifas>(Tarifas.class);
        todasTarifas=(List<Tarifas>)controller.getDados();

        for(Tarifas trf:todasTarifas){
            
            String dados[]={trf.getPrecoAliementacao()+"",trf.getPrecoAlojamento()+"",trf.getPrecoAutomovel()+"",
                trf.getPrecoBasculante()+"",trf.getPrecoBus()+"",trf.getPrecoCombustivel()+"",trf.getPrecoEstivador()+"",
                trf.getPrecoKGAberto()+"",trf.getPrecoKGFechado()+"",trf.getPrecoKGFrigorifico()+"",trf.getPrecoKM()+"",
                trf.getPrecoMotorista()+"",trf.getPrecoPassageiro()+"",trf.getDataAlteracao()+""};
            
            dtm.addRow(dados);
        }
    }
    
    public void limparTabela(){
        
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        
        System.out.println(dtm.getRowCount());
        int linhas=dtm.getRowCount();
        
        for(int i=linhas-1;i>=0;i--){
          dtm.removeRow(i);  
        }
            
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
    Controller <Tarifas>controller;
    List<Tarifas> todasTarifas;
    DefaultTableModel dtm;
}
