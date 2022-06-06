package d_2_6_2022;

public class Magacioner extends Radnik{


    public Magacioner(String punoIme) {
        super(punoIme);
    }

    private double prosecnaPlataPoSektorima(){
        int suma = 0;
        int brSektora = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
            suma = suma + this.nizSektora.get(i).getPlata();
            brSektora++;
        }
        return (suma / brSektora) * 0.5;
    }

    @Override
    public double plataRadnika() {
        int brSektora = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
            brSektora++;
        }
        return this.prosecnaPlataPoSektorima() * brSektora;
    }
}
