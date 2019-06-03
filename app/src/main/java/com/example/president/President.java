package com.example.president;

public class President {
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getGambar() { return gambar; }

    public void setGambar(String gambar) { this.gambar = gambar; }

    public String getDetail() { return deskripsi; }

    public void setDetail(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    private String nama, jabatan, gambar,deskripsi;
}
