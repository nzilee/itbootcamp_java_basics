package p_2_6_2022.Zadatak3;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;


    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer v) {
        double brzina = this.brzinaInterneta * 10.1;
        int kvalitet = 0;
        if (brzina <= 144){
            kvalitet = 144;
        } else if (brzina <= 240) {
            kvalitet = 240;
        } else if (brzina <= 480) {
            kvalitet = 480;
        } else if (brzina <= 720) {
            kvalitet = 720;
        } else if (brzina <= 1080) {
            kvalitet = 1080;
        }
        v.setKvalitetVidea(kvalitet);

        /*if (brzina <= 144){
            kvalitet = 144;
        } else if (brzina <= 240) {
            v.setKvalitetVidea(240);
        } else if (brzina <= 480) {
            v.setKvalitetVidea(480);
        } else if (brzina <= 720) {
            v.setKvalitetVidea(720);
        } else if (brzina <= 1080) {
            v.setKvalitetVidea(1080);
        }*/
    }
}
