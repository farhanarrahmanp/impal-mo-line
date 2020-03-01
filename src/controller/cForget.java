/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Database;
import view.vForget;
import view.vLogin;

/**
 *
 * @author Farhan
 */
public class cForget implements ActionListener{
    private vForget vforget;
    private Database Db = new Database();
    
    public cForget(){
        vforget = new vForget();
        vforget.addActionListener(this);
        vforget.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vforget.getbBack())){
            cLogin f = new cLogin();
            vforget.dispose();
        }else if(source.equals(vforget.getbChange())){
            String id_cust = vforget.getTfEmail();
            String new_pw = vforget.getPfNew_Pw();
            String conf_pw = vforget.getPfConfirm_Pw();

            if(!Db.checkDuplicateEmail(id_cust)){
                vforget.showMessage("Email Tidak Terdaftar", "Error", 0);
            }else if(!new_pw.equals(conf_pw)){
                vforget.showMessage("Password baru belum sama dengan konfirmasi", "Error", 0);
            }else{
                Db.changePassword(id_cust, new_pw);
                vforget.showMessage("Password berhasil diganti", "Success", 1);
                cLogin men = new cLogin();
                vforget.dispose();
            }
        }
    }
        
    
}
