/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.vOTW;
import view.vPesan;
import view.vPilih;

/**
 *
 * @author Farhan
 */
public class cPilih implements ActionListener{
    private vPilih vpilih;
    
    public static String id_montir;
    public static String nama_montir;
    public static String rating;
    public static String id_kendaraan;
    
    public cPilih(){
        cPilih.id_kendaraan = cPesan.id_kendaraan;
        vpilih = new vPilih();
        vpilih.addActionListener(this);
        vpilih.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(vpilih.getbBack())){
            new cPesan();
            vpilih.dispose();
        }else if(source.equals(vpilih.getbPesan())){
            if(vpilih.get_BtMontir()==null){
                vpilih.showMessage("Belum Memilih Montir","Error",0);
            }else{
                if(vpilih.get_BtMontir().equals("Jack")){
                    cPilih.id_montir = "MO-001";
                    cPilih.nama_montir = "Jack Kahuna";
                    cPilih.rating = "4.5 / 5.0";
                    new cOTW();
                    cMenu.pesan = true;
                    vpilih.dispose();
                }else if(vpilih.get_BtMontir().equals("Zit")){
                    cPilih.id_montir = "MO-002";
                    cPilih.nama_montir = "Zit Tooya";
                    cPilih.rating = "4.3 / 5.0";
                    new cOTW();
                    cMenu.pesan = true;
                    vpilih.dispose();
                }else if(vpilih.get_BtMontir().equals("Craig")){
                    cPilih.id_montir = "MO-003";
                    cPilih.nama_montir = "Craig Mammalton";
                    cPilih.rating = "4.4 / 5.0";
                    new cOTW();
                    cMenu.pesan = true;
                    vpilih.dispose();
                }
            }
        }
    }
}
