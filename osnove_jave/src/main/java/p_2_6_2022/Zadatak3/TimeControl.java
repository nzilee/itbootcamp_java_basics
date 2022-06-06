package p_2_6_2022.Zadatak3;

public class TimeControl extends Control{

    private boolean udesno;


    public TimeControl(boolean unapred) {
        this.udesno = unapred;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer v) {
        int buduceVreme = v.getTrenuntnoVremeVidea();
        if (udesno) {
            buduceVreme = buduceVreme + 15;
        } else {
            buduceVreme = buduceVreme - 15;
        }
        if (buduceVreme > v.getDuzinaVidea()) {
            buduceVreme = v.getDuzinaVidea();
        }
        if (buduceVreme < 0) {
            buduceVreme = 0;
        }
        v.setTrenuntnoVremeVidea(buduceVreme);

        /*if ((v.getTrenuntnoVremeVidea() + 15) < v.getDuzinaVidea() &&
                (v.getTrenuntnoVremeVidea() - 15) > v.getDuzinaVidea()){
            if (udesno){
                v.setTrenuntnoVremeVidea(v.getTrenuntnoVremeVidea()+15);
            } else {
                v.setTrenuntnoVremeVidea(v.getTrenuntnoVremeVidea()-15);
            }
        } else if ((v.getTrenuntnoVremeVidea() + 15) > v.getDuzinaVidea() - 14) {
            v.setTrenuntnoVremeVidea(v.getDuzinaVidea());
        } else if ((v.getTrenuntnoVremeVidea() - 15) < 14) {
            v.setTrenuntnoVremeVidea(0);
        }*/
    }
}
