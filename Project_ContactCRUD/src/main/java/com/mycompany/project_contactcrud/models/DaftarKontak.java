/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_contactcrud.models;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class DaftarKontak {
    private String id;
    private String nama;
    private String telepon;
    private String alamat;

    public DaftarKontak() {
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
