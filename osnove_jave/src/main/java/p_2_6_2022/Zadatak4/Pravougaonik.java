package p_2_6_2022.Zadatak4;

public class Pravougaonik extends Figura{

    private int stranicaA;
    private int stranicaB;


    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(int stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return this.stranicaA * this.stranicaB;
    }

    @Override
    public double obim() {
        return 2 * (this.stranicaA) + 2 * (this.stranicaB);
    }

    @Override
    public void print(){
        System.out.println("Praovugaonik sa stranicama " + this.stranicaA + " i " + this.stranicaB);
        super.print();
    }

    @Override
    public void ime(){
        System.out.print("pravougaonika");
    }
}
