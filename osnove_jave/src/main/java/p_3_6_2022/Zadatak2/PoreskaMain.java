package p_3_6_2022.Zadatak2;

import java.util.ArrayList;
import java.util.Collections;

public class PoreskaMain {
    public static void main(String[] args) {


        ArrayList<Integer> brojevi = new ArrayList<>();

        /*brojevi.add(2);
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(4);
        brojevi.add(12);
        brojevi.add(18);
        brojevi.add(22);

        int maxBr;
        int veciMaxBr = 0;
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(0) < brojevi.get(i)){
                maxBr = brojevi.get(i);
                if (maxBr < brojevi.get(i)){
                    veciMaxBr = brojevi.get(i);
                }
            }
        }
        System.out.println(veciMaxBr);

        int min = brojevi.get(0);
        int max = brojevi.get(0);

        int n = brojevi.size();

        for (int i = 1; i < n; i++) {
            if (brojevi.get(i) < min){
                min = brojevi.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (brojevi.get(i) > max){
                max = brojevi.get(i);
            }
        }

        System.out.println("Max br je: " + max);
        System.out.println("Min br je: " + min);*/










        PoreskaUprava p = new PoreskaUprava("Nis");

        p.dodajObjekat(new Kuca("Vozdova 26", 85, 1, 4));
        p.dodajObjekat(new Zgrada("Ljubomira Nikolica 154", 550, 3, 18));
        p.dodajObjekat(new Lokal("Obrenoviceva 18/22", 28, 1));



        p.print();
    }
}
