package p_3_6_2022.Zadatak3;

public class Skakac extends Atleticar{


    public Skakac(String punoIme, int rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean boljiRezultat(Atleticar m) {
        if (this.rezultat > m.rezultat){
            return true;
        } else {
            return false;
        }
    }
}
