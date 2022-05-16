package p_16_5_2022;

public class Zadatak6 {
    public static void main(String[] args) {
//  Napisati metodu koja stampa N zvezdica u istom redu.
//  Broj zvezdica je odredjen parametrom N.

        nPrint(1);
        nPrint(2);
        nPrint(3);
        nPrint(4);
        nPrint(5);
        nPrint(6);
        nPrint(7);
        nPrint(8);
    }

    static void nPrint(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
