package p_3_6_2022.Zadatak1;

public class Pica extends Proizvod{

    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int cenaSvihDodataka() {
        return super.cenaSvihDodataka();
    }

    @Override
    public int ukupnaCena() {
        return this.cenaSvihDodataka() + this.cenaPodloge;
    }


    @Override
    public void print() {
        System.out.print("Pica sa dodacima: ");
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            System.out.print(this.nizDodataka.get(i).getNaziv() + ", ");
        }
        System.out.println();
        System.out.println("Ukupna cena sa dodacima je: " + this.ukupnaCena());
    }
}
