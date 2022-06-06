package p_3_6_2022.Zadatak2;

public abstract class Objekat {

    protected String adresa;
    protected int povrsina;
    protected int zona;


    public Objekat(String adresa, int povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(int povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficijentZaPorez(){
        if (this.zona == 1){
            return 1.4;
        }
        if (this.zona == 2){
            return 1.1;
        }
        if (this.zona == 3){
            return 1.05;
        }
        return -1;
    }

    public abstract double racunajPorez();

    public abstract void print();

}
