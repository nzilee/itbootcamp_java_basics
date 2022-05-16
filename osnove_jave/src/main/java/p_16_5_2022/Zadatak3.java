package p_16_5_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//  Napisati metodu koja stampa zvezdicu sa razmakom.
//  U glavnom programu je potrebno odstampati sledecu sliku:
//  *  *  *
//  *  *
//  *

        for (int i = 0; i < 6; i++) {
            printStar();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            printStar();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            printStar();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            printStar();
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            printStar();
        }
        System.out.println();
        printStar();
    }
    static void printStar(){
        System.out.print("* ");
    }

}
