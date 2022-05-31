package p_30_5_2022.History;

import java.util.ArrayList;

public class History {

    private ArrayList<HistoryPage> stranice = new ArrayList<>();

    public void otvoriStranicu(HistoryPage naziv){
        stranice.add(naziv);
    }

    public void obrisiPremaLinku(String link){
        for (int i = 0; i < this.stranice.size(); i++) {
            if (this.stranice.get(i).getLink().equals(link)){
                this.stranice.remove(i);
            }
        }
    }

    public void obrisiKolaciceZaLink (String link){
        for (int i = 0; i < this.stranice.size(); i++) {
            if (this.stranice.get(i).getLink().equals(link)){
                this.stranice.get(i).obrisiKolacice();
            }
        }
    }

    public void obrisiIstoriju (){
        this.stranice.clear();
    }

    public void sacuvajKredencijale (String naziv, String username, String password){
        for (int i = 0; i < this.stranice.size(); i++) {
            if (this.stranice.get(i).getNazivStranice().equals(naziv)){
                this.stranice.get(i).sacuvajKredencijale(username, password);
            }
        }
    }

    public void pogledajIstoriju(){
        for (int i = 0; i < this.stranice.size(); i++) {
            this.stranice.get(i).print();
        }
    }


}
