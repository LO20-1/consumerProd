package com.service.ConsumerProd.model;

import java.util.Date;

public class Consumer {

    private Long id;
    private String nama;
    private String alamat;
    private Character kota;
    private Character provinsi;
    private Date tglRegistrasi;
    private Character status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Character getKota() {
        return kota;
    }

    public void setKota(Character kota) {
        this.kota = kota;
    }

    public Character getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(Character provinsi) {
        this.provinsi = provinsi;
    }

    public Date getTglRegistrasi() {
        return tglRegistrasi;
    }

    public void setTglRegistrasi(Date tglRegistrasi) {
        this.tglRegistrasi = tglRegistrasi;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }
}
