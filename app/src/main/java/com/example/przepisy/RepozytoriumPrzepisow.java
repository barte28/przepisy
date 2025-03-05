package com.example.przepisy;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    public static ArrayList<Przepis> przepisy;
    public static void wygenerujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(
                new Przepis(
                        "Muffinki",
                        "mleko, mąka, cukier, kakao, Wszystkie wymieszać",
                        "Ciastka",
                        R.drawable.muffin,
                        0
                )
        );
        przepisy.add(
                new Przepis(
                        "Sernik",
                        "ser, masło, ziemniaki, kokos",
                        "Ciasto",
                        R.drawable.sernik,
                        0
                )
        );
        przepisy.add(
                new Przepis(
                        "Makowiec",
                        "mak, drożdże, mąka, mleko, cukier",
                        "Ciasto",
                        R.drawable.makowiec,
                        0
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
}
