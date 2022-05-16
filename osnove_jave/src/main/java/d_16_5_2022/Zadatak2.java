package d_16_5_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//  Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//  funkcije vraca novu vrednost koja se formira kao na primeru:

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost za a: ");
        String a = s.next();
        System.out.print("Unesite vrednost za b: ");
        String b = s.next();

        String brojevi = zalepljeniBrojevi(a , b);
        System.out.println(brojevi);

    }

    static String zalepljeniBrojevi(String a, String b){
        return a + b;
    }

}
