/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.readbio.readbs.Frames;

import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.ToolTipManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Shaojun
 */
public final class FrameBismark extends javax.swing.JInternalFrame {

    
    GridBagLayout layout = new GridBagLayout();
    
    //Each internal frame comes up 30 pixels lower and to the right of the 
    //place where the previous internal frame first appeared. This functionality
    //is implemented in the MyInternalFrame class, which is the custom subclass 
    //of JInternalFrame.
    static int openFrameCount = 0;
    static final int xOffset = 10, yOffset = 10;
    private String projectDir;
    
    public FrameBismark(){
         initComponents();
    }
    
    /**
     * Creates new form FrameSolexaQA
     * @param proDir
     * @throws java.net.URISyntaxException
     * @throws java.io.IOException
     */
    public FrameBismark(String proDir) throws URISyntaxException, IOException {
        
      super("Document #" + (++openFrameCount), 
              true, //resizable
              true, //closable
              true, //maximizable
              true);//iconifiable
         initComponents();
        this.setProjectDir(proDir);
        setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonChooseRead1 = new javax.swing.JButton();
        jButtonChooseRead2 = new javax.swing.JButton();
        jTextRead1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBoxReadFormat = new javax.swing.JComboBox();
        jComboBoxReadQualFormat = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FrameBismark");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Arguments"));

        jTextField1.setText("/scratch/conte/x/xie186/data/ara/bismark_index_bowtie2");

        jButton1.setText("Genome Folder");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });

        jButtonChooseRead1.setText("Choose Read1");
        jButtonChooseRead1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseRead1ActionPerformed(evt);
            }
        });

        jButtonChooseRead2.setText("Choose Read2");

        jComboBoxReadFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fastq", "Fasta" }));

        jComboBoxReadQualFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phred33", "Phred64" }));

        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonChooseRead2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonChooseRead1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextRead1)
                    .addComponent(jTextField3)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jComboBoxReadFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxReadQualFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChooseRead1)
                    .addComponent(jTextRead1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChooseRead2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxReadFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxReadQualFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 633, 499);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setToolTipText("<html>" +
                "The path to the folder containing the unmodified reference genome" + "<br>" +
                "as well as the subfolders created by the Bismark_Genome_Preparation" + "<br>" +
                "script (/Bisulfite_Genome/CT_conversion/ and /Bisulfite_Genome/GA_conversion/)." + "<br>" +
                "Bismark expects one or more fastA files in this folder (file extension: .fa" + "<br>" +
                "or .fasta). The path can be relative or absolute." + "<br>" + "<\html>");
        ToolTipManager.sharedInstance().setDismissDelay(Integer.MAX_VALUE);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButtonChooseRead1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseRead1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Gzip File","gz");
        chooser.addChoosableFileFilter(filter);
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(null);
        File[] f = chooser.getSelectedFiles(); 
        
        //String filename = f.getAbsolutePath();
        //jTextRead1.setText(filename);
    }//GEN-LAST:event_jButtonChooseRead1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public String getProjectDir() {
        return projectDir;
    }

    private void setProjectDir(String temProjectDir) {
        projectDir = temProjectDir;
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonChooseRead1;
    private javax.swing.JButton jButtonChooseRead2;
    private javax.swing.JComboBox jComboBoxReadFormat;
    private javax.swing.JComboBox jComboBoxReadQualFormat;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextRead1;
    // End of variables declaration//GEN-END:variables
}
