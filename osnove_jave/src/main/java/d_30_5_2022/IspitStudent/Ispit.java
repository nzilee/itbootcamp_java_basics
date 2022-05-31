package d_30_5_2022.IspitStudent;

public class Ispit {

    private String nazivPredmeta;
    private int ocena;
    private String punoImeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String punoImeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.punoImeProfesora = punoImeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImeProfesora() {
        return punoImeProfesora;
    }

    public void setPunoImeProfesora(String punoImeProfesora) {
        this.punoImeProfesora = punoImeProfesora;
    }

    public boolean ispitJePolozen (){
        if (this.ocena > 5 && this.ocena <= 10){
            return true;
        }
        return false;
    }

    public void print(){
        System.out.println(this.nazivPredmeta + " - " +
                this.punoImeProfesora + " - " + this.ocena);
    }
}
