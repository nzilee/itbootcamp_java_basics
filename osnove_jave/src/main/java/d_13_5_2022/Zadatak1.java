package d_13_5_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
// Napisati program koji ima niz brojeva od 25 elemenata,
// koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti
// (ne unosi ih korisnik) zatim korisnik unosi poziciju za
// koju se racuna suma. Suma za poziciju se racuna tako sto
// se na vrednost tog polja dodaju vrednosti elemenata iznad,
// ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi
// postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(2);
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
        niz.add(6);
        niz.add(8);
        niz.add(4);
        niz.add(3);
        niz.add(1);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(9);
        niz.add(6);
        niz.add(4);
        niz.add(2);
        niz.add(1);
        niz.add(2);

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }

        System.out.print("Unesite poziciju: ");
        int pozicija = s.nextInt();

        if (pozicija == 0) {
            int pozicijaDesno = niz.get(pozicija + 1);
            System.out.println(pozicijaDesno);
            int pozicijaDole = niz.get(pozicija + 5);
            System.out.println(pozicijaDole);

            int suma = niz.get(pozicija) + pozicijaDesno + pozicijaDole;
            System.out.println("Suma je " + suma);

        } else if (pozicija == 24) {
            int pozicijaLevo = niz.get(pozicija - 1);
            System.out.println(pozicijaLevo);
            int pozicijaIznad = niz.get(pozicija - 5);
            System.out.println(pozicijaIznad);

            int suma = niz.get(pozicija) + pozicijaLevo + pozicijaIznad;
            System.out.println("Suma je " + suma);

        } else if (pozicija == 9 || pozicija == 14 || pozicija == 19) {
            int pozicijaLevo = niz.get(pozicija - 1);
            System.out.println(pozicijaLevo);
            int pozicijaIznad = niz.get(pozicija - 5);
            System.out.println(pozicijaIznad);
            int pozicijaDole = niz.get(pozicija + 5);
            System.out.println(pozicijaDole);

            int suma = niz.get(pozicija) + pozicijaLevo + pozicijaIznad + pozicijaDole;
            System.out.println("Suma je " + suma);

        } else if (pozicija == 5 || pozicija == 10 || pozicija == 15) {
            int pozicijaIznad = niz.get(pozicija - 5);
            System.out.println(pozicijaIznad);
            int pozicijaDesno = niz.get(pozicija + 1);
            System.out.println(pozicijaDesno);
            int pozicijaDole = niz.get(pozicija + 5);
            System.out.println(pozicijaDole);

            int suma = niz.get(pozicija) + pozicijaIznad + pozicijaDesno + pozicijaDole;
            System.out.println("Suma je " + suma);

        } else if (pozicija == 4) {
            int pozicijaLevo = niz.get(pozicija - 1);
            System.out.println(pozicijaLevo);
            int pozicijaDole = niz.get(pozicija + 5);
            System.out.println(pozicijaDole);

            int suma = niz.get(pozicija) + pozicijaLevo + pozicijaDole;
            System.out.println("Suma je " + suma);

        } else if (pozicija == 20) {
            int pozicijaIznad = niz.get(pozicija - 5);
            System.out.println(pozicijaIznad);
            int pozicijaDesno = niz.get(pozicija + 1);
            System.out.println(pozicijaDesno);

            int suma = niz.get(pozicija) + pozicijaIznad + pozicijaDesno;
            System.out.println("Suma je " + suma);

        } else if (pozicija >= 1 && pozicija <= 3) {
            int pozicijaLevo = niz.get(pozicija - 1);
            System.out.println(pozicijaLevo);
            int pozicijaDesno = niz.get(pozicija + 1);
            System.out.println(pozicijaDesno);
            int pozicijaDole = niz.get(pozicija + 5);
            System.out.println(pozicijaDole);

            int suma = niz.get(pozicija) + pozicijaLevo + pozicijaDesno + pozicijaDole;
            System.out.println("Suma je " + suma);

        } else if (pozicija >= 21 && pozicija <= 23) {
            int pozicijaLevo = niz.get(pozicija - 1);
            System.out.println(pozicijaLevo);
            int pozicijaDesno = niz.get(pozicija + 1);
            System.out.println(pozicijaDesno);
            int pozicijaIznad = niz.get(pozicija - 5);
            System.out.println(pozicijaIznad);

            int suma = niz.get(pozicija) + pozicijaLevo + pozicijaIznad + pozicijaDesno;
            System.out.println("Suma je " + suma);

        } else {
            int pozicijaLevo = niz.get(pozicija - 1);
            System.out.println(pozicijaLevo);
            int pozicijaIznad = niz.get(pozicija - 5);
            System.out.println(pozicijaIznad);
            int pozicijaDesno = niz.get(pozicija + 1);
            System.out.println(pozicijaDesno);
            int pozicijaDole = niz.get(pozicija + 5);
            System.out.println(pozicijaDole);

            int suma = niz.get(pozicija) + pozicijaLevo + pozicijaIznad + pozicijaDesno + pozicijaDole;
            System.out.println("Suma je " + suma);
        }
    }
}
