package com.example.przepisy;public class Przepis {
    private String nazwaPrzpepisu;
    private String skladniki;
    private String kategoria;
    private int idObrazka;
    private int polubienia;

    public Przepis(String nazwaPrzpepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzpepisu = nazwaPrzpepisu;
        this.skladniki = skladniki;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
    }

    @Override
    public String toString() {
        return nazwaPrzpepisu;
    }

    public void setPolubienia() {
        this.polubienia ++;
    }

    public String getNazwaPrzpepisu() {
        return nazwaPrzpepisu;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public int getPolubienia() {
        return polubienia;
    }
}
