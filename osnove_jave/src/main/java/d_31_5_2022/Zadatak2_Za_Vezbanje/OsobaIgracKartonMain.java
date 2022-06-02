package d_31_5_2022.Zadatak2_Za_Vezbanje;

import java.util.ArrayList;

public class OsobaIgracKartonMain {
    public static void main(String[] args) {

        ArrayList<Karton> niz = new ArrayList<>();

        Karton zuti = new Karton("zuti");
        Karton crveni = new Karton("crveni");

        Igrac m = new Igrac("Mladen Ivkovic",
                "0910999690025",
                1999, 88,
                "Napadac", niz, true);

        m.dodajKarton(zuti);
        m.dodajKarton(zuti);
        m.dodajKarton(zuti);
        m.dodajKarton(zuti);
        m.dodajKarton(crveni);
        m.dodajKarton(zuti);
        m.dodajKarton(crveni);

        m.print();
    }
}
