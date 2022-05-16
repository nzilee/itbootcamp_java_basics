package d_13_5_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//   Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih
//   vrednosti (ne u nosi ih korisnik) a zatim se od korisnika ucitava
//   pozicija elementa koji zeli da izbaci iz niza.
//   Pre i nakon izbacivanja ispisati niz na ekranu.
//   Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(5);
        niz.add(6);
        niz.add(4);
        niz.add(2);
        niz.add(1);
        niz.add(5);
        niz.add(3);
        niz.add(9);
        niz.add(7);
        niz.add(2);

        System.out.print("Niz je ");

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }

        System.out.println();

        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();


        if (pozicija > (niz.size() - 1) || pozicija < 0){
            System.out.println("Uneli ste nevalidnu poziciju!");
        } else {
            niz.remove(pozicija);
            System.out.print("Niz nakon brisanja je: ");

            for (int i = 0; i < niz.size(); i++) {
                System.out.print(niz.get(i) + ", ");
            }
        }

    }
}
