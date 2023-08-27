package com.service.ConsumerProd.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "consumer")
public class ConsumerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nama", length = 255)
    private String nama;

    @Column(name = "alamat", columnDefinition = "TEXT")
    private String alamat;

    @Column(name = "kota", length = 1)
    private Character kota;

    @Column(name = "provinsi", length = 1)
    private Character provinsi;

    @Column(name = "tgl_registrasi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglRegistrasi;

    @Column(name = "status", length = 1, columnDefinition = "CHAR(1) CHECK (status IN ('A', 'I'))")
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
