package p_2_6_2022.Zadatak4;

public abstract class Figura {

    public abstract double povrsina();

    public abstract double obim();

    public void print(){
        System.out.println("Povrsina je " + this.povrsina());
        System.out.println("Obim je " + this.obim());
    }

    public abstract void ime();
}
