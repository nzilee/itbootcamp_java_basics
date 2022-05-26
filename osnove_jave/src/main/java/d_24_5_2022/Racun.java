package d_24_5_2022;

public class Racun {

    private String broj;
    private String punoImeVlasnika;
    private double stanje;

    public Racun(String broj, String punoImeVlasnika, double stanje) {
        this.broj = broj;
        this.punoImeVlasnika = punoImeVlasnika;
        this.stanje = stanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public double getStanje() {
        return stanje;
    }

    public double promenaStanja (double transakcija){
        if (this.stanje > 0){
            this.stanje = this.stanje + transakcija;
            return this.stanje;
        } else {
         return this.stanje;
        }
    }

    public void print (){
        System.out.println(this.punoImeVlasnika + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.stanje + " rsd");
    }
}
