package d_24_5_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<ZeleniKarton> niz = new ArrayList<>();

        System.out.print("Unesite broj predmeta: ");
        int n = s.nextInt();

        double zbirSvihOcena = 0;
        double zbirOcenaPolozenihIspita = 0;
        int brojPolozenihIspita = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Unesite ime i prezime profesora: ");
            String punoImeProfesora = s.next(); // jedino nisam uspeo da provalim zbog cega ovde nece da mi ocita
                                                // sa space-om cak i kad stavim s.nextLine() ne funkcionise lepo
            System.out.print("Unesite naziv predmeta: ");
            String naziv = s.next();

            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton a = new ZeleniKarton("Nikola Zivkovic",
                    100234,
                    naziv,
                    punoImeProfesora,
                    ocena);
            niz.add(a);

            if (a.ispitJePolozen()){
                zbirOcenaPolozenihIspita = zbirOcenaPolozenihIspita + ocena;
                brojPolozenihIspita++;
            }

            zbirSvihOcena = zbirSvihOcena + ocena;
        }

        double prosecnaOcenaPolozenihPredmeta = zbirOcenaPolozenihIspita / brojPolozenihIspita;
        double prosecnaOcenaSvihPredmeta = zbirSvihOcena / n;

        for (int i = 0; i < niz.size(); i++) {
            niz.get(i).print();
        }

        System.out.println();

        System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcenaSvihPredmeta);
        System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozenihPredmeta);




    }
}
