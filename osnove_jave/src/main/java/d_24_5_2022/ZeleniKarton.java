package d_24_5_2022;

public class ZeleniKarton {

    private String punoImeStudenta;
    private int brIndeksa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String punoImeStudenta, int brIndeksa, String nazivPredmeta, String punoImeProfesora, int ocena) {
        this.punoImeStudenta = punoImeStudenta;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }

    public boolean ispitJePolozen(){
        if (this.ocena > 5){
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.punoImeProfesora);
    }
}
