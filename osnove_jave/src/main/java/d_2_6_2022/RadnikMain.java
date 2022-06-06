package d_2_6_2022;

import java.util.ArrayList;

public class RadnikMain {
    public static void main(String[] args) {

        ArrayList<Sektor> niz = new ArrayList<>();

        Sektor komercijala = new Sektor("Komercijala", 45000);
        Sektor hr = new Sektor("Ljudski resursi", 80000);
        Sektor skladiste = new Sektor("Skladiste", 55000);
        Sektor menadzment = new Sektor("Menadzment", 110000);

        Magacioner mag = new Magacioner("Milos Jankovic");
        Menadzer men = new Menadzer("Jovan Ivic");

        mag.zaposliUSektor(komercijala);
        mag.zaposliUSektor(skladiste);

        men.zaposliUSektor(hr);
        men.zaposliUSektor(menadzment);

        System.out.println("Plata magacionera je: " + mag.plataRadnika());
        System.out.println("Plata menadzera je: " + men.plataRadnika());
    }
}
