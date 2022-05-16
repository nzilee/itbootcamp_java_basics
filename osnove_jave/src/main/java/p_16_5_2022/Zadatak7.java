package p_16_5_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
// Napisati metodu koja vraca suprotno negativna broj od
// prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.

        int broj = suprotanBroj(1321);
        System.out.println("Suprotan broj je " + broj);
    }

    static int suprotanBroj(int a){
        int suprotan = a * (-1);
        return suprotan;
    }
}
