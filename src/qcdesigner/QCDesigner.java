/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcdesigner;

import QCAlgorithm.QCAlgorithm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author chris
 */
public class QCDesigner extends javax.swing.JFrame {

    String currentFilename = "Unknown.qcd";
    File currentFile = null;
    ViewManager theViewManager;
    /**
     * Creates new form QCDesigner
     */
    public QCDesigner() {
        initComponents();
        ImageIcon ii = new ImageIcon("/home/chris/NetBeansProjects/QCDesigner/JQD.png");
        this.setIconImage(ii.getImage());

        qCDesignerPanel1.setHelpTextArea(jTextAreaHelp);
        qCDesignerPanel1.setOutputTextArea(jTextAreaOutput);
        qCDesignerPanel1.grabFocus();
        theViewManager.getTheInstance().register(qCDesignerPanel1);
        theViewManager.getTheInstance().register(jTextAreaHelp);
        theViewManager.getTheInstance().register(jTextAreaOutput);
        theViewManager.getTheInstance().update();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        qCDesignerPanel1 = new qcdesigner.QCDesignerPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHelp = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaPythonOutput = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonP3 = new javax.swing.JButton();
        jButtonP4 = new javax.swing.JButton();
        jButtonP5 = new javax.swing.JButton();
        jButtonP6 = new javax.swing.JButton();
        jButtonP7 = new javax.swing.JButton();
        jButtonP8 = new javax.swing.JButton();
        jButtonP9 = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        colorsMenuItem = new javax.swing.JMenuItem();
        gatesMenu = new javax.swing.JMenu();
        XGateMenuItem = new javax.swing.JMenuItem();
        YGateMenuItem = new javax.swing.JMenuItem();
        ZGateMenuItem = new javax.swing.JMenuItem();
        SGateMenuItem = new javax.swing.JMenuItem();
        TGateMenuItem = new javax.swing.JMenuItem();
        Phase3MenuItem = new javax.swing.JMenuItem();
        Phase4MenuItem = new javax.swing.JMenuItem();
        Phase5MenuItem = new javax.swing.JMenuItem();
        Phase6MenuItem = new javax.swing.JMenuItem();
        Phase7MenuItem = new javax.swing.JMenuItem();
        Phase8MenuItem = new javax.swing.JMenuItem();
        Phase9MenuItem = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JQuantumDesigner (Experimental)");

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane2.setResizeWeight(1.0);

        jSplitPane1.setResizeWeight(0.9);

        qCDesignerPanel1.setMinimumSize(new java.awt.Dimension(30000, 4000));
        qCDesignerPanel1.setnQubits(8);

        javax.swing.GroupLayout qCDesignerPanel1Layout = new javax.swing.GroupLayout(qCDesignerPanel1);
        qCDesignerPanel1.setLayout(qCDesignerPanel1Layout);
        qCDesignerPanel1Layout.setHorizontalGroup(
            qCDesignerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        qCDesignerPanel1Layout.setVerticalGroup(
            qCDesignerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4000, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(qCDesignerPanel1);

        jSplitPane1.setLeftComponent(jScrollPane3);

        jTextAreaHelp.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaHelp.setColumns(20);
        jTextAreaHelp.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaHelp.setForeground(new java.awt.Color(51, 255, 255));
        jTextAreaHelp.setRows(5);
        jTextAreaHelp.setText("Press F1 to cycle through help topics");
        jTextAreaHelp.setFocusable(false);
        jTextAreaHelp.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        jScrollPane1.setViewportView(jTextAreaHelp);

        jTabbedPane2.addTab("Help", jScrollPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jTabbedPane2.addTab("Inspector", jScrollPane5);

        jSplitPane1.setRightComponent(jTabbedPane2);

        jSplitPane2.setTopComponent(jSplitPane1);

        jTextAreaOutput.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setForeground(new java.awt.Color(51, 255, 255));
        jTextAreaOutput.setLineWrap(true);
        jTextAreaOutput.setRows(5);
        jTextAreaOutput.setMaximumSize(new java.awt.Dimension(2147483647, 100));
        jScrollPane2.setViewportView(jTextAreaOutput);

        jTabbedPane1.addTab("Matlab Output", jScrollPane2);

        jTextAreaPythonOutput.setColumns(20);
        jTextAreaPythonOutput.setRows(5);
        jScrollPane4.setViewportView(jTextAreaPythonOutput);

        jTabbedPane1.addTab("Python Output", jScrollPane4);

        jSplitPane2.setRightComponent(jTabbedPane1);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);

        jButtonX.setText("X");
        jButtonX.setFocusable(false);
        jButtonX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonX.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonX.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonX.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonX);

        jButtonY.setText("Y");
        jButtonY.setFocusable(false);
        jButtonY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonY.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonY.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonY.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonY.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonY);

        jButtonZ.setText("Z");
        jButtonZ.setFocusable(false);
        jButtonZ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonZ.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonZ.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonZ.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonZ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonZ);

