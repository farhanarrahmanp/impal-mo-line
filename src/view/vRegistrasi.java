/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.*;

/**
 *
 * @author ASUS
 */
public class vRegistrasi extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Registrasi
     */
    public vRegistrasi() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setSize(360, 640);
    }
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    public String getTfEmail() {
        return tfEmail.getText();
    }

    public String getPfPassword() {
        return pfPassword.getText();
    }

    public String getTfNama() {
        return tfNama.getText();
    }
    
    public ButtonGroup getBgMaleFemale() {
        return bgMaleFemale;
    }

    public JButton getbBack() {
        return bBack;
    }

    public JButton getbRegister() {
        return bRegister;
    }
    
    public String get_BgMaleFemale() {
        if(rbLaki.isSelected()){
            return getRbLaki();
        }else if(rbPr.isSelected()){
            return getRbPerempuan();
        }
        return null;
    }
    
    public String getRbLaki() {
        return rbLaki.getText();
    }

    public String getRbPerempuan() {
        return rbPr.getText();
    }

    public String getTaAlamat() {
        return taAlamat.getText();
    }

    public String getTfNo_Telp() {
        return tfNo_Telp.getText();
    }

    public String getCbTglLhr() {
        int check = cbTgl.getSelectedIndex()+1;
        String ret = "";
        switch(check){
            case 1 : ret = "1"; break;
            case 2 : ret = "2"; break;
            case 3 : ret = "3"; break;
            case 4 : ret = "4"; break;
            case 5 : ret = "5"; break;
            case 6 : ret = "6"; break;
            case 7 : ret = "7"; break;
            case 8 : ret = "8"; break;
            case 9 : ret = "9"; break;
            case 10 : ret = "10"; break;
            case 11 : ret = "11"; break;
            case 12 : ret = "12"; break;
            case 13 : ret = "13"; break;
            case 14 : ret = "14"; break;
            case 15 : ret = "15"; break;
            case 16 : ret = "16"; break;
            case 17 : ret = "17"; break;
            case 18 : ret = "18"; break;
            case 19 : ret = "19"; break;
            case 20 : ret = "20"; break;
            case 21 : ret = "21"; break;
            case 22 : ret = "22"; break;
            case 23 : ret = "23"; break;
            case 24 : ret = "24"; break;
            case 25 : ret = "25"; break;
            case 26 : ret = "26"; break;
            case 27 : ret = "27"; break;
            case 28 : ret = "28"; break;
            case 29 : ret = "29"; break;
            case 30 : ret = "30"; break;
            case 31 : ret = "31"; break;
        }
        return ret;
    }
    
    public String get_CbTglLhr(){
        int i = cbTgl.getSelectedIndex();
        return cbTgl.getItemAt(i);
    }
    
    public String getCbBlnLhr(){
        int check = cbBln.getSelectedIndex()+1;
        String ret = "";
        switch(check){
            case 1 : ret = "January"; break;
            case 2 : ret = "February"; break;
            case 3 : ret = "March"; break;
            case 4 : ret = "April"; break;
            case 5 : ret = "May"; break;
            case 6 : ret = "June"; break;
            case 7 : ret = "July"; break;
            case 8 : ret = "August"; break;
            case 9 : ret = "September"; break;
            case 10 : ret = "October"; break;
            case 11 : ret = "November"; break;
            case 12 : ret = "December"; break;
        }
        return ret;
    }
    
    public String get_CbBlnLhr(){
        int i = cbBln.getSelectedIndex();
        return cbBln.getItemAt(i);
    }
    
    public String getCbThnLhr() {
        int check = cbThn.getSelectedIndex()+1;
        String ret = "";
        switch(check){
            case 1 : ret = "1945"; break;
            case 2 : ret = "1946"; break;
            case 3 : ret = "1947"; break;
            case 4 : ret = "1948"; break;
            case 5 : ret = "1949"; break;
            case 6 : ret = "1950"; break;
            case 7 : ret = "1951"; break;
            case 8 : ret = "1952"; break;
            case 9 : ret = "1953"; break;
            case 10 : ret = "1954"; break;
            case 11 : ret = "1955"; break;
            case 12 : ret = "1956"; break;
            case 13 : ret = "1957"; break;
            case 14 : ret = "1958"; break;
            case 15 : ret = "1959"; break;
            case 16 : ret = "1960"; break;
            case 17 : ret = "1961"; break;
            case 18 : ret = "1962"; break;
            case 19 : ret = "1963"; break;
            case 20 : ret = "1964"; break;
            case 21 : ret = "1965"; break;
            case 22 : ret = "1966"; break;
            case 23 : ret = "1967"; break;
            case 24 : ret = "1968"; break;
            case 25 : ret = "1969"; break;
            case 26 : ret = "1970"; break;
            case 27 : ret = "1971"; break;
            case 28 : ret = "1972"; break;
            case 29 : ret = "1973"; break;
            case 30 : ret = "1974"; break;
            case 31 : ret = "1975"; break;
            case 32 : ret = "1976"; break;
            case 33 : ret = "1977"; break;
            case 34 : ret = "1978"; break;
            case 35 : ret = "1979"; break;
            case 36 : ret = "1980"; break;
            case 37 : ret = "1981"; break;
            case 38 : ret = "1982"; break;
            case 39 : ret = "1983"; break;
            case 40 : ret = "1984"; break;
            case 41 : ret = "1985"; break;
            case 42 : ret = "1986"; break;
            case 43 : ret = "1987"; break;
            case 44 : ret = "1988"; break;
            case 45 : ret = "1989"; break;
            case 46 : ret = "1990"; break;
            case 47 : ret = "1991"; break;
            case 48 : ret = "1992"; break;
            case 49 : ret = "1993"; break;
            case 50 : ret = "1994"; break;
            case 51 : ret = "1995"; break;
            case 52 : ret = "1996"; break;
            case 53 : ret = "1997"; break;
            case 54 : ret = "1998"; break;
            case 55 : ret = "1999"; break;
            case 56 : ret = "2000"; break;
            case 57 : ret = "2001"; break;
            case 58 : ret = "2002"; break;
            case 59 : ret = "2003"; break;
            case 60 : ret = "2004"; break;
            case 61 : ret = "2005"; break;
            case 62 : ret = "2006"; break;
            case 63 : ret = "2007"; break;
            case 64 : ret = "2008"; break;
            case 65 : ret = "2009"; break;
            case 66 : ret = "2010"; break;
            case 67 : ret = "2011"; break;
            case 68 : ret = "2012"; break;
            case 69 : ret = "2013"; break;
            case 70 : ret = "2014"; break;
            case 71 : ret = "2015"; break;
            case 72 : ret = "2016"; break;
            case 73 : ret = "2017"; break;
            case 74 : ret = "2018"; break;
            case 75 : ret = "2019"; break;
        }
        return ret;
    }
    
    public String get_CbThnLhr(){
        int i = cbThn.getSelectedIndex();
        return cbThn.getItemAt(i);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMaleFemale = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lNama = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        lGender = new javax.swing.JLabel();
        bRegister = new javax.swing.JButton();
        tfNama = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lAlamat = new javax.swing.JLabel();
        lTanggal_Lahir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        lNo_Telp = new javax.swing.JLabel();
        tfNo_Telp = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        rbLaki = new javax.swing.JRadioButton();
        rbPr = new javax.swing.JRadioButton();
        bBack = new javax.swing.JButton();
        cbTgl = new javax.swing.JComboBox<>();
        cbBln = new javax.swing.JComboBox<>();
        cbThn = new javax.swing.JComboBox<>();
        lWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 640));

        lNama.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lNama.setText("NAMA");

        lEmail.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lEmail.setText("EMAIL");

        lPassword.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lPassword.setText("PASSWORD");

        lGender.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lGender.setText("GENDER");

        bRegister.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bRegister.setText("REGISTER");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        lAlamat.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lAlamat.setText("ALAMAT");

        lTanggal_Lahir.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lTanggal_Lahir.setText("TANGGAL LAHIR");

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane1.setViewportView(taAlamat);

        lNo_Telp.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        lNo_Telp.setText("NOMOR HP");

        tfNo_Telp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNo_Telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNo_TelpActionPerformed(evt);
            }
        });

        bgMaleFemale.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        rbLaki.setForeground(new java.awt.Color(0, 0, 255));
        rbLaki.setText("LAKI-LAKI");
        rbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiActionPerformed(evt);
            }
        });

        bgMaleFemale.add(rbPr);
        rbPr.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        rbPr.setForeground(new java.awt.Color(204, 0, 204));
        rbPr.setText("PEREMPUAN");
        rbPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrActionPerformed(evt);
            }
        });

        bBack.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bBack.setText("BACK");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        cbTgl.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        cbTgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbBln.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        cbBln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbBln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBlnActionPerformed(evt);
            }
        });

        cbThn.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        cbThn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        lWelcome.setFont(new java.awt.Font("Hobo Std", 1, 18)); // NOI18N
        lWelcome.setText("Lengkapi data diri kamu di bawah ini ya");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bBack))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lGender))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lWelcome)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfNo_Telp)
                            .addComponent(jScrollPane1)
                            .addComponent(bRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lEmail)
                                    .addComponent(lNama)
                                    .addComponent(lPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(tfNama)
                                    .addComponent(tfEmail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbLaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbPr))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbBln, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbThn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTanggal_Lahir)
                                    .addComponent(lAlamat))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNo_Telp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bBack)
                .addGap(26, 26, 26)
                .addComponent(lWelcome)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPassword)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbPr))
                .addGap(18, 18, 18)
                .addComponent(lTanggal_Lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbThn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lNo_Telp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNo_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        
    }//GEN-LAST:event_bRegisterActionPerformed

    private void tfNo_TelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNo_TelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNo_TelpActionPerformed

    private void rbPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPrActionPerformed

    private void rbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLakiActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bBackActionPerformed

    private void cbBlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBlnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void addActionListener(ActionListener e){
        bBack.addActionListener(e);
        bRegister.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bRegister;
    private javax.swing.ButtonGroup bgMaleFemale;
    private javax.swing.JComboBox<String> cbBln;
    private javax.swing.JComboBox<String> cbTgl;
    private javax.swing.JComboBox<String> cbThn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAlamat;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lGender;
    private javax.swing.JLabel lNama;
    private javax.swing.JLabel lNo_Telp;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lTanggal_Lahir;
    private javax.swing.JLabel lWelcome;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPr;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo_Telp;
    // End of variables declaration//GEN-END:variables
}
