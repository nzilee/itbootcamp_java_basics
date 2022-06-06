package p_3_6_2022.Zadatak1;

import java.util.ArrayList;

public abstract class Proizvod {

    protected ArrayList<Dodatak> nizDodataka = new ArrayList<>();


    public void ubaciDodatak (Dodatak m){
        this.nizDodataka.add(m);
    }

    public int cenaSvihDodataka(){
        int suma = 0;
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            suma = suma + this.nizDodataka.get(i).getCena();
        }
        return suma;
    }

    public abstract int ukupnaCena();

    public abstract void print();
}
