package p_16_5_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
//  Napisati metodu koja proverava da li je trougao pravougli.
//  Metoda prima stranice trougla i hipotenuzu trougla. Ako je
//  trougao pravougli onda vraca true, u suptrotnom vraca false.
//  Trougao je pravougli ukoliko je a*a+b*b=c*c

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu stranice a: ");
        int stranicaA = s.nextInt();
        System.out.print("Unesite duzinu stranice b: ");
        int stranicaB = s.nextInt();
        System.out.print("Unesite duzinu stranice c: ");
        int stranicaC = s.nextInt();

        boolean trougaoJePravougli = jestePravougli(stranicaA, stranicaB, stranicaC);
        System.out.println(trougaoJePravougli);
    }
    static boolean jestePravougli(int a, int b, int c){
        if ((a*a) + (b*b) == (c*c)){
            return true;
        } else {
            return false;
        }
    }
}
