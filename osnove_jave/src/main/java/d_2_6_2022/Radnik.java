package d_2_6_2022;

import java.util.ArrayList;

public abstract class Radnik {

    protected String punoIme;
    protected ArrayList<Sektor> nizSektora = new ArrayList<>();

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }

    public abstract double plataRadnika();

    public void zaposliUSektor(Sektor m){
        this.nizSektora.add(m);
    }
}
