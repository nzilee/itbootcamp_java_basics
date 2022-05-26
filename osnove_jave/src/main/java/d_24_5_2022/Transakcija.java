package d_24_5_2022;

public class Transakcija {

    private int ID;
    private Racun posiljalac;
    private Racun primalac;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    public Transakcija(int ID, Racun posiljalac, Racun primalac) {
        this.ID = ID;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    private double provizija(double transakcija){
        if (transakcija < 4500){
            return 45;
        } else if (transakcija >= 4500) {
            return transakcija * 0.01;
        }
        return -1;
    }

    public void izvrsiTransakciju(double vrednost){
        this.posiljalac.promenaStanja(-(vrednost + provizija(vrednost)));
        this.primalac.promenaStanja(vrednost);
    }

    public void print(){
        System.out.println("ID transakcije " + this.ID);
        System.out.print("Sa racuna: ");
        this.posiljalac.print();
        System.out.print("Na racun: ");
        this.primalac.print();
    }


}
