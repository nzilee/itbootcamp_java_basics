package d_31_5_2022.Zadatak1;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private boolean jesteKapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg,
                 int godRodjenja, int broj,
                 String pozicija, boolean jesteKapiten) {
        super(punoIme, jmbg, godRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
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

    @Override
    public void print(){
        super.print();
        System.out.print(this.broj + ", " + this.pozicija);
        if (this.jesteKapiten){
            System.out.println(", kapiten");
        } else {
            System.out.println("");
        }
    }
}
