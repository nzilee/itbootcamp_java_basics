package p_31_5_2022.Zadatak2;

public class PlatnaVisaMasterKarticaMain {
    public static void main(String[] args) {

        VisaKartica x = new VisaKartica(2450.0,
                "1450-4242-2425-4357-8446",
                24, 11,
                "Nikola Zivkovic");

        x.dodajSredstva(500);
        x.izvrsiTransakciju(50);

        MasterKartica y = new MasterKartica(3200.0,
                "3456-8457-3472-1208",
                25,10);
        y.dodajSredstva(200);
        y.naplatiOdrzavanje();
        y.izvrsiTransakciju(2000);

        x.print();
        System.out.println();
        y.print();
    }
}
