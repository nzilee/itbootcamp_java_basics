package d_30_5_2022.Zadatak2_za_vezbu;

import java.util.ArrayList;

public class Listic {

    private ArrayList<Kombinacija> nizKombinacija = new ArrayList<>();

    public void dodajKombinaciju(Kombinacija k){
        this.nizKombinacija.add(k);
    }

    public boolean kombinacijaJeDobitna(Kombinacija dobitna) {
        for (int i = 0; i < this.nizKombinacija.size(); i++) {
            if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(dobitna)) {
                return true;
            }
        }
        return false;
    }

    public void printDobitna(Kombinacija dobitna){
        for (int i = 0; i < this.nizKombinacija.size(); i++) {
            if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(dobitna)){
                dobitna.print();
            }
        }
    }

    public void print(Kombinacija dobitna){
        for (int i = 0; i < this.nizKombinacija.size(); i++) {
            this.nizKombinacija.get(i).print();
            System.out.println("---------------------------");
        }
        System.out.println("Dobitna kombinacija je: ");
        printDobitna(dobitna);
    }
}
