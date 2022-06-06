package p_3_6_2022.Zadatak1;

public class IcePoint extends Proizvod{

    private String tip;
    private boolean veliki;


    public IcePoint(String tip, boolean veliki) {
        this.tip = tip;
        this.veliki = veliki;
    }

    @Override
    public int ukupnaCena() {
        if (veliki){
            return cenaSvihDodataka() + 130;
        } else {
            return cenaSvihDodataka() + 100;
        }
    }

    @Override
    public void print() {
        System.out.println("IcePoint sladoled");
        System.out.print("Ukus " + this.tip + ", ");
        if (veliki){
            System.out.println("veliki");
        } else {
            System.out.println("mali");
        }
        System.out.print("Sa dodacima: ");
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            System.out.print(this.nizDodataka.get(i).getNaziv() + ", ");
        }
        System.out.println();
        System.out.println("Ukupna cena sladoleda sa dodacima je: " + this.ukupnaCena());
    }
}
