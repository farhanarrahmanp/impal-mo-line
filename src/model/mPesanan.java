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
public class mPesanan implements Serializable{
    private String id_kendaraan;
    private String id_cust;
    private String merek;
    private String nama;
    private String tahun;
    private String descript;
    private String status;

    public mPesanan(String id_kendaraan, String id_cust, String merek, String nama, String tahun, String descript, String status) {
        this.id_kendaraan = id_kendaraan;
        this.id_cust = id_cust;
        this.merek = merek;
        this.nama = nama;
        this.tahun = tahun;
        this.descript = descript;
        this.status = status;
    }

    
    public String getId_kendaraan() {
        return id_kendaraan;
    }

    public void setId_kendaraan(String id_kendaraan) {
        this.id_kendaraan = id_kendaraan;
    }

    public String getId_cust() {
        return id_cust;
    }

    public void setId_cust(String id_cust) {
        this.id_cust = id_cust;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

        
}
