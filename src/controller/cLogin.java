package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Database;
import model.mLogin;
import model.mSign_Up;
import view.vForget;
import view.vLogin;
import view.vMenu;
import view.vRegistrasi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farhan
 */
public class cLogin implements ActionListener{
    private vLogin vlogin;
    private Database Db = new Database();
    private mSign_Up s;
    private mLogin l;
    public static String id_cust ;

    public cLogin() {
        vlogin = new vLogin();
        vlogin.addActionListener(this);
        vlogin.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vlogin.getbDaftar())){
            new cRegistrasi();
            vlogin.dispose();
        }else if (source.equals(vlogin.getbForget())){
            new cForget();
            vlogin.dispose();
        }else if(source.equals(vlogin.getbLogin())){
            String id_cust = vlogin.getTfEmail();
            String password = vlogin.getPfPassword();
            if (id_cust.isEmpty() && password.isEmpty()){
                vlogin.showMessage("Anda Belum memasukkan Username dan Password", "Error", 0);
            /*new vFirst().setVisible(true);
            this.dispose();*/
            }else if (id_cust.isEmpty() ){
                vlogin.showMessage("Anda Belum memasukkan Username", "Error", 0);
                /*new vFirst().setVisible(true);
                this.dispose();*/
            }else if (password.isEmpty() ){
                vlogin.showMessage("Anda Belum memasukkan Password", "Error", 0);
                /*new vFirst().setVisible(true);
                this.dispose();*/
            }else{
                if (!Db.checkDuplicateEmail(id_cust)){
                    vlogin.showMessage("Email Salah atau Belum Terdaftar","Error", 0);
                    new cLogin();
                    vlogin.dispose();
                }else{
                    if(!Db.checkDuplicatePassword(id_cust,password)){
                        vlogin.showMessage("Password Salah atau Belum Terdaftar","Error", 0);
                        new cLogin();
                        vlogin.dispose();
                    }else {
                        cLogin.id_cust = id_cust;
                        vlogin.showMessage("Login Berhasil","Success", 1);
                        new cMenu();
                        vlogin.dispose();
                    }
                }
            }
        }
    }
    
}
