package d_13_5_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//  Napisati program koji uci korisnika da kaze “Molim te”. Program od
//  korisnika ucitava zahteve koje treba da izvrsi ali jedino reaguje
//  ukoliko korisnik lepo zamoli ( u zahtevu unese “Molim te”).
//  Ukoliko korisnik unese zahtev u vidu naredjivanja, program ne
//  reaguje na takve zahteve tj. nista ne ispisuje, a ukoliko korisnik
//  zamoli tada program ispisuje “Dogovoreno!”. Program radi dok
//  korisnik ne unese “Hvala!”. Na kraju programa ispisati “Cao”

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite zahtev: ");
        String zahtev = s.nextLine();


        while (zahtev.contains("molim te")) {
            System.out.println("Dogovoreno!");

            System.out.print("Unesite zahtev: ");
            zahtev = s.nextLine();
            if (zahtev.contains("hvala")){
                System.out.println("Cao");
            }

        }

    }
}
