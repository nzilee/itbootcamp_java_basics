package p_18_5_2022;

import java.util.Scanner;

public class MainRacun {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Racun nikola = new Racun();

        nikola.brojRacuna = "12345678";
        nikola.imeIPrezime = "Nikola Zivkovic";
        nikola.stanje = 6236.53;

        Racun marko = new Racun();

        marko.brojRacuna = "87654321";
        marko.imeIPrezime = "Marko Markovic";
        marko.stanje = 32.88;

        System.out.println("Posiljalac: " + nikola.imeIPrezime + ", " +
                nikola.brojRacuna + ", stanje: " + nikola.stanje);

        System.out.println("Primalac: " + marko.imeIPrezime + ", " +
                marko.brojRacuna + ", stanje: " + marko.stanje);

        System.out.println("-------------------------------------");

        System.out.print("Unesite sumu za transakciju: ");
        double sumaTransakcije = s.nextDouble();

        nikola.stanje = nikola.stanje - sumaTransakcije;
        marko.stanje = marko.stanje + sumaTransakcije;

        System.out.println("-------------------------------------");
        System.out.println("Stanje nakon transakcije");
        System.out.println("-------------------------------------");

        System.out.println("Posiljalac: " + nikola.imeIPrezime + ", " +
                nikola.brojRacuna + ", stanje: " + nikola.stanje);
        System.out.println("Primalac: " + marko.imeIPrezime + ", " +
                marko.brojRacuna + ", stanje: " + marko.stanje);



    }
}
