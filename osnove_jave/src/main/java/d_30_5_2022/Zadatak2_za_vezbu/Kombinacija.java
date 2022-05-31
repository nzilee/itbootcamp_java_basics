package d_30_5_2022.Zadatak2_za_vezbu;

import java.util.ArrayList;

public class Kombinacija {

    private int ID;
    private ArrayList<Integer> niz = new ArrayList<>();
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public Kombinacija(int ID, int br1, int br2, int br3, int br4, int br5, int br6, int br7) {
        this.ID = ID;
        this.a = br1;
        this.b = br2;
        this.c = br3;
        this.d = br4;
        this.e = br5;
        this.f = br6;
        this.g = br7;
        this.niz.add(a);
        this.niz.add(b);
        this.niz.add(c);
        this.niz.add(d);
        this.niz.add(e);
        this.niz.add(f);
        this.niz.add(g);
    }

    public int getID() {
        return ID;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public int getG() {
        return g;
    }

    public boolean daLiJeIstaKombinacija (Kombinacija k){
        if (this.niz.get(0) == k.a &&
                this.niz.get(1) == k.b &&
                this.niz.get(2) == k.c &&
                this.niz.get(3) == k.d &&
                this.niz.get(4) == k.e &&
                this.niz.get(5) == k.f &&
                this.niz.get(6) == k.g){
            return true;
        } else return false;
    }

    public void print(){
        System.out.println("ID: " + this.ID);
        System.out.println("Brojevi: ");
        for (int i = 0; i < this.niz.size(); i++) {
            if (i >= 6){
                System.out.println(this.niz.get(i));
            } else {
            System.out.print(this.niz.get(i) + ", ");
            }
        }
    }
}
