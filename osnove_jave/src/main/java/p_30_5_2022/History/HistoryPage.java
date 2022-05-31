package p_30_5_2022.History;

public class HistoryPage {

    private String nazivStranice;
    private String link;
    private int vremeOtvaranjaSat;
    private int vremeOtvaranjaMinut;
    private String username;
    private String password;

    public HistoryPage(String nazivStranice, String link, int vremeOtvaranjaSat, int vremeOtvaranjaMinut) {
        this.nazivStranice = nazivStranice;
        this.link = link;
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
        this.vremeOtvaranjaMinut = vremeOtvaranjaMinut;
    }

    public String getNazivStranice() {
        return nazivStranice;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getVremeOtvaranjaSat() {
        return vremeOtvaranjaSat;
    }

    public void setVremeOtvaranjaSat(int vremeOtvaranjaSat) {
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
    }

    public int getVremeOtvaranjaMinut() {
        return vremeOtvaranjaMinut;
    }

    public void setVremeOtvaranjaMinut(int vremeOtvaranjaMinut) {
        this.vremeOtvaranjaMinut = vremeOtvaranjaMinut;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void sacuvajKredencijale(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void obrisiKolacice (){
        this.username = null;
        this.password = null;
    }

    public void print(){
        System.out.print(this.vremeOtvaranjaSat + ":" + this.vremeOtvaranjaMinut +
                " - " + this.nazivStranice + " - " + this.link + " ");
        if (this.username != null){
            System.out.print("*");
        } else {
            System.out.print("");
        }
        System.out.println();
    }

}
