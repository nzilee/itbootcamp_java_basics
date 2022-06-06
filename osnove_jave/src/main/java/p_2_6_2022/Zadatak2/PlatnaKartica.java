package p_2_6_2022.Zadatak2;

public abstract class PlatnaKartica {

    protected double suma;
    protected String brKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(double suma, String brKartice, int godina, int mesec) {
        this.suma = suma;
        this.brKartice = brKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void dodajSredstva(int dodaj){
        this.suma = this.suma + dodaj;
    }

    public abstract void izvrsiTransakciju(double iznos);

    public abstract void print();
}
