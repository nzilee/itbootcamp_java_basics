package p_2_6_2022.Zadatak1;

public abstract class Student {

    protected String punoIme;
    protected int brIndeksa;
    protected int godinaStudija;

    public Student(String punoIme, int brIndeksa, int godinaStudija) {
        this.punoIme = punoIme;
        this.brIndeksa = brIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public Student() {
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract int cenaSkolarine();

    public abstract boolean naBudzetu();

    public void print(){
        System.out.println("Ime i prezime studenta: " + this.punoIme + ", " +
                this.brIndeksa + ", " + this.godinaStudija);
        System.out.print("Finansiranje: ");
        if (this.naBudzetu()){
            System.out.println("budzet");
        } else {
            System.out.println("samofinansiranje");
        }
        System.out.println("Cena skolarine: " + this.cenaSkolarine());
    }
}
