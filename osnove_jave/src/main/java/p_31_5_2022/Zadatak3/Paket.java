package p_31_5_2022.Zadatak3;

public class Paket {

    protected String naziv;
    protected String punoImeKorisnika;
    protected int mesecnaCena;
    protected int ugovornaObaveza;
    protected double brzinaInternetaDownload;
    protected double brzinaInternetaUpload;

    public Paket(String punoImeKorisnika, int mesecnaCena, int ugovornaObaveza) {
        this.punoImeKorisnika = punoImeKorisnika;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public String getPunoImeKorisnika() {
        return punoImeKorisnika;
    }

    public void setPunoImeKorisnika(String punoImeKorisnika) {
        this.punoImeKorisnika = punoImeKorisnika;
    }

    public int getMesecnaCena() {
        return mesecnaCena;
    }

    public void setMesecnaCena(int mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getBrzinaInternetaDownload() {
        return brzinaInternetaDownload;
    }

    public double getBrzinaInternetaUpload() {
        return brzinaInternetaUpload;
    }

    public void produziUgovor(){
        this.ugovornaObaveza = this.ugovornaObaveza + 12;
    }

    public int kolikoMeseciPo1RSD(){
        return 0;
    }

    public void print(){
        System.out.println("Ime i prezime: " + this.punoImeKorisnika);
        System.out.println(this.naziv + " - " +
                this.brzinaInternetaDownload + "/" + this.brzinaInternetaUpload +
                " - " + this.ugovornaObaveza);
        System.out.print("Cena je: " + this.mesecnaCena);
    }
}
