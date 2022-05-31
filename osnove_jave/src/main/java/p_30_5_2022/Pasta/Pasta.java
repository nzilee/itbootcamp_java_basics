package p_30_5_2022.Pasta;

import java.util.ArrayList;

public class Pasta {

    private ArrayList<Sastojak> sastojci = new ArrayList<>();

    public void dodajSastojak(Sastojak ime){
        this.sastojci.add(ime);
    }

    public void obrisiSastojak(String ime){
        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(ime)){
                this.sastojci.remove(i);
            }
        }
    }

    public void cenaSvihSastojaka (){
        int suma = 0;

        for (int i = 0; i < this.sastojci.size(); i++) {
            suma = suma + this.sastojci.get(i).getCena();
        }
        System.out.println("Ukupna cena svih sastojaka je: " + suma);
    }

    public void print(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).print();
        }
    }
}
