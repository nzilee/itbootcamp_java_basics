package p_30_5_2022.igPost;

import java.util.ArrayList;

public class InstagramImage {

    private ArrayList<InstagramTag> niz = new ArrayList<>();
    private double dimenzija;
    private String link;

    public InstagramImage(double dimenzija, String link) {
        this.dimenzija = dimenzija;
        this.link = link;
    }

    public void dodajTag(InstagramTag x){
        this.niz.add(x);
    }

    public void print(){
        System.out.println("Putanja do slike je: " + this.link);
        System.out.println("Dimenzija slike je: " + this.dimenzija);
        for (int i = 0; i < this.niz.size(); i++) {
            this.niz.get(i).print();
        }
    }
}
