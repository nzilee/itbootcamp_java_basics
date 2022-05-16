package d_16_5_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//  Napisati metodu koja stampa podatke o korisniku u formatu:
//  JMBG: [jmbg]
//  Ime: [ime]
//  Prezime: [prezime]
//  God. rodjenja: [god]
//  Aktivan: [true/false]
//  Metoda prima jmbg, ime, prezime, god rodjenja i da
//  li je aktivan kao parametre metode.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite svoj JMBG: ");
        String jmbg = s.next();
        System.out.print("Unesite svoje ime: ");
        String ime = s.next();
        System.out.print("Unesite svoje prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();
        System.out.print("Unesite true/false shodno tome da li ste aktivni: ");
        boolean aktivan = s.nextBoolean();
        System.out.println();

        personalInfo(jmbg, ime, prezime, godinaRodjenja, aktivan);
    }
    static void personalInfo(String jmbg, String ime, String prezime, int godRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg + "\n" +
                "Ime: " + ime + "\n" +
                "Prezime: " + prezime + "\n" +
                "Godina rodjenja: " + godRodjenja + "\n" +
                "Aktivan: " + aktivan);
    }
}
