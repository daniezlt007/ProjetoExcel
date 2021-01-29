/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delta.form;

import com.delta.util.Util;
import com.delta.util.UtilNovaVersao;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;

/**
 *
 * @author 01332
 */
public class FrmGerarVersaoNova extends javax.swing.JFrame {

    /**
     * Creates new form FrmGerar
     */
    public FrmGerarVersaoNova() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelArquivoSalvar = new javax.swing.JLabel();
        jLabelPastaAserSalva = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton3Colunas = new javax.swing.JRadioButton();
        jRadioButton5Colunas = new javax.swing.JRadioButton();
        jRadioButton2Colunas = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelArquivoSalvar.setText("Arquivo para fazer a leitura...");

        jLabelPastaAserSalva.setText("Arquivo a ser gerado...");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Gerar Arquivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gerador de Arquivo para importação - (Separador \";\")");

        buttonGroup1.add(jRadioButton3Colunas);
        jRadioButton3Colunas.setText("3 Colunas - (Codigo, Descricao, Peso)");

        buttonGroup1.add(jRadioButton5Colunas);
        jRadioButton5Colunas.setText("5 Colunas");

        buttonGroup1.add(jRadioButton2Colunas);
        jRadioButton2Colunas.setText("3 Colunas - (Codigo, Ncm, Peso)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3Colunas)
                            .addComponent(jRadioButton5Colunas)
                            .addComponent(jRadioButton2Colunas)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(385, 457, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelArquivoSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPastaAserSalva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArquivoSalvar)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPastaAserSalva)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2Colunas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3Colunas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5Colunas)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String msg = abrirArquivoParaSalvar();
        if (msg.endsWith(".xls") || msg.endsWith(".xlsx")) {
            jLabelArquivoSalvar.setText(msg);
            Util.config.setUrlArquivo(msg);
            System.out.println(msg);
        } else {
            JOptionPane.showMessageDialog(null, "Arquivo Incorreto, favor selecione um arquivo no formato .XLS ou .XLSX");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String msg = pegarPastaParaSalvar();
        if (!msg.endsWith(".txt")) {
            JOptionPane.showMessageDialog(null, "Arquivo está Incorreto, favor salve o arquivo no formato .TXT");
        } else {
            jLabelPastaAserSalva.setText(msg);
            Util.config.setUrlSalvar(msg);
            System.out.println(msg);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String arquivoLeitura = Util.config.getUrlArquivo();
        String arquivoSalvar = Util.config.getUrlSalvar();

        try {
            if (arquivoLeitura == null || arquivoSalvar == null) {
                JOptionPane.showMessageDialog(null, "É necessário escolher os 2 arquivos!");
            } else {
                if (arquivoLeitura.endsWith(".xls")) {
                    if (jRadioButton2Colunas.isSelected()) {
                        UtilNovaVersao.lerArquivoXLS(Util.config.getUrlArquivo(), Util.config.getUrlSalvar(), 2);
                    }
                    if (jRadioButton3Colunas.isSelected()) {
                        UtilNovaVersao.lerArquivoXLS(Util.config.getUrlArquivo(), Util.config.getUrlSalvar(), 3);
                    }
                    if (jRadioButton5Colunas.isSelected()) {
                        UtilNovaVersao.lerArquivoXLS(Util.config.getUrlArquivo(), Util.config.getUrlSalvar(), 5);
                    }
                } else {
                    if (jRadioButton2Colunas.isSelected()) {
                        File arquivoChamados = new File(arquivoLeitura);
                        BufferedInputStream bufProdutos = new BufferedInputStream(new FileInputStream(arquivoChamados));
                        UtilNovaVersao.lerArquivoXLXS3Colunas(bufProdutos, arquivoSalvar,1);
                    }
                    if (jRadioButton3Colunas.isSelected()) {
                        File arquivoChamados = new File(arquivoLeitura);
                        BufferedInputStream bufProdutos = new BufferedInputStream(new FileInputStream(arquivoChamados));
                        UtilNovaVersao.lerArquivoXLXS3Colunas(bufProdutos, arquivoSalvar,2);
                    }
                    if (jRadioButton5Colunas.isSelected()) {
                        File arquivoChamados = new File(arquivoLeitura);
                        BufferedInputStream bufProdutos = new BufferedInputStream(new FileInputStream(arquivoChamados));
                        UtilNovaVersao.lerArquivoXLXS5Colunas(bufProdutos, arquivoSalvar);
                    }
                }
            }
        } catch (IOException | BiffException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar arquivo: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public String abrirArquivoParaSalvar() {
        JFileChooser chooserArquivo = new JFileChooser();
        int escolha = chooserArquivo.showOpenDialog(getParent());
        String arquivo = chooserArquivo.getSelectedFile().getAbsolutePath();
        return arquivo;
    }

    public String pegarPastaParaSalvar() {
        JFileChooser chooserDiretorio = new JFileChooser();
        chooserDiretorio.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooserDiretorio.showOpenDialog(getParent());
        String pasta = chooserDiretorio.getSelectedFile().getAbsolutePath();
        return pasta;
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGerarVersaoNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerarVersaoNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerarVersaoNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerarVersaoNova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmGerarVersaoNova frm = new FrmGerarVersaoNova();
                frm.setVisible(true);
                frm.setLocationRelativeTo(null);
                frm.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelArquivoSalvar;
    private javax.swing.JLabel jLabelPastaAserSalva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2Colunas;
    private javax.swing.JRadioButton jRadioButton3Colunas;
    private javax.swing.JRadioButton jRadioButton5Colunas;
    // End of variables declaration//GEN-END:variables
}
