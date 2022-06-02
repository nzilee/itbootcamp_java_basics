package p_31_5_2022.Zadatak1;

public class Osoba {

        protected String punoIme;
        protected String jmbg;


    public Osoba(String punoIme, String jmbg) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
    }

    public void print(){
        System.out.println(this.punoIme + ", " + this.jmbg);
    }
}
