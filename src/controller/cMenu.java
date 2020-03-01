/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.vLogin;
import view.vMenu;
import view.vOTW;
import view.vPesan;

/**
 *
 * @author Farhan
 */
public class cMenu implements ActionListener, MouseListener{
    private vMenu vmenu;
    public static boolean pesan = false;
    public static String id_cust ;

    
    public cMenu(){
        cMenu.id_cust = cLogin.id_cust;
        vmenu = new vMenu();
        vmenu.addActionListener(this);
        vmenu.addMouseListener(this);
        vmenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vmenu.getbPesan())){
            new cPesan();
            vmenu.dispose();
        }else if(source.equals(vmenu.getbStatus())){
            if(cMenu.pesan == false){
             vmenu.showMessage("Belum Ada Pesanan Yang Dibuat", "Error", 0);
            }else{
                new cOTW();
                vmenu.dispose();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source.equals(vmenu.getlLogout())){
            new cLogin();
            vmenu.dispose();    
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}

