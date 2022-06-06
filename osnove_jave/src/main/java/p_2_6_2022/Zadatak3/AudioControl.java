package p_2_6_2022.Zadatak3;

public class AudioControl extends Control{

    private boolean pojacava;

    public boolean isPojacava() {
        return pojacava;
    }

    public void setPojacava(boolean pojacava) {
        this.pojacava = pojacava;
    }

    public AudioControl(boolean pojacaj) {
        this.pojacava = pojacaj;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer v) {
        int buducaJacina = v.getJacinaZvuka();

        if (pojacava){
            buducaJacina = buducaJacina + 1;
        } else {
            buducaJacina = buducaJacina - 1;
        }

        if (buducaJacina > 99){
            buducaJacina = 100;
        }
        if (buducaJacina < 1){
            buducaJacina = 0;
        }
        v.setJacinaZvuka(buducaJacina);

        /*if (v.getJacinaZvuka() > 1 && v.getJacinaZvuka() < 100){
            if (pojacava){
                v.setJacinaZvuka(v.getJacinaZvuka()+1);
            } else {
                v.setJacinaZvuka(v.getJacinaZvuka()-1);
            }
        } else if (v.getJacinaZvuka() < 2){
            v.setJacinaZvuka(0);
        } else if (v.getJacinaZvuka() > 98) {
            v.setJacinaZvuka(100);
        }*/
    }
}
