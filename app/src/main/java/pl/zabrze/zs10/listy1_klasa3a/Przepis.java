package pl.zabrze.zs10.listy1_klasa3a;

import java.util.ArrayList;

public class Przepis {
    private String nazwaPrzepisu;
    private String skladniki;
    private String kategoria;
    private int idObrazka;
    private float polubienia;
    private ArrayList<Float> wszystkieOceny = new ArrayList<>();

    public Przepis(String nazwaPrzepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.skladniki = skladniki;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
        wszystkieOceny.add(this.polubienia);
    }

    @Override
    public String toString() {
        return nazwaPrzepisu ;
    }

    public void setPolubienia(int polubienia) {
        wszystkieOceny.add((float)polubienia);

    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
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

    public float getPolubienia() {
        float srednia = 0;
        for (int i = 0; i < wszystkieOceny.size(); i++) {
            srednia+= wszystkieOceny.get(i);
        }
        srednia = srednia/ wszystkieOceny.size();

        return srednia;
    }
}
