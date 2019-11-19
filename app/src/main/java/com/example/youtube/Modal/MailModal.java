package com.example.youtube.Modal;

public class MailModal {

    private String pesan;
    private int poste;
    private int foto;

    public MailModal() {

    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public int getPoste() {
        return poste;
    }

    public void setPoste(int poste) {
        this.poste = poste;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public MailModal(String pesan, int poste, int foto) {
        this.pesan = pesan;
        this.poste = poste;
        this.foto = foto;
    }
}
