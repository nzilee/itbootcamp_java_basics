package p_3_6_2022.Zadatak2;

public class Kuca extends Objekat {

    private int brojUkucana;

    public Kuca(String adresa, int povrsina, int zona, int brojUkucana) {
        super(adresa, povrsina, zona);
        this.brojUkucana = brojUkucana;
    }

    public int getBrojUkucana() {
        return brojUkucana;
    }

    public void setBrojUkucana(int brojUkucana) {
        this.brojUkucana = brojUkucana;
    }

    @Override
    public double racunajPorez() {
        return this.koeficijentZaPorez() * this.povrsina;
    }

    @Override
    public void print() {
        System.out.println("Adresa kuce: " + this.adresa +
                ", broj ukucana u objektu: " + this.brojUkucana +
                ", povrsina objekta je: " + this.povrsina +
                " objekat se nalazi u zoni: " + this.zona);
    }
}
