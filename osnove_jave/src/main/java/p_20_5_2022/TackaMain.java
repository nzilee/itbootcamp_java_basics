package p_20_5_2022;
//  Za klasu Tacka, koja ima atribute:
//      x - x koordinata
//      y - y koordinata
//      metodu stampaj
//      imamo difoltni konstruktor
//      imamo konstuktor koji prima obe koordinate za kreiranje objekta
//  U glavnom programu kreirati objekte

public class TackaMain {
    public static void main(String[] args) {

        Tacka defaultni = new Tacka();

        defaultni.x = 3;
        defaultni.y = 9;

        System.out.println("Defaultni konstruktor");

        defaultni.print();

        System.out.println("-----------------------------------------------");

        Tacka neDefaultni = new Tacka(5, 8);

        System.out.println("Nedefaultni konstruktor");

        neDefaultni.print();
    }
}