        jButtonW.setText("W");
        jButtonW.setFocusable(false);
        jButtonW.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonW.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonW.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonW.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonW.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonW);

        jButtonH.setText("H");
        jButtonH.setFocusable(false);
        jButtonH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonH.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonH.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonH.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonH);

        jButtonS.setText("S");
        jButtonS.setFocusable(false);
        jButtonS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonS.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonS.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonS.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonS);

        jButtonT.setText("T");
        jButtonT.setFocusable(false);
        jButtonT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonT.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonT.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonT.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonT);

        jButtonP3.setText("3");
        jButtonP3.setFocusable(false);
        jButtonP3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP3.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP3.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP3.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP3);

        jButtonP4.setText("4");
        jButtonP4.setFocusable(false);
        jButtonP4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP4.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP4.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP4.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP4);

        jButtonP5.setText("5");
        jButtonP5.setFocusable(false);
        jButtonP5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP5.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP5.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP5.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP5);

        jButtonP6.setText("6");
        jButtonP6.setFocusable(false);
        jButtonP6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP6.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP6.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP6.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP6);

        jButtonP7.setText("7");
        jButtonP7.setFocusable(false);
        jButtonP7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP7.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP7.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP7.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonP7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonP7);

        jButtonP8.setText("8");
        jButtonP8.setFocusable(false);
        jButtonP8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP8.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP8.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP8.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP8);

        jButtonP9.setText("9");
        jButtonP9.setFocusable(false);
        jButtonP9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP9.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP9.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP9.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP9);

        jButtonP.setText("P");
        jButtonP.setFocusable(false);
        jButtonP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonP.setMaximumSize(new java.awt.Dimension(30, 30));
        jButtonP.setMinimumSize(new java.awt.Dimension(30, 30));
        jButtonP.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonP);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        cutMenuItem.setEnabled(false);
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        copyMenuItem.setEnabled(false);
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        pasteMenuItem.setEnabled(false);
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        deleteMenuItem.setEnabled(false);
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        viewMenu.setText("View");

        colorsMenuItem.setText("Colors");
        colorsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorsMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(colorsMenuItem);

        menuBar.add(viewMenu);

        gatesMenu.setText("Gates");

        XGateMenuItem.setText("Pauli X");
        gatesMenu.add(XGateMenuItem);

        YGateMenuItem.setText("Pauli Y");
        gatesMenu.add(YGateMenuItem);

        ZGateMenuItem.setText("Pauli Z");
        gatesMenu.add(ZGateMenuItem);

        SGateMenuItem.setText("S (pi/2 phase)");
        gatesMenu.add(SGateMenuItem);

        TGateMenuItem.setText("T (pi/4 phase)");
        gatesMenu.add(TGateMenuItem);

        Phase3MenuItem.setText("pi/2^3 phase");
        gatesMenu.add(Phase3MenuItem);

        Phase4MenuItem.setText("pi/2^4 phase");
        gatesMenu.add(Phase4MenuItem);

        Phase5MenuItem.setText("pi/2^5 phase");
        gatesMenu.add(Phase5MenuItem);

        Phase6MenuItem.setText("pi/2^6 phase");
        gatesMenu.add(Phase6MenuItem);

        Phase7MenuItem.setText("pi/2^7 phase");
        gatesMenu.add(Phase7MenuItem);

        Phase8MenuItem.setText("pi/2^8 phase");
        gatesMenu.add(Phase8MenuItem);

        Phase9MenuItem.setText("pi/2^9 phase");
        gatesMenu.add(Phase9MenuItem);

        jMenuItem12.setText("jMenuItem1");
        gatesMenu.add(jMenuItem12);

        jMenuItem13.setText("jMenuItem1");
        gatesMenu.add(jMenuItem13);

        jMenuItem14.setText("jMenuItem1");
        gatesMenu.add(jMenuItem14);

        menuBar.add(gatesMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showDialog(this, "Open");
        File f = fc.getSelectedFile();

        QCAlgorithm e = null;
        try {
            FileInputStream fileIn = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (QCAlgorithm) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        qCDesignerPanel1.setTheAlgorithm(e);
        currentFile=f;
        this.setTitle(currentFile.getName());
        System.out.println("Open");
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        if (currentFile != null) {
            try {
                FileOutputStream fileOut
                        = new FileOutputStream(currentFile);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(qCDesignerPanel1.getTheAlgorithm());
                out.close();
                fileOut.close();
                System.out.printf("Serialized data is saved in /tmp/employee.ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        }else{
            saveAsMenuItemActionPerformed(evt);
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc;
        if(currentFile!=null)
            fc = new JFileChooser(currentFile);
        else{
            fc = new JFileChooser();        
        }
        fc.showDialog(this, "Save As");
        File f = fc.getSelectedFile();
        
        try {
            FileOutputStream fileOut
                    = new FileOutputStream(f);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(qCDesignerPanel1.getTheAlgorithm());
            out.close();
            fileOut.close();
            currentFile=f;
            this.setTitle(currentFile.getName());
            System.out.printf("Serialized data is saved in "+currentFile.getName());
        } catch (IOException i) {
            i.printStackTrace();
        }

    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jButtonP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonP7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonP7ActionPerformed

    private void colorsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorsMenuItemActionPerformed
        // TODO add your handling code here:
        QCColorDialog cd = new QCColorDialog(this, rootPaneCheckingEnabled);
        cd.setVisible(true);
    }//GEN-LAST:event_colorsMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(QCDesigner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QCDesigner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QCDesigner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QCDesigner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QCDesigner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Phase3MenuItem;
    private javax.swing.JMenuItem Phase4MenuItem;
    private javax.swing.JMenuItem Phase5MenuItem;
    private javax.swing.JMenuItem Phase6MenuItem;
    private javax.swing.JMenuItem Phase7MenuItem;
    private javax.swing.JMenuItem Phase8MenuItem;
    private javax.swing.JMenuItem Phase9MenuItem;
    private javax.swing.JMenuItem SGateMenuItem;
    private javax.swing.JMenuItem TGateMenuItem;
    private javax.swing.JMenuItem XGateMenuItem;
    private javax.swing.JMenuItem YGateMenuItem;
    private javax.swing.JMenuItem ZGateMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem colorsMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gatesMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonP3;
    private javax.swing.JButton jButtonP4;
    private javax.swing.JButton jButtonP5;
    private javax.swing.JButton jButtonP6;
    private javax.swing.JButton jButtonP7;
    private javax.swing.JButton jButtonP8;
    private javax.swing.JButton jButtonP9;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaHelp;
    private javax.swing.JTextArea jTextAreaOutput;
    private javax.swing.JTextArea jTextAreaPythonOutput;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private qcdesigner.QCDesignerPanel qCDesignerPanel1;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables

}
