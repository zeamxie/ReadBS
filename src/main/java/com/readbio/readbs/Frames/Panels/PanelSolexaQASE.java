/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.readbio.readbs.Frames.Panels;

import com.readbio.readbs.pipeline.CallSolexaQA;
import com.readbio.readbs.pipeline.ProcessWorker;
import com.readbio.readbs.pipeline.SolexaQACMD;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Shaojun
 */
public class PanelSolexaQASE extends javax.swing.JPanel {

    private String projectDir = null;
   
    /**
     * Creates new form PanelSolexaQASE
     * @param proDir
     * @throws java.net.URISyntaxException
     */
    public PanelSolexaQASE(String proDir) throws URISyntaxException, IOException {
        initComponents();
        this.setProjectDir(proDir);
        System.out.println("XXX:" + this.getProjectDir() + ". Code in" + this.getClass().getName());
    }

    public PanelSolexaQASE() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanelDynamicTrim = new javax.swing.JPanel();
        jTxtSampleName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextRead = new javax.swing.JTextField();
        jButtonChooseRead1 = new javax.swing.JButton();
        jButtonTrimReads = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTxtLengthCutoff = new javax.swing.JTextField();
        jLabProbCut = new javax.swing.JLabel();
        jTxtProbCutCutoff = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtOutMessage = new javax.swing.JTextArea();
        jProgressBar = new javax.swing.JProgressBar();

        jPasswordField1.setText("jPasswordField1");

        jPanelDynamicTrim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "DynamicTrim Parameter"));
        jPanelDynamicTrim.setToolTipText("");
        jPanelDynamicTrim.setVerifyInputWhenFocusTarget(false);

        jTxtSampleName.setText("test");

        jLabel1.setText("Sample Name:");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jTextRead.setText("/scratch/conte/x/xie186/zhulab/JavaApp/ReadBSApp/test.fq");
        jTextRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextReadActionPerformed(evt);
            }
        });

        jButtonChooseRead1.setText("Choose Read");
        jButtonChooseRead1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseRead1ActionPerformed(evt);
            }
        });

        jButtonTrimReads.setText("SolexaQA");
        jButtonTrimReads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrimReadsActionPerformed(evt);
            }
        });

        jLabel3.setText("Length Cutoff: ");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jTxtLengthCutoff.setText("50");

        jLabProbCut.setText("Probability Cutoff: ");
        jLabProbCut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jTxtProbCutCutoff.setText("0.05");

        javax.swing.GroupLayout jPanelDynamicTrimLayout = new javax.swing.GroupLayout(jPanelDynamicTrim);
        jPanelDynamicTrim.setLayout(jPanelDynamicTrimLayout);
        jPanelDynamicTrimLayout.setHorizontalGroup(
            jPanelDynamicTrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDynamicTrimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonTrimReads))
            .addGroup(jPanelDynamicTrimLayout.createSequentialGroup()
                .addComponent(jButtonChooseRead1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextRead, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
            .addGroup(jPanelDynamicTrimLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtSampleName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtLengthCutoff, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabProbCut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtProbCutCutoff, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelDynamicTrimLayout.setVerticalGroup(
            jPanelDynamicTrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDynamicTrimLayout.createSequentialGroup()
                .addGroup(jPanelDynamicTrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtSampleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtLengthCutoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabProbCut)
                    .addComponent(jTxtProbCutCutoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDynamicTrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChooseRead1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTrimReads)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTxtOutMessage.setColumns(20);
        jTxtOutMessage.setRows(5);
        jTxtOutMessage.setAutoscrolls(true);
        jScrollPane1.setViewportView(jTxtOutMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDynamicTrim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDynamicTrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTrimReadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrimReadsActionPerformed
        String sampleName = jTxtSampleName.getText();
        System.out.println("Sample Name is:" + sampleName);
        SolexaQACMD solexaQACMD = null;
        try {
            solexaQACMD = new SolexaQACMD(projectDir);
        } catch (IOException ex) {
            Logger.getLogger(PanelSolexaQASE.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String[] commandLine = solexaQACMD.getDynamicTrimCMD(jTextRead.getText(),
                    jTxtSampleName.getText(),
                    jTxtProbCutCutoff.getText());
            new ProcessWorker(commandLine, jTxtOutMessage, jProgressBar, jButtonTrimReads).execute();
        } catch (IOException ex) {
            Logger.getLogger(PanelSolexaQASE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(PanelSolexaQASE.class.getName()).log(Level.SEVERE, null, ex);
        }           
        
    }//GEN-LAST:event_jButtonTrimReadsActionPerformed

    private void jButtonChooseRead1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseRead1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("fq.gz", "fastq.gz");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        jTextRead.setText(filename);
    }//GEN-LAST:event_jButtonChooseRead1ActionPerformed

    private void jTextReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextReadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextReadActionPerformed

    public void setProjectDir(String proDir) throws URISyntaxException, IOException{
        projectDir = proDir;
    }
    
    public String getProjectDir() throws URISyntaxException, IOException{
        return projectDir ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChooseRead1;
    private javax.swing.JButton jButtonTrimReads;
    private javax.swing.JLabel jLabProbCut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelDynamicTrim;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextRead;
    private javax.swing.JTextField jTxtLengthCutoff;
    private javax.swing.JTextArea jTxtOutMessage;
    private javax.swing.JTextField jTxtProbCutCutoff;
    private javax.swing.JTextField jTxtSampleName;
    // End of variables declaration//GEN-END:variables
}
