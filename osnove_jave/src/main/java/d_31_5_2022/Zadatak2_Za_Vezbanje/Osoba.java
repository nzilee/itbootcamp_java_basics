package d_31_5_2022.Zadatak2_Za_Vezbanje;

public class Osoba {

    protected String punoIme;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String punoIme, String jmbg, int godRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void print(){
        System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godRodjenja);
    }

}
