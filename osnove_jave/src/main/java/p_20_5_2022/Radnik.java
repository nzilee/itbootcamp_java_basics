package p_20_5_2022;

public class Radnik {

    public String jmbg;
    public String imeIPrezime;
    public int brojDece;
    public int stepenSSpreme;
    public int godineRadnogStaza;

    public Radnik (){}

    public Radnik (String jmbg){
        this.jmbg = jmbg;
    }

    public Radnik (String jmbg, String imeIPrezime, int brojDece, int stepenSSpreme, int godineRadnogStaza){
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenSSpreme = stepenSSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public double minuliRad (){
        if (this.godineRadnogStaza <= 10){
            return 0.05;
        }
        if (this.godineRadnogStaza > 10 && this.godineRadnogStaza <= 20){
            return 0.075;
        }
        if (this.godineRadnogStaza > 20){
            return 0.1;
        }
        return -1;
    }

    public double koeficijentSlozenosti (){
        if (this.stepenSSpreme == 1){
            return 1.03;
        }
        if (this.stepenSSpreme == 2){
            return 1.65;
        }
        if (this.stepenSSpreme == 3){
            return 2.00;
        }
        if (this.stepenSSpreme == 4){
            return 2.27;
        }
        if (this.stepenSSpreme == 5){
            return 2.88;
        }
        if (this.stepenSSpreme == 6){
            return 3.09;
        }
        if (this.stepenSSpreme == 7){
            return 3.40;
        }
        if (this.stepenSSpreme == 8){
            return 4.12;
        }
        return -1;
    }

    public double plata (){
        return 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
    }

    public boolean jesteKreditnoSposoban (){
        if (this.plata() >= 50000){
            return true;
        }
        return false;
    }

    public int brojSlobodnihDana (){
        int slobodniDani = 22;
        if (brojDece > 0){
            for (int i = 0; i < brojDece; i++) {
                slobodniDani = slobodniDani + 2;
            }
            return slobodniDani;
        } return 22;
    }

}
