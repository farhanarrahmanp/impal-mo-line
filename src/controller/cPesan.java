/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.vMenu;
import view.vPesan;
import view.vPilih;

/**
 *
 * @author Farhan
 */
public class cPesan implements ActionListener{
    private vPesan vpesan;
    public static String id_kendaraan;
    public static String id_cust ;
    public static String merek ; 
    public static String nama ;
    public static String tahun ;
    public static String descript;
    public static String status;
    
    public cPesan(){
        vpesan = new vPesan();
        vpesan.addActionListener(this);
        vpesan.setVisible(true);
        cPesan.id_cust = cLogin.id_cust;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vpesan.getbBack())){
            new cMenu();
            vpesan.dispose();
        }else if(source.equals(vpesan.getbPesan())){
            cPesan.id_kendaraan = vpesan.getTfPlatNoDpn()+" "+vpesan.getTfPlatNoTgh()+" "+vpesan.getTfPlatNoBlkng();
            cPesan.merek = vpesan.getTfMerek();
            cPesan.nama = vpesan.getTfNamaMobil();
            cPesan.tahun = vpesan.getCbTahun();
            cPesan.descript = vpesan.getTaDeskripsi();
            if(id_kendaraan.isEmpty() || merek.isEmpty() || nama.isEmpty() || 
            tahun.isEmpty() || descript.isEmpty()){
                vpesan.showMessage("Data Belum Lengkap", "Error", 0);
            }else{
                vpesan.loading();
                new cPilih();
                vpesan.dispose();
            }
        }
        
    }
}
