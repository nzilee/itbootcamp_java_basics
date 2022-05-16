package d_16_5_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//  Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost
//  za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(23);
        stampajVrednostZa10Vecu(543);
        stampajVrednostZa10Vecu(4);
        stampajVrednostZa10Vecu(-23);
        stampajVrednostZa10Vecu(111);

    }

    static void stampajVrednostZa10Vecu(int broj){
        System.out.println("Vrednost broja za 10 veca je broj: " + (broj + 10));
    }

}
