package pl.zabrze.zs10.listy1_klasa3a;
public class Przepis {
    private String nazwaPrzepisu;
    private String skladniki;
    private String kategoria;
    private int idObrazka;
    private int polubienia;

    public Przepis(String nazwaPrzepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.skladniki = skladniki;
        this.kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
    }

    @Override
    public String toString() {
        return nazwaPrzepisu ;
    }

    public void setPolubienia() {
        this.polubienia ++;
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

    public int getPolubienia() {
        return polubienia;
    }
}
