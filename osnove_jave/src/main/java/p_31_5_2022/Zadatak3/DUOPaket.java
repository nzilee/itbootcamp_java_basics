package p_31_5_2022.Zadatak3;

public class DUOPaket extends Paket{

    public DUOPaket(String punoImeKorisnika, int mesecnaCena, int ugovornaObaveza) {
        super(punoImeKorisnika, mesecnaCena, ugovornaObaveza);
        this.naziv = "EON FULL DUO";
        this.brzinaInternetaDownload = 250;
        this.brzinaInternetaUpload = 100;
    }

    public void povecajBrzinu(int download, int upload){
        this.brzinaInternetaDownload = this.brzinaInternetaDownload + download;
        this.brzinaInternetaUpload = this.brzinaInternetaUpload + upload;
    }

    @Override
    public int kolikoMeseciPo1RSD(){
        return 6;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(" + " + this.kolikoMeseciPo1RSD() + " meseci po 1 RSD");
    }
}
