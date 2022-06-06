package p_3_6_2022.Zadatak1;

import java.util.ArrayList;

public class Kasa {

    private ArrayList<Dodatak> nizDodataka = new ArrayList<>();
    private ArrayList<Proizvod> nizProizvoda = new ArrayList<>();

    public void dodajProizvod(Proizvod m){
        this.nizProizvoda.add(m);
    }

    public Kasa() {
        this.nizDodataka.add(new Dodatak("jaja", 12));
        this.nizDodataka.add(new Dodatak("slanina", 250));
        this.nizDodataka.add(new Dodatak("luk", 80));
        this.nizDodataka.add(new Dodatak("piletina", 120));
        this.nizDodataka.add(new Dodatak("prsuta", 300));
        this.nizDodataka.add(new Dodatak("cokolada", 125));
        this.nizDodataka.add(new Dodatak("vanila", 80));
        this.nizDodataka.add(new Dodatak("junetina", 350));
        this.nizDodataka.add(new Dodatak("paradajz", 120));
        this.nizDodataka.add(new Dodatak("pavlaka", 85));
    }

    public Dodatak trazi(String a){
        Dodatak x = null;
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            if (this.nizDodataka.get(i).getNaziv().equals(a)){
                x = this.nizDodataka.get(i);
            }
        } return x;
    }

    public int sracunajCenuPorudzbine(){
        int suma = 0;
        for (int i = 0; i < this.nizProizvoda.size(); i++) {
            suma = suma + this.nizProizvoda.get(i).ukupnaCena();
        }return suma;
    }


    public void printRacun(){
        for (int i = 0; i < this.nizProizvoda.size(); i++) {
            this.nizProizvoda.get(i).print();
            System.out.println();
        }
        System.out.println("Ukupan racun je: " + this.sracunajCenuPorudzbine());
    }
}
