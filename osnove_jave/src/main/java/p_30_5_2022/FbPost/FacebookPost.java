package p_30_5_2022.FbPost;

import java.util.ArrayList;

public class FacebookPost {

    private String punoImeKorisnika;
    private String tekst;
    private ArrayList<Reakcija> niz = new ArrayList<>();

    public FacebookPost(String punoImeKorisnika, String tekst) {
        this.punoImeKorisnika = punoImeKorisnika;
        this.tekst = tekst;
    }

    public void dodajReakciju(Reakcija reakcija){
        this.niz.add(reakcija);
    }

    private int brojReakcija (String naziv){
        int ukupnoReakcija = 0;
        for (int i = 0; i < this.niz.size(); i++) {
            if (this.niz.get(i).getReakcija().equals(naziv)){
                ukupnoReakcija++;
            }
        }
        return ukupnoReakcija;
    }

    public void modifikacijaReaguj (Reakcija r){
        for (int i = 0; i < this.niz.size(); i++) {
            if (this.niz.get(i).getPunoImeKorisnika().equals(r.getPunoImeKorisnika())){
                this.niz.remove(i);
            }
        }
        this.niz.add(r);
    }

    public void print(){
        System.out.println(this.punoImeKorisnika);
        System.out.println(this.tekst);

        System.out.println("Smajli " + this.brojReakcija(("Smajli")) + " | " +
                "Like " + this.brojReakcija(("Lajk")) + " | " +
                "Srce " + this.brojReakcija(("Srce")));
        }
}
