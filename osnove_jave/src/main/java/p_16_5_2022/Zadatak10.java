package p_16_5_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
//  Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare
//  prema dole navedenoj konverziji. Metoda od parametara prima vrednost u
//  eurima kao i valutu u kojoj je potrebno izvrsiti konverziju
//  (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati
//  funkciju za neki od primera.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima: ");
        double euri = s.nextDouble();
        System.out.print("Unesite valutu za konverziju: ");
        String valuta = s.next();

        double konvertovano = konverzija(euri, valuta);
        System.out.println(konvertovano);
    }

    static double konverzija(double euri, String valuta){

        if (valuta.equals("RSD")){
            double konvertovano = euri * 117.54;
            return konvertovano;
        } else if (valuta.equals("USD")) {
            double konvertovano = euri * 1.04;
            return konvertovano;
        } else if (valuta.equals("RUB")) {
            double konvertovano = euri * 67.41;
            return konvertovano;
        } else {
            return -1;
        }
    }
}
