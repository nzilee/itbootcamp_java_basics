package p_31_5_2022.Zadatak2;

public class VisaKartica extends PlatnaKartica{

    private String ovlascenoLice;


    public VisaKartica(double suma, String brKartice, int godina,
                       int mesec, String ovlascenoLice) {
        super(suma, brKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    private double racunajProviziju(double iznos){
        double provizija = iznos * 0.018;
        if (provizija < 4){
            return 4;
        }
        return provizija;
    }

    @Override
    public void izvrsiTransakciju(double iznos){
        this.suma = this.suma - iznos - this.racunajProviziju(iznos);
        if (this.suma < 0){
            this.suma = 0;
        }
    }

    @Override
    public void print(){
        System.out.print("Visa Card: ");
        super.print();
    }
}
