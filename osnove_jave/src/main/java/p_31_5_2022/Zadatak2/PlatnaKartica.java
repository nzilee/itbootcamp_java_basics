package p_31_5_2022.Zadatak2;

public class PlatnaKartica {

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

    public void izvrsiTransakciju(double iznos){
        this.suma = this.suma - iznos;
        if (this.suma < 0){
            this.suma = 0;
        }
    }

    public void print(){
        System.out.println(this.brKartice + ", " + this.mesec + "/" +
                this.godina + ", $" + this.suma);
    }
}
