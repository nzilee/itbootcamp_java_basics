package p_3_6_2022.Zadatak2;

public class Zgrada extends Objekat{

    private int brojStanova;

    public Zgrada(String adresa, int povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunajPorez() {
        return this.koeficijentZaPorez() * this.povrsina * this.brojStanova;
    }

    @Override
    public void print() {
        System.out.println("Adresa zgrade: " + this.adresa +
                ", broj stanova u objektu: " + this.brojStanova +
                ", povrsina objekta je: " + this.povrsina +
                " objekat se nalazi u zoni: " + this.zona);
    }
}
