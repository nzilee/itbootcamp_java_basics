package d_31_5_2022.Zadatak2_Za_Vezbanje;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private ArrayList<Karton> nizKartona = new ArrayList<>();
    private boolean jesteKapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg,
                 int godRodjenja, int broj,
                 String pozicija,
                 ArrayList<Karton> nizKartona,
                 boolean jesteKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.nizKartona = nizKartona;
        this.jesteKapiten = jesteKapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJesteKapiten() {
        return jesteKapiten;
    }

    public void setJesteKapiten(boolean jesteKapiten) {
        this.jesteKapiten = jesteKapiten;
    }

    public void dodajKarton(Karton k){
        this.nizKartona.add(k);
    }

    public int brZutih(){
        int brojZ = 0;

        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTip().equals("zuti")){
                brojZ++;
            }
        }
        return brojZ;
    }

    public int brCrvenih(){
        int brojC = 0;

        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getTip().equals("crveni")){
                brojC++;
            }
        }
        return brojC;
    }

    @Override
    public void print(){
        super.print();
        System.out.print(this.broj + ", " + this.pozicija);
        if (this.jesteKapiten){
            System.out.println(", kapiten");
        } else {
            System.out.println("");
        }
        System.out.println("Broj kartona \nzutih: " + this.brZutih() + " | " + "crvenih: " + this.brCrvenih());
    }
}
