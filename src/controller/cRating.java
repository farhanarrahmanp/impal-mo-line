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
import model.Database;
import model.mRating;
import view.vMenu;
import view.vPilih;
import view.vRating;
import view.*;

/**
 *
 * @author Farhan
 */
public class cRating implements ActionListener, MouseListener{
    private vRating vrating;
    public static String id_montir;
    public static String nama_montir;
    public static String star;
    public static String ket_star;
    public static String masukan;
    private Database db;
//    private Object getlstar = vrating.getlStar1();

    public cRating(){
        vrating = new vRating();
        db = new Database();
        vrating.addActionListener(this);
        vrating.addMouseListener(this);
        vrating.setVisible(true);
    }
    
    public void lStar1MouseClicked() {                                    
        // TODO add your handling code here:
            vrating.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.setlKetStar("SANGAT BURUK");
            
        
    }
    
    public void lStar2MouseClicked() {                                    
        // TODO add your handling code here:
            vrating.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.setlKetStar("BURUK");
        
    }                                   

    public void lStar3MouseClicked() {                                    
        // TODO add your handling code here:
            vrating.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.setlKetStar("CUKUP");
        
    }                                   

    private void lStar4MouseClicked() {                                    
        // TODO add your handling code here:
            vrating.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/brating.png")));
            vrating.setlKetStar("BAIK");
        
    }                                   

    public void lStar5MouseClicked() {                                    
        // TODO add your handling code here:
            vrating.getlStar1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.getlStar5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/yrating.png")));
            vrating.setlKetStar("SANGAT BAIK");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vrating.getbSubmit())){
                
                cRating.id_montir = cPilih.id_montir;
                cRating.nama_montir = cPilih.nama_montir;
                cRating.masukan = vrating.getTaFeedback();
                db.addRating(new mRating(cRating.id_montir,cRating.nama_montir,Integer.parseInt(cRating.star),cRating.ket_star,cRating.masukan));
                vrating.showMessage("Berhasil Submit","Success", 1);
                new cMenu();
                cMenu.pesan = false;
                vrating.dispose();
            
            
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source.equals(vrating.getlStar1())){
            lStar1MouseClicked();
            cRating.star = "1";
            cRating.ket_star = "SANGAT BURUK";
        }else if(source.equals(vrating.getlStar2())){
            lStar2MouseClicked();
            cRating.star = "2";
             cRating.ket_star = "SANGAT BURUK";
        }else if(source.equals(vrating.getlStar3())){
            lStar3MouseClicked();
            cRating.star = "3";
             cRating.ket_star = "CUKUP";
        }else if(source.equals(vrating.getlStar4())){
            lStar4MouseClicked();
            cRating.star = "4";
             cRating.ket_star = "BAIK";
        }else if(source.equals(vrating.getlStar5())){
            lStar5MouseClicked();
            cRating.star = "5";
             cRating.ket_star = "SANGAT BAIK";
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
