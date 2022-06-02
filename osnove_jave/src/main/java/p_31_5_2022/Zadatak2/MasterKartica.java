package p_31_5_2022.Zadatak2;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(double suma, String brKartice, int godina, int mesec) {
        super(suma, brKartice, godina, mesec);
    }

    private double racunajProviziju(double iznos){
        double provizija = iznos * 0.015;
        if (provizija < 4){
            return 4;
        }
        return provizija;
    }

    @Override
    public void izvrsiTransakciju(double iznos){
        this.suma = this.suma - iznos - this.racunajProviziju(iznos);
        if (this.suma < 0){
            this.suma = 0;
        }
    }

    public void naplatiOdrzavanje (){
        this.suma = this.suma - 2;
    }

    @Override
    public void print(){
        System.out.print("Master Card: ");
        super.print();
    }
}
