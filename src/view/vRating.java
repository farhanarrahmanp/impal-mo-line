/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Farhan
 */
public class vRating extends javax.swing.JFrame {

//    private Object getlStar1;

    /**
     * Creates new form vRating
     */
    public vRating() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setSize(360, 640);
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
        bSubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logoMoLine = new javax.swing.JLabel();
        labelMoLine = new javax.swing.JLabel();
        lNamaMontir1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lBeriRating = new javax.swing.JLabel();
        lStar1 = new javax.swing.JLabel();
        lStar2 = new javax.swing.JLabel();
        lStar3 = new javax.swing.JLabel();
        lStar4 = new javax.swing.JLabel();
        lStar5 = new javax.swing.JLabel();
        lKetStar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lFeedback = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taFeedback = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        bSubmit.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bSubmit.setText("SELESAI");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        logoMoLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/logoMoLine1_3.png"))); // NOI18N

        labelMoLine.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        labelMoLine.setText("Mo-Line");

        lNamaMontir1.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lNamaMontir1.setText("Selesai diperbaiki!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoMoLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMoLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lNamaMontir1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lNamaMontir1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(labelMoLine))
                        .addComponent(logoMoLine)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lBeriRating.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lBeriRating.setText("Beri rating untuk montir?");

        lStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png"))); // NOI18N
        lStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lStar1MouseClicked(evt);
            }
        });

        lStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png"))); // NOI18N
        lStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lStar2MouseClicked(evt);
            }
        });

        lStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png"))); // NOI18N
        lStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lStar3MouseClicked(evt);
            }
        });

        lStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png"))); // NOI18N
        lStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lStar4MouseClicked(evt);
            }
        });

        lStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png"))); // NOI18N
        lStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lStar5MouseClicked(evt);
            }
        });

        lKetStar.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lKetStar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lKetStar.setText(" ");
        lKetStar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lKetStar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lStar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lStar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lStar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lStar4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lStar5)
                                .addGap(21, 21, 21))
                            .addComponent(lBeriRating, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(68, 68, 68))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lBeriRating)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lStar1)
                    .addComponent(lStar2)
                    .addComponent(lStar3)
                    .addComponent(lStar5)
                    .addComponent(lStar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lKetStar)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lFeedback.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lFeedback.setText("Punya saran?");

        taFeedback.setColumns(20);
        taFeedback.setRows(5);
        jScrollPane1.setViewportView(taFeedback);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lFeedback)
                .addGap(118, 118, 118))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lFeedback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed

        
    }//GEN-LAST:event_bSubmitActionPerformed

    private void lStar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStar1MouseClicked
        // TODO add your handling code here:
//            this.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.setlKetStar("SANGAT BURUK");
    }//GEN-LAST:event_lStar1MouseClicked

    private void lStar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStar2MouseClicked
        // TODO add your handling code here:
//            this.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.setlKetStar("BURUK");
//        
    }//GEN-LAST:event_lStar2MouseClicked

    private void lStar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStar3MouseClicked
        // TODO add your handling code here:
//            this.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.setlKetStar("CUKUP");
    }//GEN-LAST:event_lStar3MouseClicked

    private void lStar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStar4MouseClicked
        // TODO add your handling code here:
//            this.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
//            this.setlKetStar("BAIK");
//        
    }//GEN-LAST:event_lStar4MouseClicked

    private void lStar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lStar5MouseClicked
        // TODO add your handling code here:
//            this.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
//            this.setlKetStar("SANGAT BAIK");
    }//GEN-LAST:event_lStar5MouseClicked

    /**
     * @param args the command line arguments
     */
    
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    public JButton getbSubmit(){
        return bSubmit;
    }

    public void addActionListener(ActionListener e) {
        bSubmit.addActionListener(e);
    }
    
    public String getlKetStar() {
        return lKetStar.getText();
    }

    public void setlKetStar(String text) {
        lKetStar.setText(text);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBeriRating;
    private javax.swing.JLabel lFeedback;
    private javax.swing.JLabel lKetStar;
    private javax.swing.JLabel lNamaMontir1;
    private javax.swing.JLabel lStar1;
    private javax.swing.JLabel lStar2;
    private javax.swing.JLabel lStar3;
    private javax.swing.JLabel lStar4;
    private javax.swing.JLabel lStar5;
    private javax.swing.JLabel labelMoLine;
    private javax.swing.JLabel logoMoLine;
    private javax.swing.JTextArea taFeedback;
    // End of variables declaration//GEN-END:variables

    public JLabel getlStar1() {
        return lStar1;
    }

    public JLabel getlStar2() {
        return lStar2;
    }

    public JLabel getlStar3() {
        return lStar3;
    }

    public JLabel getlStar4() {
        return lStar4;
    }

    public String getTaFeedback() {
        return taFeedback.getText();
    }
    
    

    public JLabel getlStar5() {
        return lStar5;
    }
    
    @Override
    public void addMouseListener(MouseListener e){
        lStar1.addMouseListener(e);
        lStar2.addMouseListener(e);
        lStar3.addMouseListener(e);
        lStar4.addMouseListener(e);
        lStar5.addMouseListener(e);
    }
    
}
