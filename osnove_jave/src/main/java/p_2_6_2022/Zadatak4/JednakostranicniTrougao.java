package p_2_6_2022.Zadatak4;

public class JednakostranicniTrougao extends Figura{

    private int stranicaA;

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        return (this.stranicaA * this.stranicaA) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return (this.stranicaA) * 3;
    }

    @Override
    public void print(){
        System.out.println("Jednakostranicni trougao sa stranicom " + this.stranicaA);
        super.print();
    }

    @Override
    public void ime(){
        System.out.print("jednakostranicnog trougla");
    }
}
