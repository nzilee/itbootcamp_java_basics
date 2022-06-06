package d_3_6_2022;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza m){
        this.ambalaze.add(m);
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            this.ambalaze.get(i).getBarkod();
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(double popust){
        double sveAmbalazeCena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            sveAmbalazeCena += this.ambalaze.get(i).cenaArtikla();

        } return sveAmbalazeCena - popust;
    }

    public double cenaKorpe (SuperKartica m){
        return this.cenaSvihAmbalaza(m.getPopust());
    }

    public void print(){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            System.out.println(this.ambalaze.get(i).getNazivArtikla());
            this.ambalaze.get(i).print();
            System.out.println();
        }
        System.out.println();
    }
}
