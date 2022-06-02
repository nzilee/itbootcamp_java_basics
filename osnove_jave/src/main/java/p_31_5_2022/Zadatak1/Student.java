package p_31_5_2022.Zadatak1;

public class Student extends Osoba{

    private int brIndeksa;
    private int dugSkolarina;

    public Student(String punoIme, String jmbg,
                   int brIndeksa, int dugSkolarina) {
        super(punoIme, jmbg);
        this.brIndeksa = brIndeksa;
        this.dugSkolarina = dugSkolarina;
    }

    public void uplatiSkolarinu(int uplata){
        this.dugSkolarina = this.dugSkolarina - uplata;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Broj indeksa je: " + this.brIndeksa);
        System.out.println("Preostali dug za skolarinu je: " + this.dugSkolarina);
    }
}
