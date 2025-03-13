package pl.zabrze.zs10.listy1_klasa3a;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Locale;

public class Repozytorium {
    public static ArrayList<Przepis> przepisy;

    public static void wygenerujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(
                new Przepis(
                        "Mufinki",
                        "Mleko, mąka, cukier, kakao, Wszystkie wymieszać piec 20 minut",
                        "Ciastka",
                        R.drawable.mufinka,
                        0
                )
        ) ;
        przepisy.add(
                new Przepis(
                        "sernik",
                        "ser, masło, ziemniaki, kokos",
                        "Ciasto",
                        R.drawable.sernik,
                        3
                )
        );
        przepisy.add(
                new Przepis(
                        "Makowiec",
                        "mak, drożdze, mąka, mleko, cukier",
                        "Ciasto",
                        R.drawable.makowiec,
                        1
                )
        );
        przepisy.add(
                new Przepis(
                        "Kakao",
                        "kakao, mleko",
                        "Napoje",
                        R.drawable.kakao,
                        0
                )
        );
    }

    public static ArrayList<Przepis> wypiszPrzepisy(String kategoria){
        wygenerujPrzepisy();
        ArrayList<Przepis> wybranePrzepisy = new ArrayList<>();
        for (Przepis przepis:przepisy) {
            if(przepis.getKategoria().equals(kategoria)){
                wybranePrzepisy.add(przepis);
            }
        }

        return wybranePrzepisy;
    }
    public static Przepis zwrocPrzepis(String nazwa){
        wygenerujPrzepisy();
        for (Przepis przepis:przepisy) {
            if(przepis.getNazwaPrzepisu().equals(nazwa)){
                return przepis;
            }
        }
        return null;
    }
}
