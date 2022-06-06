package DrugiJavaTest;

public class InstagramLocationAddOn extends InstagramAddOn{

    private String nazivLokacije;


    public InstagramLocationAddOn(int ID, int x, int y,
                                  int visina, int sirina,
                                  String nazivLokacije) {
        super(ID, x, y, visina, sirina);
        this.nazivLokacije = nazivLokacije;
    }


    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    @Override
    public int minSirina() {
        return 100;
    }

    @Override
    public int minVisina() {
        return 50;
    }

    @Override
    public void print() {
        System.out.println(this.X + ", " + this.Y +
                " (" + this.visina + ", " + this.sirina + ")" +
                " L " + this.nazivLokacije);
    }
}
