package d_30_5_2022.Zadatak2_za_vezbu;

public class KombinacijaListicMain {
    public static void main(String[] args) {

        Kombinacija n = new Kombinacija(4422,
                12, 32, 33, 7, 5, 13, 8);

        Listic l1 = new Listic();

        l1.dodajKombinaciju(n);
        l1.dodajKombinaciju(new Kombinacija(4546,
                3,15,22,35,34,2,5));
        l1.dodajKombinaciju(new Kombinacija(4547,
                5,25,6,34,29,20,18));
        l1.dodajKombinaciju(new Kombinacija(4548,
                2,4,6,8,10,12,14));
        l1.dodajKombinaciju(new Kombinacija(4549,
                1,3,5,7,9,11,13));
        l1.dodajKombinaciju(new Kombinacija(4550,
                12,22,34,33,15,9,23));

        l1.print(n);
    }
}
