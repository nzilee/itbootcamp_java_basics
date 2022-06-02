package p_31_5_2022.Zadatak3;

public class EONPaket extends Paket{

    public EONPaket(String punoImeKorisnika, int mesecnaCena, int ugovornaObaveza) {
        super(punoImeKorisnika, mesecnaCena, ugovornaObaveza);
        this.naziv = "EON LIGHT DUO";
        this.brzinaInternetaDownload = 150;
        this.brzinaInternetaUpload = 75;
    }

    @Override
    public int kolikoMeseciPo1RSD(){
        return 3;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(" + " + this.kolikoMeseciPo1RSD() + " meseci po 1 RSD");
    }


}
