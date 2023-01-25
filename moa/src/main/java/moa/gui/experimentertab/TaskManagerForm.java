/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moa.gui.experimentertab;

import moa.gui.LookAndFeel;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alberto
 */
public class TaskManagerForm extends javax.swing.JPanel {

    /**
     * Creates new form TaskManagerForm
     */
    public TaskManagerForm() {
        initComponents();
    }
private static void createAndShowGUI() {

        // Create and set up the window.
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the content pane.
        JPanel panel = new TaskManagerForm();
        panel.setOpaque(true); // content panes must be opaque
        frame.setContentPane(panel);

        // Display the window.
        frame.pack();
        //frame.setSize(400, 400);
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            LookAndFeel.install();
            javax.swing.SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    createAndShowGUI();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPaneAlgorithms = new javax.swing.JScrollPane();
        jTableAlgorithms = new javax.swing.JTable();
        jScrollPaneStreams = new javax.swing.JScrollPane();
        jTableStreams = new javax.swing.JTable();
        jTextFieldTask = new javax.swing.JTextField();
        jButtonDir = new javax.swing.JButton();
        jLabelDirectory = new javax.swing.JLabel();
        jButtonDelAlgoritm = new javax.swing.JButton();
        jButtonDelStream = new javax.swing.JButton();
        jButtonAlgorithm = new javax.swing.JButton();
        jButtonStream = new javax.swing.JButton();
        jTextFieldDir = new javax.swing.JTextField();
        jButtonTask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonOpenConfig = new javax.swing.JButton();
        jButtonSaveConfig = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Config Algorithms/Data"));

        jScrollPaneAlgorithms.setBorder(javax.swing.BorderFactory.createTitledBorder("Algorithm"));

        jTableAlgorithms.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableAlgorithms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Algorithm", "Algorithm ID"
            }
        ));
        jScrollPaneAlgorithms.setViewportView(jTableAlgorithms);

        jScrollPaneStreams.setBorder(javax.swing.BorderFactory.createTitledBorder("Stram"));

        jTableStreams.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableStreams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stream", "Stream ID"
            }
        ));
        jScrollPaneStreams.setViewportView(jTableStreams);

        jTextFieldTask.setEditable(false);

        jButtonDir.setText("Browse");
        jButtonDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDirActionPerformed(evt);
            }
        });

        jLabelDirectory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDirectory.setText("Result  folder");

        jButtonDelAlgoritm.setText("Delete Algorithm");
        jButtonDelAlgoritm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelAlgoritmActionPerformed(evt);
            }
        });

        jButtonDelStream.setText("Delete Stream");
        jButtonDelStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelStreamActionPerformed(evt);
            }
        });

        jButtonAlgorithm.setText("Add Algorithm");

        jButtonStream.setText("Add Stream");

        jTextFieldDir.setEditable(false);

        jButtonTask.setText("Add Task");

        jLabel1.setText("Task");

        jButtonOpenConfig.setText("Open Experiment");

        jButtonSaveConfig.setText("Save Experiment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAlgorithm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelAlgoritm)
                                .addGap(0, 111, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneStreams, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonStream)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDelStream))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelDirectory))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDir)
                            .addComponent(jTextFieldTask))
                        .addGap(14, 14, 14)
                        .addComponent(jButtonDir)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonOpenConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSaveConfig)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonTask)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpenConfig)
                    .addComponent(jButtonSaveConfig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTask, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTask)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDirectory)
                    .addComponent(jButtonDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAlgorithms, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPaneStreams, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelStream)
                    .addComponent(jButtonDelAlgoritm)
                    .addComponent(jButtonAlgorithm)
                    .addComponent(jButtonStream)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDirActionPerformed

    }//GEN-LAST:event_jButtonDirActionPerformed

    private void jButtonDelAlgoritmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelAlgoritmActionPerformed

    }//GEN-LAST:event_jButtonDelAlgoritmActionPerformed

    private void jButtonDelStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelStreamActionPerformed

    }//GEN-LAST:event_jButtonDelStreamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlgorithm;
    private javax.swing.JButton jButtonDelAlgoritm;
    private javax.swing.JButton jButtonDelStream;
    private javax.swing.JButton jButtonDir;
    private javax.swing.JButton jButtonOpenConfig;
    private javax.swing.JButton jButtonSaveConfig;
    private javax.swing.JButton jButtonStream;
    private javax.swing.JButton jButtonTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDirectory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneAlgorithms;
    private javax.swing.JScrollPane jScrollPaneStreams;
    private javax.swing.JTable jTableAlgorithms;
    private javax.swing.JTable jTableStreams;
    private javax.swing.JTextField jTextFieldDir;
    private javax.swing.JTextField jTextFieldTask;
    // End of variables declaration//GEN-END:variables
}
