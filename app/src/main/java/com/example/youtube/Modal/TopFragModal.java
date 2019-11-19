package com.example.youtube.Modal;

public class TopFragModal {

    private String title;
    private String nama;
    private int poster;
    private int foto;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public TopFragModal(String title, String nama, int poster, int foto) {
        this.title = title;
        this.nama = nama;
        this.poster = poster;
        this.foto = foto;
    }
}
