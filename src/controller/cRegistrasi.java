/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Database;
import model.mLogin;
import model.mSign_Up;
import view.vLogin;
import view.vRegistrasi;

/**
 *
 * @author Farhan
 */
public class cRegistrasi implements ActionListener{
    private vRegistrasi vregis;
    private Database Db = new Database();
    private mSign_Up s;
    private mLogin l;
    private static String nama;

    public cRegistrasi(){
        vregis = new vRegistrasi();
        vregis.addActionListener(this);
        vregis.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vregis.getbBack())){
            new cLogin();
        }else if(source.equals(vregis.getbRegister())){
            String id_cust = vregis.getTfEmail();
            String password = vregis.getPfPassword();
            String nama = vregis.getTfNama();
            String tgl_lhr = vregis.getCbTglLhr()+" "+vregis.getCbBlnLhr()+" "+vregis.getCbThnLhr();
            String gender = vregis.get_BgMaleFemale();
            String alamat = vregis.getTaAlamat();
            String no_telp = vregis.getTfNo_Telp();
        
            if(id_cust.isEmpty() || password.isEmpty() || nama.isEmpty() || 
            tgl_lhr.isEmpty() || gender.isEmpty() || alamat.isEmpty() || no_telp.isEmpty()){
                vregis.showMessage("Data Belum Legkap", "Error", 0);
            /*new vRegistrasi().setVisible(true);
            this.dispose();*/
            }else{
                if (Db.checkDuplicateEmail(id_cust)){
                    vregis.showMessage("Email Sudah Ada", "Error", 0); 
                /*new vRegistrasi().setVisible(true);
                this.dispose();*/
                }else {
                    Db.addUser(new mSign_Up(id_cust,password,nama,tgl_lhr,gender,alamat,no_telp));
                    vregis.showMessage("Email Berhasil Terdaftar", "Success", 1);
                    new cLogin();
                    vregis.dispose();
                }
            }
        }
    }
}
