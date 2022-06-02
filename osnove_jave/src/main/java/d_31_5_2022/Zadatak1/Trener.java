package d_31_5_2022.Zadatak1;

public class Trener extends Osoba{

    private int godineIskustva;
    private String tip;

    public Trener(String punoIme, String jmbg,
                  int godRodjenja,
                  int godineIskustva, String tip) {
        super(punoIme, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(this.tip + ", " + this.godineIskustva + " godina iskustva");
    }
}
