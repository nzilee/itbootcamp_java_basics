package d_3_6_2022;

public class Tetrapak extends Ambalaza{

    private boolean reciklabilno;
    private int osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla,
                    int netoTezina, int brutoTezina,
                    boolean reciklabilno, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklabilno = reciklabilno;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklabilno() {
        return reciklabilno;
    }

    public void setReciklabilno(boolean reciklabilno) {
        this.reciklabilno = reciklabilno;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (this.reciklabilno){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void print() {
        System.out.print("Tetrapak ");
        if (this.reciklabilno){
            System.out.print("od reciklabilnog materijala ");
        } else {
            System.out.print("od nereciklabilnog materijala ");
        }
        System.out.println("cija je cena " + this.cenaArtikla());
    }
}
