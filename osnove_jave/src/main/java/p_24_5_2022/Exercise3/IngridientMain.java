package p_24_5_2022.Exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class IngridientMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Ingridient> sastojci = new ArrayList<>();


        System.out.print("Unesite broj sastojaka: ");
        int brojSastojaka = s.nextInt();

        for (int i = 0; i < brojSastojaka; i++) {
            System.out.print("Unesite ime sastojka: ");
            String naziv = s.next();

            System.out.print("Unesite cenu sastojka: ");
            int cena = s.nextInt();

            Ingridient x = new Ingridient(naziv, cena);
            sastojci.add(x);
        }


        for (int i = 0; i < sastojci.size(); i++) {
            sastojci.get(i).print();
        }

        int suma = 0;

        for (int i = 0; i < sastojci.size(); i++) {
            suma = suma + sastojci.get(i).getPrice();
        }

        System.out.println("Suma cena svih sastojaka je " + suma);








    }
}
