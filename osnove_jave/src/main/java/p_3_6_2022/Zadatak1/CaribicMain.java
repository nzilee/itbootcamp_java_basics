package p_3_6_2022.Zadatak1;

import java.util.ArrayList;

public class CaribicMain {
    public static void main(String[] args) {

        ArrayList<Proizvod> nizProizvoda = new ArrayList<>();

        IcePoint a = new IcePoint("Vanila", true);
        IcePoint b = new IcePoint("Vanila", false);
        IcePoint c = new IcePoint("Cokolada", false);

        Pica x = new Pica(150);
        Pica y = new Pica(220);

        nizProizvoda.add(a);
        nizProizvoda.add(b);
        nizProizvoda.add(c);
        nizProizvoda.add(x);
        nizProizvoda.add(y);

        a.ubaciDodatak(new Dodatak("Preliv jagoda", 80));
        a.ubaciDodatak(new Dodatak("M&M bonbone", 120));

        b.ubaciDodatak(new Dodatak("Preliv cokolada", 80));
        b.ubaciDodatak(new Dodatak("KitKat", 100));

        c.ubaciDodatak(new Dodatak("Preliv sumsko voce", 80));
        c.ubaciDodatak(new Dodatak("Jaffa keks", 100));

        x.ubaciDodatak(new Dodatak("Slanina", 150));
        x.ubaciDodatak(new Dodatak("Tabasco sos", 200));

        y.ubaciDodatak(new Dodatak("Prsuta", 250));
        y.ubaciDodatak(new Dodatak("Ananas", 150));


        for (int i = 0; i < nizProizvoda.size(); i++) {
            nizProizvoda.get(i).print();
            System.out.println();
        }

        int cenaPorudzbine = 0;

        for (int i = 0; i < nizProizvoda.size(); i++) {
            cenaPorudzbine += nizProizvoda.get(i).ukupnaCena();

        }
        System.out.println("Ukupna cena porudzbine je: " + cenaPorudzbine);


        /*Kasa k = new Kasa();

        k.dodajProizvod(new Pica(220));
        k.dodajProizvod(new Pica(150));
        k.dodajProizvod(new IcePoint("Cokolada", true));
        k.dodajProizvod(new IcePoint("Vanila", false));

        k.printRacun();*/


    }
}
