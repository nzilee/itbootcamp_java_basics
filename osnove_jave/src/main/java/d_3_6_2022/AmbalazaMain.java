package d_3_6_2022;

public class AmbalazaMain {
    public static void main(String[] args) {

        Korpa k = new Korpa();
        SuperKartica s = new SuperKartica("123-123",
                "Jovan Jovanovic", 200);

        k.dodajAmbalazu(new Tetrapak("1234-5678",
                "Mleko", 1000,
                1050, true, 120));

        k.dodajAmbalazu(new Tetrapak("5678-1234",
                "Vocni sok", 1500,
                1650, false, 180));

        k.dodajAmbalazu(new StaklenaAmbalaza("123-123",
                "Crno vino", 800,
                1400, 0,
                false, 400));

        k.dodajAmbalazu(new StaklenaAmbalaza("321-321",
                "Pivo", 120,
                220, 50,
                true, 80));


        k.izbaciAmbalazu("5678-1234");
        k.print();
        System.out.println("Ukupna cena korpe sa popustom je: " + k.cenaKorpe(s));

    }
}
