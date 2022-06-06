package p_3_6_2022.Zadatak2;

public class Lokal extends Objekat{

    public Lokal(String adresa, int povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    @Override
    public double racunajPorez() {
        return this.koeficijentZaPorez() * this.povrsina * 1.3;
    }

    @Override
    public void print() {
        System.out.println("Adresa lokala: " + this.adresa +
                ", povrsina objekta je: " + this.povrsina +
                " objekat se nalazi u zoni: " + this.zona);
    }
}
