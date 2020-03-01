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
import model.mPesanan;
import view.vMenu;
import view.vOTW;
import view.vRating;

/**
 *
 * @author Farhan
 */
public class cOTW implements ActionListener, MouseListener{
    private vOTW votw;
    private Database db;
    
    public cOTW(){
        votw = new vOTW();
        db = new Database();
        votw.addActionListener(this);
        votw.addMouseListener(this);
        votw.setlIDMontir(cPilih.id_montir);
        votw.setlNamaMontir(cPilih.nama_montir);
        votw.setlAngkaRating(cPilih.rating);
        votw.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(votw.getbBatal())){
            String id_kendaraan = cPesan.id_cust;
            String id_cust = cLogin.id_cust;
            String merek = cPesan.merek;
            String nama = cPesan.nama;
            String tahun = cPesan.tahun;
            String descript = cPesan.descript;
            String status = "Batal";
            db.addPesan(new mPesanan(cPesan.id_kendaraan, cPesan.id_cust, cPesan.merek, cPesan.nama, cPesan.tahun, cPesan.descript, status));
//            votw.showMessage("Batal?", "Question", 1);
            new cMenu();
            cMenu.pesan=false;
            votw.dispose();
        }else if(source.equals(votw.getbMainMenu())){
//            votw.showMessage("Main?", "Question", 1);
            cMenu cmenu = new cMenu();
            cmenu.pesan = true;
            votw.dispose();
            }
        }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if(source.equals(votw.getlSelesai())){
            String id_kendaraan = cPesan.id_cust;
            String id_cust = cPesan.id_cust;
            String merek = cPesan.merek;
            String nama = cPesan.nama;
            String tahun = cPesan.tahun;
            String descript = cPesan.descript;
            String status = "Selesai";
            db.addPesan(new mPesanan(cPesan.id_kendaraan, cPesan.id_cust, cPesan.merek, cPesan.nama, cPesan.tahun, cPesan.descript, status));
            new cRating();
            votw.dispose();
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
