package p_3_6_2022.Zadatak2;

import java.util.ArrayList;

public class PoreskaUprava {

    private String imeGrada;
    private ArrayList<Objekat> objekti = new ArrayList<>();

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public void dodajObjekat(Objekat m){
        this.objekti.add(m);
    }

    public double ukupanPorez(){
        double porez = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            porez += this.objekti.get(i).racunajPorez();
        }
        return porez;
    }




    public Objekat najveciPorez(){
        int index = 0;
        double max = this.objekti.get(0).racunajPorez();

        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunajPorez() > max){
                max = this.objekti.get(i).racunajPorez();
                index = i;
            }
        } return this.objekti.get(index);
    }
    public Objekat najmanjiPorez(){
        int index = 0;
        double min = this.objekti.get(0).racunajPorez();

        for (int i = 0; i < this.objekti.size(); i++) {
            if (this.objekti.get(i).racunajPorez() < min){
                min = this.objekti.get(i).racunajPorez();
                index = i;
            }
        } return this.objekti.get(index);
    }

    public void print(){
        for (int i = 0; i < this.objekti.size(); i++) {
            this.objekti.get(i).print();
            System.out.println();
        }
        System.out.println("Objekat sa najvecim porezom je: " + this.najveciPorez().adresa);
        System.out.println("Objekat sa najmanjim porezom je: " + this.najmanjiPorez().adresa);
    }


    }
