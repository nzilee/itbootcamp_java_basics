package p_16_5_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//  Napisati metodu stampajApsolutnuVrednost,
//  koja stampa apsolutnu vrednost   prosledjene vrednosti.
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost za a: ");
        int a = s.nextInt();

        stampajApsolutnuVrednost(a);
    }
    static void stampajApsolutnuVrednost(int a){
        if (a < 0){
            a = a * -1;
        }
        System.out.println("Apsolutna vrednost je " + a);
    }

}
