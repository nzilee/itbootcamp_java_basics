package d_3_6_2022;

public class SuperKartica {

    private String brojKartice;
    private String punoImeVlasnika;
    private double popust;

    public SuperKartica(String brojKartice, String punoImeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void print(){
        System.out.println(this.brojKartice + ", " + this.punoImeVlasnika);
    }
}
