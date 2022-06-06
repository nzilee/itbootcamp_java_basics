package d_2_6_2022;

public class Sektor {

    private String naziv;
    private int plata;

    public Sektor(String naziv, int plata) {
        this.naziv = naziv;
        this.plata = plata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
}
