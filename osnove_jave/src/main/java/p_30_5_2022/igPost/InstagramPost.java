package p_30_5_2022.igPost;

import java.util.ArrayList;

public class InstagramPost {

    private ArrayList<InstagramImage> nizSlika = new ArrayList<>();
    private String opis;

    public InstagramPost(String opis) {
        this.opis = opis;
    }

    public void dodajSliku(InstagramImage x){
        this.nizSlika.add(x);
    }

    public void print(){
        System.out.println("Opis: " + this.opis);
        for (int i = 0; i < this.nizSlika.size(); i++) {
            this.nizSlika.get(i).print();
        }
    }
}
