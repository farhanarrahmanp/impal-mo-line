/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Farhan
 */
public class mRating implements Serializable{
    private String id_montir;
    private String nama_montir;
    private int star;
    private String ket_star;
    private String masukan;

    public mRating(String id_montir, String nama_montir, int star, String ket_star, String masukan) {
        this.id_montir = id_montir;
        this.nama_montir = nama_montir;
        this.star = star;
        this.ket_star = ket_star;
        this.masukan = masukan;
    }

    public String getId_montir() {
        return id_montir;
    }

    public void setId_montir(String id_montir) {
        this.id_montir = id_montir;
    }

    public String getNama_montir() {
        return nama_montir;
    }

    public void setNama_montir(String nama_montir) {
        this.nama_montir = nama_montir;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getKet_star() {
        return ket_star;
    }

    public void setKet_star(String ket_star) {
        this.ket_star = ket_star;
    }

    public String getMasukan() {
        return masukan;
    }

    public void setMasukan(String masukan) {
        this.masukan = masukan;
    }
    
    
}
