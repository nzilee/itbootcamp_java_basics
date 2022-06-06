package p_2_6_2022.Zadatak3;

public class VideoPlayer {

    private int duzinaVidea;
    private int trenuntnoVremeVidea;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer(int duzinaVidea, int trenuntnoVremeVidea,
                       int jacinaZvuka,
                       int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenuntnoVremeVidea = trenuntnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenuntnoVremeVidea() {
        return trenuntnoVremeVidea;
    }

    public void setTrenuntnoVremeVidea(int trenuntnoVremeVidea) {
        this.trenuntnoVremeVidea = trenuntnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public void print(){
        System.out.println("Trenutno vreme videa (u sekundama): " + this.trenuntnoVremeVidea);
        System.out.println("Trenutna jacina zvuka je: " + this.jacinaZvuka);
        System.out.println("Trenutan kvalitet videa je: " + this.kvalitetVidea);
    }

}
