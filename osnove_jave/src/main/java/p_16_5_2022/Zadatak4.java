package p_16_5_2022;

import java.util.ArrayList;

public class Zadatak4 {
    public static void main(String[] args) {
//  Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//  za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//  U gravnom programu pozvati nekoliko puta funkciju sa razlicitim
//  prosledjenim vrednostima.

        zbirRazlikaProizvodKolicnik(10, 2);
        System.out.println();
        zbirRazlikaProizvodKolicnik(32, 4);
        System.out.println();
        zbirRazlikaProizvodKolicnik(531, 3);
    }

    static void zbirRazlikaProizvodKolicnik(int broj1, int broj2){
        System.out.println("Zbir brojeva je: " + (broj1 + broj2));
        System.out.println("Razlika brojeva je: " + (broj1 - broj2));
        System.out.println("Proizvod brojeva je: " + (broj1 * broj2));
        System.out.println("Kolicnik brojeva je: " + (broj1 / broj2));
    }

}
