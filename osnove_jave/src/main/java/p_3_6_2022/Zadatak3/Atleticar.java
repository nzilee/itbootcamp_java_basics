package p_3_6_2022.Zadatak3;

public abstract class Atleticar {

    private String punoIme;
    protected int rezultat;

    public Atleticar(String punoIme, int rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean boljiRezultat (Atleticar m);

    public void print(){
        System.out.println("Ime i prezime atleticara: " + this.punoIme + ", " + this.rezultat);
    }

}
