package d_30_5_2022.IspitStudent;

import java.util.ArrayList;

public class Student {

    private int brIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> predmeti = new ArrayList<>();

    public Student(int brIndeksa, String punoIme, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getPredmeti() {
        return predmeti;
    }

    public void dodajIspit(Ispit naziv){
        this.predmeti.add(naziv);
    }

    public double prosek(){
        int suma = 0;
        double brPolozenih = 0;
        for (int i = 0; i < this.predmeti.size(); i++) {
            if (this.predmeti.get(i).ispitJePolozen()){
            suma = suma + this.predmeti.get(i).getOcena();
            brPolozenih++;
            }
        }
        return suma / brPolozenih;
    }

    public void print(){
        System.out.println(this.brIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        System.out.println("------------------------------");
        for (int i = 0; i < this.predmeti.size(); i++) {
            this.predmeti.get(i).print();
        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }
}
