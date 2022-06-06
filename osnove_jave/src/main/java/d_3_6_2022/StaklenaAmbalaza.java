package d_3_6_2022;

public class StaklenaAmbalaza extends Ambalaza{

    private int kaucija;
    private boolean placaSeKaucija;
    private int osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla,
                            int netoTezina, int brutoTezina,
                            int kaucija, boolean placaSeKaucija,
                            int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.placaSeKaucija){
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.print("Staklena ambalaza ");
        if (this.placaSeKaucija){
            System.out.print("sa cenom kaucije " + this.kaucija);
        } else {
            System.out.print("bez kaucije ");
        }
        System.out.println(" cija je osnovna cena " + this.osnovnaCena + ", a cena artikla je " + this.cenaArtikla());
    }
}
