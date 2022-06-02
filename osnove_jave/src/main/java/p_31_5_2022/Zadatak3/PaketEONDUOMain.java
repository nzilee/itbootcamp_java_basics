package p_31_5_2022.Zadatak3;

public class PaketEONDUOMain {
    public static void main(String[] args) {

        EONPaket x = new EONPaket("Nikola Zivkovic",
                2500, 24);

        DUOPaket y = new DUOPaket("Jovan Jovanovic",
                3000, 24);


        x.produziUgovor();

        y.povecajBrzinu(50, 25);

        x.print();
        System.out.println();
        y.print();
    }
}
