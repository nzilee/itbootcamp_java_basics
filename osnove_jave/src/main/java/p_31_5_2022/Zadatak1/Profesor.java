package p_31_5_2022.Zadatak1;

public class Profesor extends Osoba{

    private String nazivPredmeta;
    private double plata;

    public Profesor(String punoIme, String jmbg,
                    String nazivPredmeta, int plata) {
        super(punoIme, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.plata = plata;
    }

    public void povecajPlatu(double povecanje){
        this.plata = this.plata * povecanje;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Naziv predmeta: " + this.nazivPredmeta);
        System.out.println("Plata profesora je: " + this.plata);
    }
}
