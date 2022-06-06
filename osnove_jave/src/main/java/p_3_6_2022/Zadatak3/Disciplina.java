package p_3_6_2022.Zadatak3;

import java.util.ArrayList;

public class Disciplina {

    private String ime;
    private String tip;
    private ArrayList<Atleticar> atleticari = new ArrayList<>();

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
    }

    public void dodajAtleticara(Atleticar m) {
        this.atleticari.add(m);
    }

    public void diskvalifikujAtleticara(String punoIme) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getPunoIme().equals(punoIme)) {
                this.atleticari.remove(i);
            }
        }
    }

    private Atleticar vratiNajboljegAtleticara() {
        Atleticar a = this.atleticari.get(0);

        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).boljiRezultat(a)){
                a = this.atleticari.get(i);
            }
        } return a;
    }

    public void stampajPobednika(){
        this.vratiNajboljegAtleticara().print();
    }
}

