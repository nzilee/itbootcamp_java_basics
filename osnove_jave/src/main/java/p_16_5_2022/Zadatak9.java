package p_16_5_2022;

public class Zadatak9 {
    public static void main(String[] args) {
//  Napisati metodu koja vrsi konverziju rimske u arapske brojeve.

        int arapski = arapskiBrojevi("IX");
        System.out.println(arapski);
    }
    static int arapskiBrojevi(String a){

        int broj1 = 1;
        int broj2 = 2;
        int broj3 = 3;
        int broj4 = 4;
        int broj5 = 5;
        int broj6 = 6;
        int broj7 = 7;
        int broj8 = 8;
        int broj9 = 9;
        int broj10 = 10;

        if (a.equals("I")){
           return broj1;
       } else if (a.equals("II")) {
            return broj2;
        } else if (a.equals("III")) {
            return broj3;
        } else if (a.equals("IV")) {
            return broj4;
        } else if (a.equals("V")) {
            return broj5;
        } else if (a.equals("VI")) {
            return broj6;
        } else if (a.equals("VII")) {
            return broj7;
        } else if (a.equals("VIII")) {
            return broj8;
        } else if (a.equals("IX")) {
            return broj9;
        } else if (a.equals("X")) {
            return broj10;
        } else {
            return 0;
        }
    }
}
