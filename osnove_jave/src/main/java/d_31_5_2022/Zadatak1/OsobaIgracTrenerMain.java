package d_31_5_2022.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class OsobaIgracTrenerMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> nizIgraca = new ArrayList<>();
        ArrayList<Trener> nizTrenera = new ArrayList<>();

        System.out.print("Unesite broj igraca: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime igraca: ");
            String ime = s.next();
            System.out.print("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja igraca: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite broj dresa igraca: ");
            int broj = s.nextInt();
            System.out.print("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.print("Unesite true ako je igrac kapiten ili false ako nije: ");
            boolean jesteKapiten = s.nextBoolean();
            System.out.println();

            Igrac y = new Igrac(ime, jmbg, godRodjenja, broj, pozicija, jesteKapiten);
            nizIgraca.add(y);
        }

        System.out.print("Unesite broj trenera: ");
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("Unesite ime trenera: ");
            String ime = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int godIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tip = s.next();
            System.out.println();

            Trener z = new Trener(ime, jmbg, godRodjenja, godIskustva, tip);
            nizTrenera.add(z);
        }

        for (int i = 0; i < nizIgraca.size(); i++) {
            nizIgraca.get(i).print();
            System.out.println();
        }

        for (int i = 0; i < nizTrenera.size(); i++) {
            nizTrenera.get(i).print();
            System.out.println();
        }


        /*Igrac z = new Igrac("Zoran Jovic",
                "2102987640029",
                1987, 88,
                "Desni bek", false);
        Igrac n = new Igrac("Nemanja Ivic",
                "1308992730021",
                1992, 5,
                "Golman", true);

        Trener j = new Trener("Jovan Jovanovic",
                "2505977890022",
                1977, 12,
                "Pomocni");
        Trener i = new Trener("Ivan Bojic",
                "0210980290012",
                1980, 8,
                "Kondicioni");

        z.print();
        System.out.println();
        n.print();
        System.out.println();
        j.print();
        System.out.println();
        i.print();*/
    }
}
